package com.cykj.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.crypto.KeyAgreement;

public abstract class GameKeyListener implements KeyListener{
	
	 //����ȥ
	 GameController gameController;
	
	 public GameKeyListener(GameController gamec) {
	
	     this.gameController=gamec;
     }                                                               
                                                                                 
     public void KeyPressed(KeyAgreement e) {
    	 
    	 System.out.println("����ȥ");
     }

     //������
     public void KeyReleased(KeyEvent e) {
                                         	 
     	 System.out.println("������");
      

    	 //System.out.println(e.getKeyCode));//�õ����µ�Key
     	 
    	 if(((KeyEvent) e).getKeyCode()==39);
    	 //���ƶ�
     }
}