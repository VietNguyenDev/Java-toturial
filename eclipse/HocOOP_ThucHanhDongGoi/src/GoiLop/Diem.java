package GoiLop;

public class Diem {
	private double x;
	private double y;
	public Diem() {
		super();
	}
	public Diem(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void inTTDiem() {
		System.out.println("Hoành độ của điểm là: " + this.getX());
		System.out.println("Tung độ của điểm là: " + this.getY());
	}
	
}
