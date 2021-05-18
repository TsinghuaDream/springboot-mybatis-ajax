package com.example.demo.entity;

import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String userpsw;

    private String useraddress;

    private String usertel;

    private Date userregdate;

    // 查询使用的字段
    //@DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    private Date userregdate2;

    private String userimg;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpsw() {
        return userpsw;
    }

    public void setUserpsw(String userpsw) {
        this.userpsw = userpsw == null ? null : userpsw.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public Date getUserregdate() {
        return userregdate;
    }

    public void setUserregdate(Date userregdate) {
        this.userregdate = userregdate;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }

    public Date getUserregdate2() {
        return userregdate2;
    }

    public void setUserregdate2(Date userregdate2) {
        this.userregdate2 = userregdate2;
    }

    @Override
    public String toString() {
        return "UserInfoBean{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpsw='" + userpsw + '\'' +
                ", useraddress='" + useraddress + '\'' +
                ", usertel='" + usertel + '\'' +
                ", userregdate=" + userregdate +
                ", userregdate2=" + userregdate2 +
                ", userimg='" + userimg + '\'' +
                '}';
    }
}
