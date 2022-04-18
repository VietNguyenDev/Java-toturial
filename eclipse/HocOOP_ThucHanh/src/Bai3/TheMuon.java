package Bai3;
import java.util.Scanner;
public class TheMuon extends SinhVien {
	private int soPhieuMuon;
	private int ngayMuon;
	private int hanTra;
	private int soHieuSach;
	public TheMuon() {
		super();
	}
	public TheMuon(int soPhieuMuon, int ngayMuon, int hanTra, int soHieuSach,String hoTen,int namSinh, int tuoi, String lop) {
		super(hoTen, namSinh, tuoi, lop);
		this.soPhieuMuon = soPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.soHieuSach = soHieuSach;
	}
	public int getSoPhieuMuon() {
		return soPhieuMuon;
	}
	public void setSoPhieuMuon(int soPhieuMuon) {
		this.soPhieuMuon = soPhieuMuon;
	}
	public int getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(int ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	public int getHanTra() {
		return hanTra;
	}
	public void setHanTra(int hanTra) {
		this.hanTra = hanTra;
	}
	public int getSoHieuSach() {
		return soHieuSach;
	}
	public void setSoHieuSach(int soHieuSach) {
		this.soHieuSach = soHieuSach;
	}
	
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin thẻ mượn: ");
		System.out.println("Họ tên sinh viên: ");
		this.hoTen = sc.nextLine();
		System.out.println("Năm sinh sinh viên: ");
		this.namSinh = sc.nextInt();
		System.out.println("Tuổi sinh viên: ");
		this.tuoi = sc.nextInt();
		System.out.println("Lớp : ");
		this.lop = sc.nextLine();
		System.out.println("Số phiếu mượn: ");
		this.soPhieuMuon = sc.nextInt();
		System.out.println("Ngày mượn: ");
		this.ngayMuon = sc.nextInt();
		System.out.println("Hạn trả: ");
		this.hanTra = sc.nextInt();
		System.out.println("Số hiệu sách : ");
		this.soHieuSach = sc.nextInt();
		sc.close();
	}
	
	public void inTT() {
		System.out.println("Thông tin thẻ thư viện: ");
		System.out.println(this.getHoTen());
		System.out.println(this.getNamSinh());
		System.out.println(this.getTuoi());
		System.out.println(this.getLop());
		System.out.println(this.getSoPhieuMuon());
		System.out.println(this.getNgayMuon());
		System.out.println(this.getHanTra());
		System.out.println(this.getSoHieuSach());
	}
	
}
