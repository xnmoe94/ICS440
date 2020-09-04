package com.abc.draw;

import java.awt.*;
import java.util.LinkedList;

public class Drawing extends Object {
    // FIXME - probably need a member variable or two...
	
		private LinkedList<Drawable> shape;
	
	public Drawing() {
        // FIXME - initialize
		
		shape = new LinkedList<Drawable>();
		
	}

	public void drawAll(Graphics2D g2) {
        // FIXME - Invoke draw(Graphics2D) on each of the Drawable's that
        //         have been added via append(Drawable).
		
		for(Drawable Shapes : shape) {
			Shapes.draw(g2);
		}
	}

	public void append(Drawable drawable) {
	    // FIXME - Add the passed Drawable to the list of items that make up
        //         this Drawing.
		shape.add(drawable);
	
	}

}
	
