package com.cykj.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.nio.charset.Charset;

import javax.swing.JPanel;

import com.cykj.controller.GameController;
import com.cykj.model.Chariot;
import com.cykj.model.GameData;

public  class   GamePanel extends JPanel{
 //    private static final Graphics = null;
	   public int r =80;
	   public  GameController gameC;
       public  GamePanel(GameController gameC ) {
       this.gameC = gameC;
       
	   this.setPreferredSize(new Dimension(1100,700));   
	   this.setLayout(null);
	   this.setBackground(Color.BLACK);

   }

  
       protected void paintComponent(Graphics g, int img) {
       //TODO Auto-generated method stub
       super.paintComponent(g);
       g.drawImage(GameData.img, 0, 0,1100,700, null);    	
       //小兵 
       for(int i=0;i<this.gameC.charioList.size();i++) {
       Chariot chariot=this.gameC.charioList.get(i);
       g.drawImage(chariot.img,Chariot.x,chariot.y,200,200,null);
                                                      
       }   
              
       //英雄
       g.drawImage(this.gameC.hero.img, this.gameC.hero.getX(), this.gameC.hero.y1,200,200,null);
       


       // this.getAccessibleContext();
       // 画光环圆形
       g.setColor(Color.WHITE);
       g.drawOval(100, 100, r,r);
       //刷新窗口
      
       
      }
}

