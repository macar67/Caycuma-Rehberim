package com.muhammetacar.benimcaycumam.Models;

public class Eczane {
    private String ilceIsmi;
    private String eczaneTarih;
    private EczaneDetay eczaneDetay;


    public String getIlceIsmi() {
        return ilceIsmi;
    }

    public void setIlceIsmi(String ilceIsmi) {
        this.ilceIsmi = ilceIsmi;
    }

    public String getEczaneTarih() {
        return eczaneTarih;
    }

    public void setEczaneTarih(String eczaneTarih) {
        this.eczaneTarih = eczaneTarih;
    }

    public EczaneDetay getEczaneDetay() {
        return eczaneDetay;
    }

    public void setEczaneDetay(EczaneDetay eczaneDetay) {
        this.eczaneDetay = eczaneDetay;

    }

    @Override
    public String toString() {
        return "Eczane{" +
                "ilceIsmi='" + ilceIsmi + '\'' +
                ", eczaneTarih='" + eczaneTarih + '\'' +
                ", eczaneDetay=" + eczaneDetay +
                '}';
    }
}
