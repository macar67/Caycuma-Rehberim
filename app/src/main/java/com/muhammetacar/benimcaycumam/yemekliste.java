package com.muhammetacar.benimcaycumam;

public class yemekliste {
    private String Name;
    private String Tarz;
    private  int resimIdyemek;
    private  String telno;
    private String siparis;


    public yemekliste(String name, String tarz, int resimIdyemek, String telno, String siparis) {
        Name = name;
        Tarz = tarz;
        this.resimIdyemek = resimIdyemek;
        this.telno = telno;
        this.siparis = siparis;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTarz() {
        return Tarz;
    }

    public void setTarz(String tarz) {
        Tarz = tarz;
    }

    public int getResimIdyemek() {
        return resimIdyemek;
    }

    public void setResimIdyemek(int resimIdyemek) {
        this.resimIdyemek = resimIdyemek;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getSiparis() {
        return siparis;
    }

    public void setSiparis(String siparis) {
        this.siparis = siparis;
    }
}
