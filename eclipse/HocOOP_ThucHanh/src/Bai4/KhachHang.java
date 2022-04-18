package Bai4;

public class KhachHang {
	protected String hoTen;
	protected int soNha;
	protected String maCongTo;
	public KhachHang() {
		super();
	}
	public KhachHang(String hoTen, int soNha, String maCongTo) {
		super();
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.maCongTo = maCongTo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoNha() {
		return soNha;
	}
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	public String getMaCongTo() {
		return maCongTo;
	}
	public void setMaCongTo(String maCongTo) {
		this.maCongTo = maCongTo;
	}
	
}
