package BaiTapDaGiac;

import java.util.Scanner;

public class TamGiac extends DaGiac {
	
	public TamGiac() {
		this.kichThuoc = new int[3];
		this.soCanh = 3;
	}
	@Override
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập các kích thước cho tam giác");
		System.out.println("Nhập giá trị các cạnh của tam giác:");
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập giá trị của cạnh thứ " + (i+1) + ":");
			this.kichThuoc[i] = sc.nextInt();
		}
	}
	@Override
	public int tinhChuVi() {
		int CV = 0;
		for (int i = 0; i < 3; i++) {
			CV += this.kichThuoc[i];
		}
		return CV;
	}
	
	@Override
	public void showKichThuoc() {
		System.out.println("Giá trị của các cạnh :");
		for (int i = 0; i < 3; i++) {
			System.out.println("Giá trị của cạnh thứ " + (i+1) + "là:" + this.kichThuoc[i]);
			
		}
	}
	
	public double tinhDienTich() {
		double DT = 0;
		double p = tinhChuVi() / 2;
		int A = this.kichThuoc[0];
		int B = this.kichThuoc[1];
		int C = this.kichThuoc[2];
		DT = Math.sqrt(p*(p-A)*(p-B)*(p-C));
		return DT;
	}
}
