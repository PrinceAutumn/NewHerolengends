package com.cykj.model;

import java.awt.Image;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class GameData {

	// 游戏开始前数据初始化
	// 集合框架   //数组    // 数据结构问题
	 
	//int a [] = new int[25];
	
	public  final Image heroImg = null;

	public static final String chariotlist = null;

	private static final ArrayList<Image> HeroList = null;

	static final ArrayList<Image> Chariotlist = null;

	public static ArrayList<Image> imgList = new ArrayList<Image>();
	
	
	
	public static ImageIcon startImg = new ImageIcon("image/start021.png");
	//背景图
	public static Image img = new ImageIcon("image/welcomepic.jpg").getImage();
	static {
		for(int i=1; i<=11; i=i+1) {
			Image img = new ImageIcon("image/"+i+".jpg").getImage();			 
		    imgList.add(img);
		 }
	
		 //增加英雄动作图片
		for(int i=1;i<=2;i++) {
			HeroList.add(new ImageIcon("image/renwu"+i+".png").getImage());
		 }
		 //增加战车动作图片
				for(int i=1;i<=2;i++) {
			Chariotlist.add(new ImageIcon("image/gw"+i+".png").getImage());
				}
		
	     } 
     //英雄
	public static Image bgImg = new ImageIcon("image/bg3.jpg").getImage();
                         
 	 //战车

	public static Image gwimg1 = new ImageIcon("image/gw1.jpg").getImage();

	

	
}
