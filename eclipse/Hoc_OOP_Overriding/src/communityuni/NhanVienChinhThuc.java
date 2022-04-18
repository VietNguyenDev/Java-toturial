package communityuni;

public class NhanVienChinhThuc extends NhanVien {

	@Override
	public void tinhLuong(int ngayCong) {
		// TODO Auto-generated method stub
		if(ngayCong < 20)
			System.out.println("5 triệu");
		else 
			System.out.println("20 triệu");
	}

}
