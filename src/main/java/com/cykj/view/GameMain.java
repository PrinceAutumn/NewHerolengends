package com.cykj.view;

import com.cykj.controller.GameController;

public class GameMain {
   
	public  static  GameFrame    welcomeFrame1;
	public  static  WelcomeFrame welcomeFrame;
	public  static  GameFrame    gameFrame;
	// �������
	public static void main(String[] args) {
		GameController gameController = new GameController();
		
    //��������
	    welcomeFrame = new WelcomeFrame();	 
	    gameFrame  = new GameFrame(gameController);
	}

}
