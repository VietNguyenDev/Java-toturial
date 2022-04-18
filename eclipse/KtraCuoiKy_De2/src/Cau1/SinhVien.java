package Cau1;

public class SinhVien extends Person {
	private String chuyenNganh;
	private double diemQT;
	private double diemTP;
	
	public SinhVien() {
		super();
	}

	public SinhVien(String chuyenNganh, double diemQT, double diemTP,String hoTen, int ngaySinh, String diaChi, String gioiTinh) {
		super(hoTen, ngaySinh,diaChi,gioiTinh);
		this.chuyenNganh = chuyenNganh;
		this.diemQT = diemQT;
		this.diemTP = diemTP;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public double getDiemQT() {
		return diemQT;
	}

	public void setDiemQT(double diemQT) {
		this.diemQT = diemQT;
	}

	public double getDiemTP() {
		return diemTP;
	}

	public void setDiemTP(double diemTP) {
		this.diemTP = diemTP;
	}
	
	public double diemTongKet() {
		return this.diemQT * 0.3 + this.diemTP * 0.7;	
	}
	
	public void xepHang() {
		if (diemTongKet() < 4) {
			System.out.println("Xếp hạng F");
		} else if(diemTongKet() > 4 && diemTongKet() < 5 ) {
			System.out.println("Xếp hạng D");
		} else if(diemTongKet() >= 5 && diemTongKet() < 6) {
			System.out.println("Xếp hạng C");
		} else if(diemTongKet() >= 6 && diemTongKet() < 8.5) {
			System.out.println("Xếp hạng B");
		} else {
			System.out.println("Xếp hạng A");
		}
	}
	
	
	
}
