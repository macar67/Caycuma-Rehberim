package com.muhammetacar.benimcaycumam;

public class CamiListe {

    private String camiIsmi;
    private String camiAciklama;
    private  int resimId;

    public CamiListe(String camiIsmi, String camiAciklama, int resimId) {
        this.camiIsmi = camiIsmi;
        this.camiAciklama = camiAciklama;
        this.resimId = resimId;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }

    public String getCamiIsmi() {
        return camiIsmi;
    }

    public void setCamiIsmi(String camiIsmi) {
        this.camiIsmi = camiIsmi;
    }

    public String getCamiAciklama() {
        return camiAciklama;
    }

    public void setCamiAciklama(String camiAciklama) {
        this.camiAciklama = camiAciklama;
    }
}
