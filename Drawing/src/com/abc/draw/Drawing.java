package com.abc.draw;

import java.awt.*;

public class Drawing extends Object {
    // FIXME - probably need a member variable or two...
	private Drawable[] shapes;
	private int count;
	
    
	public Drawing() {
        // FIXME - initialize
		
		shapes = new Drawable[100];
	}

	public void drawAll(Graphics2D g2) {
        // FIXME - Invoke draw(Graphics2D) on each of the Drawable's that
        //         have been added via append(Drawable).
		
		for(Drawable Shape : shapes) {
			Shape.draw(g2);
			
		}
		
		for(int i = 0; i<count; i++) {
			shapes[i].draw(g2);
		}
	}

	public void append(Drawable drawable) {
	    // FIXME - Add the passed Drawable to the list of items that make up
        //         this Drawing.
		shapes[count] = drawable;
		count++;
	
	}

}
	
