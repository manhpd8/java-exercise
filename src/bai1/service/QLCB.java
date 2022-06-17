package bai1.service;

import bai1.dto.CanBo;
import bai1.dto.CongNhan;
import bai1.dto.KySu;
import bai1.dto.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// created by: manhpd
// created date: 6/17/2022 6:58 PM
public class QLCB {
    int luaChon;
    Scanner sin = new Scanner(System.in);
    public boolean themCanBo(List<CanBo> listCanBo) {
        CanBo canBo = null;
        System.out.println("Them moi can bo");
        Scanner sin = new Scanner(System.in);
        System.out.println("1 CongNhan, 2 KySu, 3 NhanVien ");
        int chonCB = Integer.parseInt(sin.nextLine());
        System.out.print("ho ten:");
        String hoten = sin.nextLine();
        System.out.print("tuoi:");
        String tuoi = sin.nextLine();
        System.out.print("gioi tinh:");
        String gioitinh = sin.nextLine();
        System.out.print("dia chi:");
        String diachi = sin.nextLine();
        switch (chonCB){
            case 1:
                System.out.print("bo: ");
                String bac = sin.nextLine();
                canBo =  new CongNhan(hoten, tuoi, gioitinh, diachi, bac);
                break;
            case 2:
                System.out.print("nganhDaoTao: ");
                String nganhDaoTao = sin.nextLine();
                canBo =  new KySu(hoten, tuoi, gioitinh, diachi, nganhDaoTao);
                break;
            case 3:
                System.out.print("cong viec: ");
                String conviec = sin.nextLine();
                canBo =  new KySu(hoten, tuoi, gioitinh, diachi, conviec);
                break;
        }

        listCanBo.add(canBo);
        return true;
    }

    public void searchCanBo(List<CanBo> listCanBo, String ten) {
        if(listCanBo == null || listCanBo.size() < 1) return;
        ten = ten.trim().toLowerCase();
        for (CanBo canBo : listCanBo) {
            if(canBo.hoten.toLowerCase().contains(ten)) {
                System.out.println(canBo);
            }
        }
    }

    public void viewAllCanBo(List<CanBo> listCanBo) {
        if(listCanBo == null || listCanBo.size() < 1) return;
        for (CanBo canBo : listCanBo) {
            System.out.println(canBo);
            //convertOb(canBo);
        }
    }

    public void convertOb(CanBo cb) {
        String className = cb.getClass().getName();
        if(className.equals(NhanVien.class.getName())) {
            NhanVien a = (NhanVien) cb;
            System.out.println(a);
        }
        if(className.equals(CongNhan.class.getName())) {
            CongNhan a = (CongNhan) cb;
            System.out.println(a);
        }
        if(className.equals(KySu.class.getName())) {
            KySu a = (KySu) cb;
            System.out.println(a);
        }
    }
}
