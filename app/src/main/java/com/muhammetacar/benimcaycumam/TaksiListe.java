package com.muhammetacar.benimcaycumam;

public class TaksiListe {

    private String name;
    private String tel;
    private String adres;

    public String getadres() {
        return adres;
    }

    public void setadres(String adres) {
        this.adres = adres;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaksiListe(String name, String tel,String adres) {
        this.name = name;
        this.tel = tel;
        this.adres = adres;
    }
}
