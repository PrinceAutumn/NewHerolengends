package com.cykj.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cykj.controller.GameController;

public  class  GameFrame  extends  JFrame{
        private Object    gamePanel;
	    private Component gamepanel; 
    
	    public  GameFrame( ) {
    	this.setSize(1100,700);
    	this.setVisible(true);
	    
    	this.setLayout(null);//²¼¾ÖÎª¿Õ
    	JPanel gamePanel= new JPanel(); 
    	gamePanel.setSize(500,300);
    	this.add(gamepanel);
    	pack();
    	this.setVisible(true);	
	    
}
	public GameFrame(GameController gameController) {
		// TODO Auto-generated constructor stub
	}
    
}
