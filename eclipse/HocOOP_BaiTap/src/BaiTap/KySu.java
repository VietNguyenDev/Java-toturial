package BaiTap;

public class KySu extends CanBo{
	private String nganhDaoTao;

	public KySu() {
		super();
	}

	public KySu(String nganhDaoTao, String hoTen, int age, String gioiTinh, String diaChi) {
		super(hoTen, age, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	
}
