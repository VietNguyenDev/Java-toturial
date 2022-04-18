package Bai1;
import java.util.Scanner;
public class KhachHang {
	private String hoTen;
	private String diaChi;
	private int sdt;
	private String email;
	public KhachHang() {
		super();
	}
	public KhachHang(String hoTen, String diaChi, int sdt, String email) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
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
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin khách hàng");
		System.out.println("Nhập họ tên khách hàng: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ khách hàng: ");
		this.diaChi = sc.nextLine();
		System.out.println("Nhập số điện thoại khách hàng: ");
		this.sdt = sc.nextInt();
		System.out.println("Nhập địa chỉ email: ");
		this.email = sc.nextLine();
		sc.close();
	}
	
	public void inTT() {
		System.out.println("-Họ và tên khách hàng: " + this.getHoTen());
		System.out.println("-Địa chỉ khách hàng: " + this.getDiaChi());
		System.out.println("-Số địa thoại khách hàng: " + this.getSdt());
		System.out.println("-Địa chỉ email khách hàng: " + this.getEmail());
	}
	
}
