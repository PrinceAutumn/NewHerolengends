package com.cykj.controller;

import  java.util.ArrayList;

import com.cykj.model.Chariot;
import com.cykj.model.GameData;
import com.cykj.model.Hero;

public  class  GameController {
	 
       
		public static final String hero1 = null;
		public ArrayList<Chariot> charioList = new ArrayList<Chariot>();
        public Hero hero;
        // private Object chariotlist;
        
	    // 导演
	    public GameController() {
	
	    // 创建一个英雄
		           
        Hero hero = new Hero(700,380,GameData.imgList.get(0));
         
	    // 创建6个战车?
	    for (int i=1;i<=10;i++) {
	         Chariot chariot = new Chariot(200,380,GameData.bgImg,10);
	         charioList.add(chariot);
	    }
    }
   
		public Object getHero() {
			// TODO Auto-generated method stub
			return null;
		}
 
     }
		
