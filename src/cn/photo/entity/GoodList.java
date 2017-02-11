package cn.photo.entity;

import java.util.Date;

public class GoodList {
    private Integer gid;

    private Integer userid;

    private Integer albumid;

    private String nickname;

    private Date goodtime;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getGoodtime() {
        return goodtime;
    }

    public void setGoodtime(Date goodtime) {
        this.goodtime = goodtime;
    }
}