package com.cykj.view;

import java.awt.Component;
import java.awt.Desktop.Action;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.cykj.model.GameData;

public  class  WelcomeFrame<WelcomPanel, MywindowLis, GameControl>  extends JFrame{
	
//      private  static final String GameData = null;
		private  WelcomPanel wel_panel;
		
        private  Action      actionlis;
        private  MywindowLis win_lis=null;
	    private  GameControl gameControl;
		private  Component   btnStart;
		private  Object      add;
		private  Object i;
		private  int  StartImg;
		private  void WelcomeJFrame(GameControl gameControl) {
	    this.gameControl =  gameControl;
	    // this.wel_panel   =  new WelcomPanel(gameControl);
		this.setSize(1100, 700);
		this.setTitle("Ó¢ÐÛÁªÃË");
		
		
		add(wel_panel);
		setResizable(false);

		pack();
        this.setLayout(null);
        JButton btnStart=new JButton( GameData.startImg);
        btnStart.setBounds(500,500,150,50);
        this.add(btnStart);
       
        btnStart.addActionListener(new ActionListener() {
         	
        @Override
        public void actionPerformed(ActionEvent e) {
		}
            {
        
        	GameMain.welcomeFrame.setVisible(false);
            GameMain.welcomeFrame.setVisible(true);
           }
	    });
		btnStart.addActionListener((ActionListener) win_lis);
		this.add(btnStart);
		this.setLocationRelativeTo(null); 
		this.setResizable(false);			
		this.setVisible(true);

	    }; 
      
	private void add(WelcomPanel wel_panel2) {
			// TODO Auto-generated method stub
			
		}

	private void addwindowsListener(MywindowLis win_lis2) {
		// TODO  Auto-generated method stub
	
	}

	@Override
	public void paint(Graphics g) {		 
		super.paint(g);
		Image img = new ImageIcon("image/bg3.jpeg").getImage();
		g.drawImage(img, 0, 0, 1100, 700, this);
		
		Image img0 = new ImageIcon("image/01.jpg").getImage();
		g.drawImage(img0, 50, 400, 68, 67, null);
		
		Image img1 = new ImageIcon("image/02.jpg").getImage();
		g.drawImage(img1, 50+68+10, 400, 68, 67, null);
		
		Image img2 = new ImageIcon("image/03.jpg").getImage();
		g.drawImage(img2, 128+68+10, 400, 68, 67, null);
			
	    int temp=50;
		 
	     for (int i=0; i < GameData.imgList.size();i++){
		     temp = temp+68+10;                                               
			 g.drawImage(GameData.imgList.get(i),temp, 400, 68, 67,null);
			
		}
		//     g.drawImage(GameData, StartImg, 500, 500,this);
	}
}
