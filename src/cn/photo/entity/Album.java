package cn.photo.entity;

import java.util.Date;

public class Album {
    private Integer aid;

    private Integer userid;

    private String albumdesc;

    private Integer photoid;

    private Integer typeid;

    private Integer totallook;

    private Integer 相册点赞总数;

    private Integer isopen;

    private Date addtime;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAlbumdesc() {
        return albumdesc;
    }

    public void setAlbumdesc(String albumdesc) {
        this.albumdesc = albumdesc == null ? null : albumdesc.trim();
    }

    public Integer getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getTotallook() {
        return totallook;
    }

    public void setTotallook(Integer totallook) {
        this.totallook = totallook;
    }

    public Integer get相册点赞总数() {
        return 相册点赞总数;
    }

    public void set相册点赞总数(Integer 相册点赞总数) {
        this.相册点赞总数 = 相册点赞总数;
    }

    public Integer getIsopen() {
        return isopen;
    }

    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}