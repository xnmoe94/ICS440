package com.abc.draw.geometry;

import java.awt.Graphics2D;

import com.abc.draw.Drawable;

public class Rectangle extends Square {
	
	
	
	



	public Rectangle(Point upperLeft, double width, double d) {
		super(upperLeft, width);
		// TODO Auto-generated constructor stub
	}



	private double height;
	
	
	

	
	

	


	public double getHeight() {
		return height;
	}




	public void setHeight(double height) {
		this.height = height;
	}



	@Override
    public void draw(Graphics2D g2){
       
        int i = (int) Math.floor(super.getUpperLeft().getX());
       int j = (int) Math.floor(super.getUpperLeft().getY());
        int k = (int) Math.floor(super.getWidth());
        int z = (int) Math.floor(this.getHeight());

        g2.drawLine(i, j, i+k, j); // top
        g2.drawLine(i+k, j, i+k, j+z); // right
        g2.drawLine(i+k, j+z, i, j+z); // bottom
        g2.drawLine(i, j+z, i, j); // left
    }

	
}