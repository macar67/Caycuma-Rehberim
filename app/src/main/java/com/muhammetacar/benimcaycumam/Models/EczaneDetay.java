package com.muhammetacar.benimcaycumam.Models;

public class EczaneDetay {

    private String eczaneIsmi;
    private String adres;
    private String tel;

    public String getEczaneIsmi() {
        return eczaneIsmi;
    }

    public void setEczaneIsmi(String eczaneIsmi) {
        this.eczaneIsmi = eczaneIsmi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "EczaneDetay{" +
                "eczaneIsmi='" + eczaneIsmi + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
