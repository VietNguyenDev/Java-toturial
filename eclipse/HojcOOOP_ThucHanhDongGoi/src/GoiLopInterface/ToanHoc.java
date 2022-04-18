package GoiLopInterface;

import java.util.Scanner;

public class ToanHoc {
	protected int n;

	public ToanHoc() {
		super();
	}

	public ToanHoc(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public static boolean ktraNguyenTo(int k) {
		if (k < 2) 
			return false;
		
		int canHai = (int) Math.sqrt(k);
		for (int i = 2; i <= canHai; i++) { 
			if (k % i == 0) 
				return false;
		}
		
		return true;	
	}
	
	public static boolean ktraHoanHao(int n) {
		int sum = 0;
		for (int i = 1; i <= n/2; i++) { //Ước của n luôn nhỏ hơn n/2
			if ( n % i == 0) {
				sum += i;
			}
		}
		
		if (sum == n)
			return true;
		return false;
	}
	
	public static boolean ktraSoChinhPhuong(int n) {
		double sq = Math.sqrt(n);
		if (sq - Math.floor(sq) == 0)
			return true;
		return false;
	}
	
	public void nhapN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n :");
		this.n = sc.nextInt();
	}
	
	public void xuat() {
		
	}
	
}
