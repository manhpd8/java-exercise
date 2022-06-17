package bai1.service;

import bai1.dto.CanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// created by: manhpd
// created date: 6/17/2022 6:58 PM
public class QLCB {
    int luaChon;
    Scanner sin = new Scanner(System.in);
    public boolean themCanBo(List<CanBo> listCanBo) {
        System.out.println("Them moi can bo");
        Scanner sin = new Scanner(System.in);
        System.out.print("ho ten:");
        String hoten = sin.nextLine();
        System.out.print("tuoi:");
        String tuoi = sin.nextLine();
        System.out.print("gioi tinh:");
        String gioitinh = sin.nextLine();
        System.out.print("dia chi:");
        String diachi = sin.nextLine();
        CanBo canBo =  new CanBo(hoten, tuoi, gioitinh, diachi);
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
        }
    }

}
