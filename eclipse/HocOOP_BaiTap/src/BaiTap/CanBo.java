package BaiTap;

public class CanBo {
	private String hoTen;
	private int age;
	private String gioiTinh;
	private String diaChi;
	public CanBo() {
		super();
	}
	public CanBo(String hoTen, int age, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.age = age;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}
