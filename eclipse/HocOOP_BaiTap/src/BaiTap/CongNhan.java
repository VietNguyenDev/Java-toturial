package BaiTap;

public class CongNhan extends CanBo{
	private int bac;

	public CongNhan(int bac, String hoTen, int age, String gioiTinh, String diaChi) {
		super(hoTen, age, gioiTinh, diaChi);
		this.bac = bac;
	}

	public CongNhan() {
		super();
	}

	
}
