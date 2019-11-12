package ControllerAndExpert;

import java.awt.Graphics;

public class Square {
	
	private int xCord;
	private int yCord;
	private Graphics graphics;
	
	public Square(int x, int y, Graphics g) {
		xCord = x;
		yCord = y;
		graphics = g;
	}
	
	public void drawSquare() {
		System.out.println("Deepika");
		graphics.drawRect(xCord, yCord, 40, 40);
	}

}
