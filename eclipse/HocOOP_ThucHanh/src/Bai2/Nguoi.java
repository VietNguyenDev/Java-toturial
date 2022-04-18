package Bai2;
import java.util.Scanner;
public class Nguoi {
	private String hoTen;
	private String diaChi;
	private int namSinh;
	public Nguoi() {
		super();
	}
	public Nguoi(String hoTen, String diaChi, int namSinh) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.namSinh = namSinh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin người");
		System.out.println("Nhập họ tên: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		this.diaChi = sc.nextLine();
		System.out.println("Nhập năm sinh: ");
		this.namSinh = sc.nextInt();
		sc.close();
	}	
	
	public void inTT() {
		System.out.println("- Họ tên : " + this.getHoTen());
		System.out.println("- Địa chỉ : " + this.getDiaChi());
		System.out.println("- Năm sinh: " + this.getNamSinh());
	}
}
