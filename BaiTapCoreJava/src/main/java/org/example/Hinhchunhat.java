package org.example;

public class Hinhchunhat {
    double chieuDai;
    double chieuRong;

    public Hinhchunhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void dienTich(){
        System.out.println("Diện tích hình chũ nhật =" + chieuRong*chieuDai);
    }
    public void chuVi(){
        System.out.println("Chu vi hình chữ nhật =" + (chieuRong+chieuDai)*2);
    }
}
