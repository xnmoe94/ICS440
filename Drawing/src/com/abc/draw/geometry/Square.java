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
		if (g2 == null){
            return;
        }
		
		 int x = (int) Math.floor(this.getUpperLeft().getX());
	        int y = (int) Math.floor(this.getUpperLeft().getY());
	        int w = (int) Math.floor(this.width);

	        g2.drawLine(x, y, x+w, y); // top
	        g2.drawLine(x+w, y, x+w, y+w); // right
	        g2.drawLine(x+w, y+w, x, y+w); // bottom
	        g2.drawLine(x, y+w, x, y); // left
		

	}


}
