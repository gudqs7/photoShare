package cn.photo.entity;

import java.util.Date;
import java.util.List;

public class Album {
    private Integer aid;

    private Integer userid;

    private String albumdesc;

    private Integer photoid;

    private Integer typeid;

    private Integer totallook;

    private Integer totalgood;

    private Integer isopen;

    private Date addtime;

    private List<GoodList> goods;
    
    public List<GoodList> getGoods() {
		return goods;
	}

	public void setGoods(List<GoodList> goods) {
		this.goods = goods;
	}

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

    public Integer getTotalgood() {
        return totalgood;
    }

    public void setTotalgood(Integer totalgood) {
        this.totalgood = totalgood;
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