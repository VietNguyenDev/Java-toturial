package testcommunityuni;

import communityuni.HinhChuNhat;
import communityuni.HinhHoc;
import communityuni.HinhVuong;

public class testHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h;
		h = new HinhChuNhat(4,5);
		System.out.println("Chu vi = " + h.tinhChuVi());
		System.out.println("Diện tích = " + h.tinhDienTich());
		
		h = new HinhVuong(5);
		System.out.println("Chu vi = " + h.tinhChuVi());
		System.out.println("Diện tích = " + h.tinhDienTich());
	}

}
