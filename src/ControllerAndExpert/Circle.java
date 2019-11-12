package ControllerAndExpert;
import java.awt.Graphics;

public class Circle {
	
	private int xCord;
	private int yCord;
	private Graphics graphics;
	
	public Circle(int x, int y, Graphics g) {
		xCord = x;
		yCord = y;
		graphics = g;
	}
	
	public void drawCircle() {
		System.out.println("Deepika");
		graphics.drawOval(xCord, yCord, 80, 80);
	}
}
