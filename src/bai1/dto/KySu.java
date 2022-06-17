package bai1.dto;

// created by: manhpd
// created date: 6/17/2022 6:57 PM
public class KySu extends CanBo {
    public String nganhDaoTao;

    public KySu(String hoten, String tuoi, String gioiTinh, String address, String nganhDaoTao) {
        super(hoten, tuoi, gioiTinh, address);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
