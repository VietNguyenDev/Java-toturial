package baiKtra1;

public class KhachHang {
	private int maKH;
	private String tenKH;
	private int namSinh;
	private String diaChi;
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public KhachHang(int maKH, String tenKH, int namSinh, String diaChi) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}
	public KhachHang() {
		super();
	}
	
	
}
