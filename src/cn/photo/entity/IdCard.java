package cn.photo.entity;

public class IdCard {
    private Integer cid;

    private Integer userid;

    private String cardno;

    private String realname;

    private String cardfront;

    private String cardverso;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getCardfront() {
        return cardfront;
    }

    public void setCardfront(String cardfront) {
        this.cardfront = cardfront == null ? null : cardfront.trim();
    }

    public String getCardverso() {
        return cardverso;
    }

    public void setCardverso(String cardverso) {
        this.cardverso = cardverso == null ? null : cardverso.trim();
    }
}