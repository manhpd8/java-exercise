import bai1.dto.CanBo;
import bai1.service.QLCB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// created by: manhpd
// created date: 6/17/2022 6:54 PM
public class bai1 {
    public static void main(String[] args) {
        int luaChon;
        Scanner sin = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        List<CanBo> canBos = new ArrayList<>();
        do {
            System.out.println("1 Thêm mới cán bộ.\n" +
                    "2 Tìm kiếm theo họ tên.\n" +
                    "3 Hiện thị thông tin về danh sách các cán bộ.\n" +
                    "4 Thoát khỏi chương trình.");
            String chon = sin.nextLine();
            luaChon = Integer.parseInt(chon);
            while (luaChon <0 || luaChon >4) {
                System.out.print("chọn lại: ");
                luaChon = Integer.parseInt(sin.nextLine());
            }

            switch (luaChon) {
                case 1:
                    qlcb.themCanBo(canBos);
                    break;
                case 2:
                    System.out.println("tên cần tìm:");
                    String tenTim = sin.nextLine();
                    qlcb.searchCanBo(canBos,tenTim);
                    break;
                case 3:
                    qlcb.viewAllCanBo(canBos);
                    break;
                case 0:
                    System.out.flush();
            }
        } while (luaChon != 4);
    }
}
