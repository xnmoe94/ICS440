package com.abc.fruit;

public class Fruit {

	
	private String name;

	public Fruit(String name) {
		this.name = name;
		
		
		  Thread t = new Thread(()-> {
			try {
				
				run();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	      
		  t.start();
	       
	}
	
	
	
	  



	private void run() throws InterruptedException {
	        for ( int i = 0; i <= 20  ; i++ ) {
	            System.out.println(name);
	            Thread.sleep(200);
	        }
	    }
	
	
}


