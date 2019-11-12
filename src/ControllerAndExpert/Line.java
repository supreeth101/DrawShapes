package ControllerAndExpert;

import java.awt.Graphics;

public class Line {
	private int xCord;
	private int yCord;
	private Graphics graphics;
	
	public Line(int x, int y, Graphics g) {
		xCord = x;
		yCord = y;
		graphics = g;
	}
	
	public void drawLine() {
		System.out.println("Deepika");
		graphics.drawLine(xCord, yCord, xCord, yCord+200);
		
	}
}
