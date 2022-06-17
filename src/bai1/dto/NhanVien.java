package bai1.dto;

// created by: manhpd
// created date: 6/17/2022 6:57 PM
public class NhanVien extends CanBo {
    public String congViec;

    public NhanVien(String hoten, String tuoi, String gioiTinh, String address, String congViec) {
        super(hoten, tuoi, gioiTinh, address);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
