package com.cykj.view;

import com.cykj.controller.GameController;

public class GameMain {
   
	public  static  GameFrame    welcomeFrame1;
	public  static  WelcomeFrame welcomeFrame;
	public  static  GameFrame    gameFrame;
	// 程序入口
	public static void main(String[] args) {
		GameController gameController = new GameController();
		
    //创建窗口
	    welcomeFrame = new WelcomeFrame();	 
	    gameFrame  = new GameFrame(gameController);
	}

}
