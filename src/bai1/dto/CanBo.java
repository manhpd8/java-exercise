package bai1.dto;

// created by: manhpd
// created date: 6/17/2022 6:55 PM
public class CanBo {
    public String hoten;
    public String tuoi;
    public String gioiTinh;
    public String address;

    public CanBo(String hoten, String tuoi, String gioiTinh, String address) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.address = address;
    }

    public CanBo() {
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoten='" + hoten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
