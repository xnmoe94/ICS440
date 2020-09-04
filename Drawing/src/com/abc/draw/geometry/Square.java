package com.abc.draw.geometry;

import java.awt.Graphics2D;

import com.abc.draw.Drawable;

public class Square implements Drawable {
	
	private double width;
	private Point UpperLeft;

	public Square(Point upperLeft, double width) {
		super();
		this.width = width;
		UpperLeft = upperLeft;
	}




	public double getWidth() {
		return width;
	}




	public void setWidth(double width) {
		this.width = width;
	}




	public Point getUpperLeft() {
		return UpperLeft;
	}




	public void setUpperLeft(Point upperLeft) {
		UpperLeft = upperLeft;
	}



	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub
		
		
		 	int x1 = (int) Math.floor(this.getUpperLeft().getX());
	        int y1 = (int) Math.floor(this.getUpperLeft().getY());
	        int z1= (int) Math.floor(this.width);

	        g2.drawLine(x1, y1, x1+z1, y1); 
	        g2.drawLine(x1+z1, y1, x1+z1, y1+z1); 
	        g2.drawLine(x1+z1, y1+z1, x1, y1+z1); 
	        g2.drawLine(x1, y1+z1, x1, y1);
		
	        
	        
	        

	}


}
