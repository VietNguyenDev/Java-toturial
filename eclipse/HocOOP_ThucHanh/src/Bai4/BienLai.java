package Bai4;
import java.util.Scanner;
public class BienLai extends KhachHang {
	private int chiSoCu;
	private int chiSoMoi;
	public BienLai() {
		super();
	}
	public BienLai(int chiSoCu, int chiSoMoi, String hoTen, int soNha, String maCongTo) {
		super(hoTen, soNha, maCongTo);
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		
	}
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	
	public float soTienTra() {
		return (this.getChiSoMoi() - this.getChiSoCu()) * 850000;
	
	}
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin khách hàng: ");
		System.out.println("Họ tên khách hàng: ");
		this.hoTen = sc.nextLine();
		System.out.println("Số nhà khách hàng: ");
		this.soNha = sc.nextInt();
		sc.nextLine();
		System.out.println("Mã công tơ của khách hàng: ");
		this.maCongTo = sc.nextLine();
		System.out.println("Chỉ số mới: ");
		this.chiSoMoi = sc.nextInt();
		System.out.println("Chỉ số cũ: ");
		this.chiSoCu = sc.nextInt();
		sc.close();
	}
	
	public void inTT() {
		System.out.println("Họ tên khách hàng: " + this.getHoTen());
		System.out.println("Số nhà khách hàng: " + this.getSoNha());
		System.out.println("Mã công tơ khách hàng: " + this.getMaCongTo());
		System.out.println("Chỉ số mới: " + this.getChiSoMoi());
		System.out.println("Chỉ số cũ: " + this.getChiSoCu());
		System.out.println("Số tiền phải trả: " + this.soTienTra());
	}
	
	
}
