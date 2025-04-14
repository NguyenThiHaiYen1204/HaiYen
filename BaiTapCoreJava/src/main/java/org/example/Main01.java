package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main01 {
    public static void main(String[] args) {
        ThuVien thuVien = new ThuVien();

        Sach sach1 = new Sach("Dế Mèn Phiêu Lưu Ký", "Tô Hoài");
        Sach sach2 = new Sach("Tuổi Thơ Dữ Dội", "Phùng Quán");
        Sach sach3 = new Sach("Số đỏ","Vũ Trọng Phụng");
        Sach sach4 = new Sach("Chí Phèo","Nam Cao");
        System.out.println("BAI TAP 1");
        thuVien.themSach(sach1);
        thuVien.themSach(sach2);
        thuVien.themSach(sach3);
        thuVien.themSach(sach4);
        System.out.println();
        thuVien.hienThiSach();
        System.out.println();
        thuVien.xoaSach("ABC");
    }
}