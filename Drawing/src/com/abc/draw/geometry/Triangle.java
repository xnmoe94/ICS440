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

        int l1 = (int) Math.floor(getP1().getX());
        int z1 = (int) Math.floor(getP1().getY());
        int l2 = (int) Math.floor(getP2().getX());
        int z2 = (int) Math.floor(getP2().getY());
        int l3 = (int) Math.floor(getP3().getX());
        int z3 = (int) Math.floor(getP3().getY());


        g2.drawLine(l1, z1, l2, z2);
        g2.drawLine(l2, z2, l3, z3);
        g2.drawLine(l3, z3, l1, z1);
		
		
		
		
		

	}

}
