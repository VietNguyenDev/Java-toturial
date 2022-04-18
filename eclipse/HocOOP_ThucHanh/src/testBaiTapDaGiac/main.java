package testBaiTapDaGiac;

import BaiTapDaGiac.TamGiac;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac TG1 = new TamGiac();
		TG1.nhapTT();
		TG1.tinhChuVi();
		System.out.println("Diện tích tam giác : " + TG1.tinhDienTich());
	}

}
