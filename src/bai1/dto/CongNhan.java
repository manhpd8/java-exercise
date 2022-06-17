package bai1.dto;

// created by: manhpd
// created date: 6/17/2022 6:56 PM
public class CongNhan extends CanBo {
    public String bac;

    public CongNhan(String hoten, String tuoi, String gioiTinh, String address, String bac) {
        super(hoten, tuoi, gioiTinh, address);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac='" + bac + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
