package communityuni;

public class NhanVien {
	private String ho;
	private String ten;
	private int soSp;
	public NhanVien(String ho, String ten, int soSp) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.soSp = soSp;
		if (soSp < 0)
			this.soSp = 0;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoSp() {
		return soSp;
	}
	public void setSoSp(int soSp) {
		this.soSp = soSp;
	}
	public double getLuong() {
		double donGia = 0;
		if (this.soSp <=199)
			donGia = 0.5;
		else if (this.soSp <= 399)
			donGia = 0.55;
		else if (this.soSp < 599)
			donGia = 0.6;
		else 
			donGia = 0.65;
		return donGia * this.soSp;
	}
	
	public Boolean lonHon(NhanVien nv2) {
		return this.soSp > nv2.soSp;
	}
}
