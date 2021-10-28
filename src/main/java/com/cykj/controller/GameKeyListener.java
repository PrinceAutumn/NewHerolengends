package com.cykj.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.crypto.KeyAgreement;

public abstract class GameKeyListener implements KeyListener{
	
	 //按下去
	 GameController gameController;
	
	 public GameKeyListener(GameController gamec) {
	
	     this.gameController=gamec;
     }                                                               
                                                                                 
     public void KeyPressed(KeyAgreement e) {
    	 
    	 System.out.println("按下去");
     }

     //放下来
     public void KeyReleased(KeyEvent e) {
                                         	 
     	 System.out.println("放下来");
      

    	 //System.out.println(e.getKeyCode));//得到按下的Key
     	 
    	 if(((KeyEvent) e).getKeyCode()==39);
    	 //有移动
     }
}