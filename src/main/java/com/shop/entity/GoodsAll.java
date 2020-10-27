package com.shop.entity;

public class GoodsAll {
    private Integer gid;
    private Integer cid;
    private Integer eid;
    private Integer iid;
    private Integer sid;

    private String gname;

    private Object oprice;

    private Object nprice;

    private String texture;

    private String model;

    private Integer size;

    private String color;

    private String picture;

    private String content;

    @Override
    public String toString() {
        return "GoodsAll{" +
                "gid=" + gid +
                ", cid=" + cid +
                ", eid=" + eid +
                ", iid=" + iid +
                ", sid=" + sid +
                ", gname='" + gname + '\'' +
                ", oprice=" + oprice +
                ", nprice=" + nprice +
                ", texture='" + texture + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", picture='" + picture + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public GoodsAll() {
    }

    public GoodsAll(Integer gid, Integer cid, Integer eid, Integer iid, Integer sid, String gname, Object oprice, Object nprice, String texture, String model, Integer size, String color, String picture, String content) {
        this.gid = gid;
        this.cid = cid;
        this.eid = eid;
        this.iid = iid;
        this.sid = sid;
        this.gname = gname;
        this.oprice = oprice;
        this.nprice = nprice;
        this.texture = texture;
        this.model = model;
        this.size = size;
        this.color = color;
        this.picture = picture;
        this.content = content;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Object getOprice() {
        return oprice;
    }

    public void setOprice(Object oprice) {
        this.oprice = oprice;
    }

    public Object getNprice() {
        return nprice;
    }

    public void setNprice(Object nprice) {
        this.nprice = nprice;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
