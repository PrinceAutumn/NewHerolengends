package com.cykj.model;

import java.awt.Image;

public class Hero implements Runnable {
    public static final int x1 = 0;
	private static final int speed = 0;
	private int x,y;
	private int value1;
	public int speed1=5;//移动速度
	private static Thread t = null;
	public Image img;
	private int a;
	private int b;
   

	public Hero(int i, int j, Object heroImg) {
		this.setX(a);
		this.setY(b);
		this.img=img;
	}
		// TODO Auto-generated constructor stub
	
//special
	public int x11,y1;
	public Image img1;
	public int value;
	private String statu;
	private int moving;
	private int index;
	
    public Hero(int a,int b,Image img) {
    	this.setX(a);
    	this.setY(b);
    	this.img=img;
    	t = new Thread(this);
    	t.start();
    }
    public void run() {
    	while(true) {
    }
    }
    //动作
    public void move(char director) {
    	switch(director) {
    	case'w':
    		this.setY(this.getY()-this.speed);
    		//方法 更改头像
    		this.statu = "up--moving--";
    		break;
    	case'a':
    		this.setX(this.getX()-this.speed);
    		this.statu = "left--moving--";
    		break;
    	case'd':
    		this.setX(this.getX()-this.speed);
    		this.statu = "right--moving--";
    		break;
    	case's':
    		this.setX(this.getX()-this.speed);
    		break;
    	}
    }
    //键盘松开时任务还原站立
    public void stopMoving() {
    	this.statu="standing----";
    }
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
    }
