package cn.photo.entity;

import java.util.Date;
import java.util.List;

public class Member {
    private Integer uid;

    private String nickname;

    private String sex;

    private String phone;

    private String pwd;

    private Date registtime;
    
    private IdCard idcard;
    
    private List<Collection> collections;
    
    private List<Album> albums;

    public List<Album> getAlbums() {
		return albums;
	}

	@Override
	public String toString() {
		return "Member [uid=" + uid + ", nickname=" + nickname + ", sex=" + sex + ", phone=" + phone + ", pwd=" + pwd
				+ ", registtime=" + registtime + ", idcard=" + idcard + ", collections=" + collections + ", albums="
				+ albums + "]";
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	public IdCard getIdcard() {
		return idcard;
	}

	public void setIdcard(IdCard idcard) {
		this.idcard = idcard;
	}

	public List<Collection> getCollections() {
		return collections;
	}

	public void setCollections(List<Collection> collections) {
		this.collections = collections;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }
}