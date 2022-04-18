package BaiTap;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien() {
		super();
	}

	public NhanVien(String congViec, String hoTen, int age, String gioiTinh, String diaChi) {
		super(hoTen, age, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	
}
