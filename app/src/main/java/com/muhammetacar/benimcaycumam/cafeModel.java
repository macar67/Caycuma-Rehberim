package com.muhammetacar.benimcaycumam;

public class cafeModel {

    private int Resimid;
    private String cafeaIsim;
    private String cafeAdress;
    //private  String cafeTel;

    public cafeModel(int resimid, String cafeaIsim, String cafeAdress) {
        Resimid = resimid;
        this.cafeaIsim = cafeaIsim;
        this.cafeAdress = cafeAdress;
       // this.cafeTel = cafeTel;
    }

    public int getResimid() {
        return Resimid;
    }

    public void setResimid(int resimid) {
        Resimid = resimid;
    }

    public String getCafeaIsim() {
        return cafeaIsim;
    }

    public void setCafeaIsim(String cafeaIsim) {
        this.cafeaIsim = cafeaIsim;
    }

    public String getCafeAdress() {
        return cafeAdress;
    }

    public void setCafeAdress(String cafeAdress) {
        this.cafeAdress = cafeAdress;
    }

//   // public String getCafeTel() {
//        return cafeTel;
//    }
//
//    public void setCafeTel(String cafeTel) {
//        this.cafeTel = cafeTel;
//    }
}
