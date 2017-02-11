/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/2/11 20:10:59                           */
/*==============================================================*/


drop table if exists IDCard;

drop index nickname on Member;

drop index phone on Member;

drop table if exists Member;

drop index Relationship_9_FK on album;

drop table if exists album;

drop index Relationship_3_FK on collection;

drop table if exists collection;

drop index Relationship_8_FK on comment;

drop table if exists comment;

drop index Relationship_4_FK on goodlist;

drop table if exists goodlist;

drop index Relationship_5_FK on photo;

drop table if exists photo;

drop index Relationship_7_FK on reply;

drop table if exists reply;

drop table if exists type;

/*==============================================================*/
/* Table: IDCard                                                */
/*==============================================================*/
create table IDCard
(
   cid              	int primary key auto_increment not null,
   userid               int not null,
   cardno               varchar(18) not null,
   realname             varchar(10) not null,
   cardfront            varchar(30) not null,
   cardverso            varchar(30) not null
);

/*==============================================================*/
/* Table: Member                                                */
/*==============================================================*/
create table Member
(
   uid                  int primary key auto_increment not null,
   nickName             varchar(24) not null,
   sex                  varchar(2) not null,
   phone                varchar(11) not null,
   pwd                  varchar(16) not null,
   registTime           datetime not null
);

/*==============================================================*/
/* Index: phone                                                 */
/*==============================================================*/
create unique index phone on Member
(
   phone
);

/*==============================================================*/
/* Index: nickname                                              */
/*==============================================================*/
create unique index nickname on Member
(
   nickName
);

/*==============================================================*/
/* Table: album                                                 */
/*==============================================================*/
create table album
(
   aid                  int primary key auto_increment not null,
   userid               int not null,
   albumdesc            varchar(400),
   photoid              int,
   typeid               int not null,
   totallook            int not null,
   相册点赞总数               int not null,
   isopen               int not null,
   addTime              datetime
);

/*==============================================================*/
/* Index: Relationship_9_FK                                     */
/*==============================================================*/
create index Relationship_9_FK on album
(
   userid,
   photoid
);

/*==============================================================*/
/* Table: collection                                            */
/*==============================================================*/
create table collection
(
   coid                 int primary key auto_increment not null,
   albumid              int not null,
   userid               int not null,
   collectdate          datetime not null
);

/*==============================================================*/
/* Index: Relationship_3_FK                                     */
/*==============================================================*/
create index Relationship_3_FK on collection
(
   albumid,
   userid
);

/*==============================================================*/
/* Table: comment                                               */
/*==============================================================*/
create table comment
(
   mid                  int primary key auto_increment not null,
   userid               int not null,
   albumid              int not null,
   addTime              datetime not null,
   content              varchar(280) not null,
   ding                 int,
   cai                  int
);

/*==============================================================*/
/* Index: Relationship_8_FK                                     */
/*==============================================================*/
create index Relationship_8_FK on comment
(
   userid,
   albumid
);

/*==============================================================*/
/* Table: goodlist                                              */
/*==============================================================*/
create table goodlist
(
   gid                  int primary key auto_increment not null,
   userid               int not null,
   albumid              int not null,
   nickName             varchar(24) not null,
   goodTime             datetime not null
);

/*==============================================================*/
/* Index: Relationship_4_FK                                     */
/*==============================================================*/
create index Relationship_4_FK on goodlist
(
   userid,
   albumid
);

/*==============================================================*/
/* Table: photo                                                 */
/*==============================================================*/
create table photo
(
   pid                  int primary key auto_increment not null,
   albumid              int not null,
   location             varchar(30) not null,
   addTime              datetime not null
);

/*==============================================================*/
/* Index: Relationship_5_FK                                     */
/*==============================================================*/
create index Relationship_5_FK on photo
(
   albumid
);

/*==============================================================*/
/* Table: reply                                                 */
/*==============================================================*/
create table reply
(
   rid                  int primary key auto_increment not null,
   content              varchar(280) not null,
   replyTime            datetime not null,
   userid               int not null,
   commentid            int not null
);

/*==============================================================*/
/* Index: Relationship_7_FK                                     */
/*==============================================================*/
create index Relationship_7_FK on reply
(
   userid,
   commentid
);

/*==============================================================*/
/* Table: type                                                  */
/*==============================================================*/
create table type
(
   tid                  int primary key auto_increment not null,
   typename             varchar(20) not null
);

alter table IDCard add constraint FK_member_idcard foreign key (userid)
      references Member (uid) on delete restrict on update restrict;

alter table album add constraint FK_member_album foreign key (userid)
      references Member (uid) on delete restrict on update restrict;

alter table album add constraint FK_photo_album foreign key (photoid)
      references photo (pid) on delete restrict on update restrict;

alter table album add constraint FK_type_album foreign key (typeid)
      references type (tid) on delete restrict on update restrict;

alter table collection add constraint FK_album_collection foreign key (albumid)
      references album (aid) on delete restrict on update restrict;

alter table collection add constraint FK_member_collection foreign key (userid)
      references Member (uid) on delete restrict on update restrict;

alter table comment add constraint FK_album_comment foreign key (albumid)
      references album (aid) on delete restrict on update restrict;

alter table comment add constraint FK_member_comment foreign key (userid)
      references Member (uid) on delete restrict on update restrict;

alter table goodlist add constraint FK_album_good foreign key (albumid)
      references album (aid) on delete restrict on update restrict;

alter table goodlist add constraint FK_member_goodlist foreign key (userid)
      references Member (uid) on delete restrict on update restrict;

alter table photo add constraint FK_album_photo foreign key (albumid)
      references album (aid) on delete restrict on update restrict;

alter table reply add constraint FK_comment_reply foreign key (commentid)
      references comment (mid) on delete restrict on update restrict;

alter table reply add constraint FK_member_reply foreign key (userid)
      references Member (uid) on delete restrict on update restrict;

