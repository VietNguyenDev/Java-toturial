package Cau1;

public class Person {
	private String hoTen;
	private int ngaysinh;
	private String diaChi;
	private String gioiTinh;

	public Person() {
		super();
	}

	public Person(String hoTen, int ngaysinh, String diaChi, String gioiTinh) {
		super();
		this.hoTen = hoTen;
		this.ngaysinh = ngaysinh;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(int ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

}
