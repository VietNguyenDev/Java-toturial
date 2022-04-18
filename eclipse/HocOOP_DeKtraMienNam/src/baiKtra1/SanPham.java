package baiKtra1;

public class SanPham {
	private String maSP;
	private String tenSP;
	private int donGia;
	private int ngaySX;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public int getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(int ngaySX) {
		this.ngaySX = ngaySX;
	}
	public SanPham(String maSP, String tenSP, int donGia, int ngaySX) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.ngaySX = ngaySX;
	}
	public SanPham() {
		super();
	}
	

}
