package HinhHoc;

public class Circle {
	private float Radius;
	private String Color;
	public float getRadius() {
		return Radius;
	}
	public void setRadius(float radius) {
		Radius = radius;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Circle(float radius, String color) {
		super();
		Radius = radius;
		Color = color;
	}
	public Circle() {
		super();
	}
	
	
}
