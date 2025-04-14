package org.example;
import java.util.ArrayList;

public class Sach {
    private String tenSach;
    private String tacGia;


    public Sach(String tenSach, String tacGia) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }


}

// Thêm sách vào thư viện
class ThuVien {
    private ArrayList<Sach> boSuutap;

    public ThuVien() {
        boSuutap = new ArrayList<>();
    }

    public void themSach(Sach sach) {
        boSuutap.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTenSach());
    }

    // Xoá sách
    public void xoaSach(String tenSach){
        boolean xoaTenSach = false;
        for (int i=0 ; i < boSuutap.size(); i++) {
            if (tenSach.equals(boSuutap.get(i).getTenSach())) {
                xoaTenSach = true;
                boSuutap.remove(boSuutap.get(i));
                System.out.println("Xoá" + boSuutap.get(i).getTenSach() + "thành công");
            }
        }System.out.println("Không tìm thấy sách có tên "+ tenSach);
    }

    // Hiển thị tất cả sách
    public void hienThiSach(){
        if (boSuutap.isEmpty()) {
            System.out.println("Thư viện hiện chưa có sách nào.");
        } else {
            System.out.println("Danh sách sách trong thư viện:");
            for (Sach sach : boSuutap) {
                System.out.println(sach.getTenSach());
            }
        }
    }
}
