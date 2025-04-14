package org.example;

public class Main03 {
    public static void main(String[] args) {
        DanhSach danhsach = new DanhSach();
        Book book1 = new Book("Tắt đèn", "Vũ Trọng Phụng",1960,230.000);
        Book book2 = new Book("Truyện Kiều","Nguyễn Du",1970,239.000);
        Book book3 = new Book("Số Đỏ","Vũ Trọng Phụng",1980,56.000);
        Book book4 = new Book("Những ngày thơ ấu","Nguyên Hồng",1970,145.000);
        Book book5 = new Book("Vợ Nhặt","Kim Lân",1990,1234.000);
        danhsach.addSach(book1);
        danhsach.addSach(book2);
        danhsach.addSach(book3);
        danhsach.addSach(book4);
        danhsach.addSach(book5);

        System.out.println("Danh sách các quyển sách");
        danhsach.hienThiSach();

        double giaDaGiam = book1.getGiaSauGiam(10);  // giảm 10%
        System.out.println("Giá sau khi giảm: " + giaDaGiam + " VND");
    }
}
