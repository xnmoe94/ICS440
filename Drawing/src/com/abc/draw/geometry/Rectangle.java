package com.abc.draw.geometry;

import java.awt.Graphics2D;

import com.abc.draw.Drawable;

public class Rectangle extends Square {
	private double height;

	public Rectangle(Point upperLeft, double width, double d) {
		super(upperLeft, width);
		
	}


	public double getHeight() {
		return height;
	}




	public void setHeight(double height) {
		this.height = height;
	}



	@Override
    public void draw(Graphics2D g2){
       
        int x1 = (int) Math.floor(super.getUpperLeft().getX());
       int y1 = (int) Math.floor(super.getUpperLeft().getY());
        int width = (int) Math.floor(super.getWidth());
        int height = (int) Math.floor(this.getHeight());
        
        //Drawing Rectangle using Points
   
        g2.drawRect(x1, y1, width, height);
        
        
       
       
    }

	
}