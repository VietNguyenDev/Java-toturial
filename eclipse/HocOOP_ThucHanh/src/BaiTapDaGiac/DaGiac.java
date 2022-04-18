package BaiTapDaGiac;
import java.util.Scanner;

public class DaGiac {
	protected int soCanh;
	protected int kichThuoc[];
	public DaGiac() {
		super();
	}
	public DaGiac(int soCanh, int[] kichThuoc) {
		super();
		this.soCanh = soCanh;
		this.kichThuoc = kichThuoc;
	}
	public int getSoCanh() {
		return soCanh;
	}
	public void setSoCanh(int soCanh) {
		this.soCanh = soCanh;
	}
	public int[] getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(int[] kichThuoc) {
		this.kichThuoc = kichThuoc;
	}
	
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập các kích thước cho đa giác");
		do {
			System.out.println("Nhập số cạnh của đa giác");
			this.soCanh = sc.nextInt(); sc.nextLine();
		} while (this.soCanh <3);
		System.out.println("Nhập giá trị các cạnh của đa giác:");
		for (int i = 1; i <= this.soCanh; i++) {
			System.out.println("Nhập giá trị của cạnh thứ " + i + ":");
			this.kichThuoc[i] = sc.nextInt();
		}
	}
	
	public int tinhChuVi() {
		int CV = 0;
		for (int i = 1; i <= this.soCanh; i++) {
			CV += this.kichThuoc[i];
		}
		
		return CV;
	}
	
	public void showKichThuoc() {
		System.out.println("Giá trị của các cạnh :");
		for (int i = 1; i <= this.soCanh; i++) {
			System.out.println("Giá trị của cạnh thứ " + i + "là:" + this.kichThuoc[i]);
			
		}
	}
}
