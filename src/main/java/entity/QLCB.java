package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBoList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        while (true) {
            System.out.println("1. Them can bo");
            System.out.println("2. Tim kiem can bo theo ten");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Xoa can bo theo ten");
            System.out.println("5. Thoat chuong trinh");
            String menu = scanner.nextLine();
            if (menu.equals("1")) {
                themCanBo();
            } else if (menu.equals("2")) {
                timKiemTheoHoTen();
            } else if (menu.equals("3")) {
                hienThiDSCB();
            } else if (menu.equals("4")) {
                xoaCanBoTheoTen();
            } else if (menu.equals("5")) {
                return;
            } else {
                System.out.println("Vui long chon dung chuc nang");
            }
        }
    }

    public void timKiemTheoHoTen(){
        System.out.println("Nhap vao ho ten can tim: ");
        String hoTen = scanner.nextLine();
        for (CanBo canBo : canBoList) {
            if (canBo.hoTen.equals(hoTen)){
                System.out.println("canBo = " + canBo);
            }
        }
    }

    public void hienThiDSCB(){
        System.out.println("Danh sach can bo: ");
        for (CanBo canBo : canBoList) {
            System.out.println(canBo);
        }
    }

    public void xoaCanBoTheoTen(){
        System.out.println("Nhap vao ten can bo can xoa: ");
        String ten = scanner.nextLine();
        canBoList.removeIf(canBo -> canBo.hoTen.contains(ten));
    }

    public void themCanBo(){
        System.out.println("Chon loai can bo muon them: ");
        System.out.println("1. Cong nhan");
        System.out.println("2. Nhan vien");
        System.out.println("3. Ky su");
        String menu = scanner.nextLine();
        if (menu.equals("1")){
            CongNhan congNhan = nhapVaoCongNhan();
            canBoList.add(congNhan);
        } else if (menu.equals("2")) {
            KySu kySu = nhapVaoKySu();
            canBoList.add(kySu);
        } else if (menu.equals("3")) {
            NhanVien nhanVien = nhapVaoNhanVien();
            canBoList.add(nhanVien);
        } else {
            System.out.println("Vui long chon dung loai can bo");
        }
    }

    private CongNhan nhapVaoCongNhan(){
        System.out.println("Moi ban nhap vao thong tin cong nhan: ");
        System.out.println("Nhap vao ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhap vao tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Chon gioi tinh: ");
        System.out.println("1. Nam");
        System.out.println("2. Nu");
        System.out.println("3. Khac");
        String menu = scanner.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")){
            gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.NU;
        } else {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhap vao dia chi:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap vao bac");
        int bac = Integer.parseInt(scanner.nextLine());
        return new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
    }

    private KySu nhapVaoKySu(){
        System.out.println("Moi ban nhap vao thong tin cong nhan: ");
        System.out.println("Nhap vao ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhap vao tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Chon gioi tinh: ");
        System.out.println("1. Nam");
        System.out.println("2. Nu");
        System.out.println("3. Khac");
        String menu = scanner.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")){
            gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.NU;
        } else {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhap vao dia chi:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap vao nganh dao tao: ");
        String nganhDaoTao = scanner.nextLine();
        return new KySu(hoTen, tuoi ,gioiTinh, diaChi, nganhDaoTao);
    }

    private NhanVien nhapVaoNhanVien(){
        System.out.println("Moi ban nhap vao thong tin cong nhan: ");
        System.out.println("Nhap vao ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhap vao tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Chon gioi tinh: ");
        System.out.println("1. Nam");
        System.out.println("2. Nu");
        System.out.println("3. Khac");
        String menu = scanner.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")){
            gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.NU;
        } else {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhap vao dia chi:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap vao cong viec: ");
        String congViec = scanner.nextLine();
        return new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
    }
}
