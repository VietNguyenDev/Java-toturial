package testBai2;

import Bai2.Nguoi;

public class VanDung {

	public static void main(String[] args) {
		Nguoi ng1 = new Nguoi("Nguyễn Việt","Thái Bình",2001);
		ng1.inTT();
		
		Nguoi ng2 = new Nguoi();
		ng2.nhapTT();
		ng2.inTT();

	}

}
