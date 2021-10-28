package com.cykj.model;

import java.awt.Image;

public class Chariot<index> {
                     
	   private static final String Image = null;
       private static final String statu = null;
	   public  static int x;
	   public  static int y;
	   public  Image  img;
	   public  int    value;
	   private int    moving;
	/**
	 *  @param x
	 *  @param y
	 *  @param img
	 *  @param value
	 */
	   public Chariot(int x, int y,Image img , int value) {
		  this.x=x;
		  this.y=y;
		  this.img = img;
		  this.value=value;
		  Thread t=new Thread();
		  t.start();
	  }
	  public void run() {
		int index=0;
		   while(true) {
			   if (this.statu.indexOf("moving")!=-1) {
				  index= moving;
				  if(moving==0);
				      moving=1;
			  }else {
				      moving=0;
			          
				  if(moving<7) {
			      moving ++;
		      }   else {
			      moving=0;
		    }     
				  index =moving;
		  }
		   	   
		  this.img=GameData.Chariotlist.get(index);
		  try {
				 Thread.sleep(50);    
		     } catch(InterruptedException e) {
		    	 e.printStackTrace();
		     }
		   }
		  
		     //TODO Auto-generrated catch-block;
	  }
	public Chariot(int i, int j, String gamedata, String gwimg, int k) {
		// TODO Auto-generated constructor stub
	}
}
