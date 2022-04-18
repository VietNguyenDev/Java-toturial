package Cau1;

public class Student extends Person {
	private int maSV;
	private String email;
	private double diemTK;

	public Student() {
		super();
	}

	public Student(int maSV, String email, double diemTK, String hoTen, int ngaysinh, String diaChi, String gioiTinh) {
		super(hoTen, ngaysinh, diaChi, gioiTinh);
		this.maSV = maSV;
		this.email = email;
		this.diemTK = diemTK;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getDiemTK() {
		return diemTK;
	}

	public void setDiemTK(double diemTK) {
		this.diemTK = diemTK;
	}

	public void xuatTT() {
		System.out.println("Họ tên sinh viên: " + this.getHoTen());
		System.out.println("Ngày sinh: " + this.getNgaysinh());
		System.out.println("Địa chỉ: " + this.getDiaChi());
		System.out.println("Giới tính: " + this.getGioiTinh());
		System.out.println("Mã sinh viên: " + this.getMaSV());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Điểm tổng kết: " + this.getDiemTK());
	}
}
