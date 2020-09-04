package com.abc.draw.geometry;

import java.awt.Graphics2D;

import com.abc.draw.Drawable;

public class Triangle implements Drawable {
	
	
	private Point p1;
	private Point p2;
	private Point p3;
	
	
	
	
	

	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	


	public Point getP1() {
		return p1;
	}



	public void setP1(Point p1) {
		this.p1 = p1;
	}


	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}


	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub

        // TODO: this is hard to read...
		
		
		//Drawing Points

        int x1 = (int) Math.floor(getP1().getX());
        int y1 = (int) Math.floor(getP1().getY());
        int x2 = (int) Math.floor(getP2().getX());
        int y2 = (int) Math.floor(getP2().getY());
        int x3 = (int) Math.floor(getP3().getX());
        int y3 = (int) Math.floor(getP3().getY());
        
        
 
        g2.drawLine(x1, y1, x2, y2);
        g2.drawLine(x2, y2, x3, y3);
        g2.drawLine(x3, y3, x1, y1);
       
       
		
		
		
		
		

	}

}
