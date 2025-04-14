package org.example;

import java.util.ArrayList;

public class Book {
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double price;

    public Book(String tenSach, String tacGia, int namXuatBan, double price) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.price = price;
    }
    public String getTenSach() {
        return tenSach;
    }
    public String getTacGia() {
        return tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public double getPrice() {
        return price;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getGiaSauGiam(double phanTramGiam) {
        double soTienGiam = price * (phanTramGiam / 100);
        return price - soTienGiam;
    }

}
class TacGia{
    private String tacGia;
    private int ngaySinh;
    public TacGia(String tacGia, int ngaySinh) {
        this.tacGia = tacGia;
        this.ngaySinh = ngaySinh;
    }
    public String getTacGia() {
        return tacGia;
    }
    public int getNgaySinh() {
        return ngaySinh;
    }
    private ArrayList<Book> boSuutap;
    public TacGia() {
        boSuutap = new ArrayList<>();
    }
    public void hienThiSach (){
        for(Book book : boSuutap){
            if(book.getTacGia().equals(this.tacGia)){
                System.out.println("Cuốn sách" + book.getTenSach()+"có tác giả là"+ this.tacGia);
            }
        }
    }
}


class DanhSach {
    private ArrayList<Book> boSuutap;
    public DanhSach() {
        boSuutap = new ArrayList<Book>();
    }
    public void addSach(Book book) {
        boSuutap.add(book);
    }
    public void hienThiSach (){
        for (Book book : boSuutap) {
            System.out.println(book.getTenSach());
        }
        for (int i = 0; i < boSuutap.size(); i++) {
            Book book1 = boSuutap.get(i);
            for (int j = i + 1; j < boSuutap.size(); j++) {
                Book book2 = boSuutap.get(j);
                if (book1.getNamXuatBan()== book2.getNamXuatBan()) {
                    System.out.println("Cuốn sách " + book1.getTenSach() + "có cùng năm xuất bản với cuốn " + book2.getTenSach());
                }
            }


        }

    }



}

