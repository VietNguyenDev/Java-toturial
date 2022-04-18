package testcommunityuni;

import java.util.Scanner;

import communityuni.NhanVien;

public class testNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1;
		NhanVien nv2 ;
		System.out.println("Moi ban nhap thong tin nhan vien 1:");
		System.out.println("Nhap ho:");
		String ho1 = new Scanner(System.in).nextLine();
		System.out.println("Nhap ten:");
		String ten1 = new Scanner(System.in).nextLine();
		System.out.println("So san pham: ");
		int soSp1 = new Scanner(System.in).nextInt();
		nv1 = new NhanVien(ho1, ten1, soSp1);
		
		System.out.println("Moi ban nhap thong tin nhan vien 2:");
		System.out.println("Nhap ho:");
		String ho2 = new Scanner(System.in).nextLine();
		System.out.println("Nhap ten:");
		String ten2 = new Scanner(System.in).nextLine();
		System.out.println("So san pham: ");
		int soSp2 = new Scanner(System.in).nextInt();
		nv2 = new NhanVien(ho2, ten2, soSp2);
		
		System.out.println("Luong cua nhan vien 1 = " + nv1.getLuong());
		System.out.println("Luong cua nhan vien 2 = " + nv2.getLuong());
		
		if (nv1.lonHon(nv2)) {
			System.out.println("Nhan vien (" + nv1.getHo() + " " + nv1.getTen() + ") co nhieu so sp hon");
			System.out.println("Cu the:" + (nv1.getSoSp() - nv2.getSoSp())+ " so sp");
		}
	}

}
