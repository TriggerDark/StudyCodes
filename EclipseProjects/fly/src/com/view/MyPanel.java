package com.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.model.Bullet;
import com.model.Enemy;
import com.model.Enemy01;
import com.model.Enemy02;
import com.model.Enemy03;
import com.model.Enemy04;
import com.model.Enemy05;
import com.model.Enemy06;
import com.model.Enemy07;
import com.model.Enemy08;
import com.model.Enemy09;
import com.model.Enemy10;
import com.model.Item;
import com.model.Player;
import com.thread.DrawableThread;


public class MyPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public DrawableThread thread;
	public Player player;
	public ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	public ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	public ArrayList<Item> items = new ArrayList<Item>();
	
	public Image bg;
	public int top = 0;
	public int timer = 0;
	public int enemyFlag;
	
	public MyPanel() {
		this.bg = Toolkit.getDefaultToolkit().getImage("src/images/bg01.jpg");
		this.player = new Player(this);
		this.thread = new DrawableThread(this);
		this.thread.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.timer ++;
		if(timer >= 10000) {
			timer = 0;
		}
		
		//»­±³¾°
		g.drawImage(bg, 0, top-bg.getHeight(this), bg.getWidth(this), bg.getHeight(this), null);
		g.drawImage(bg, 0, top, bg.getWidth(this), bg.getHeight(this), null);
		
		if(timer%10 == 0) {
			this.top += 1;
			if(top > bg.getHeight(this)) {
				top = 0;
			}
		}
		//»­·É»ú
		this.player.drawSelf(g);
		//»­×Óµ¯
		if(this.timer % 100 == 0) {
			if(this.player.attackMode == 1) {
				Bullet b = new Bullet(this);
				b.x = (this.player.x + this.player.width/2 - b.width/2);
				b.y = this.player.y;
				this.bullets.add(b);
			}else if(this.player.attackMode ==2 ) {
				Bullet b1 = new Bullet(this);
		        b1.x = (this.player.x + this.player.width / 2 - b1.width / 2);
		        b1.y = (this.player.y - 30);
		        this.bullets.add(b1);

		        Bullet b2 = new Bullet(this);
		        b2.x = (this.player.x + this.player.width / 2 - b2.width / 2 - b2.width - 10);
		        b2.y = this.player.y;
		        this.bullets.add(b2);

		        Bullet b3 = new Bullet(this);
		        b3.x = (this.player.x + this.player.width / 2 - b3.width / 2 + b3.width + 10);
		        b3.y = this.player.y;
		        this.bullets.add(b3);
			}else if (this.player.attackMode == 3)
		      {
		        Bullet b1 = new Bullet(this);
		        b1.x = (this.player.x + this.player.width / 2 - b1.width / 2);
		        b1.y = (this.player.y - 60);
		        this.bullets.add(b1);

		        Bullet b2 = new Bullet(this);
		        b2.x = (this.player.x + this.player.width / 2 - b2.width / 2 - b2.width - 10);
		        b2.y = (this.player.y - 30);
		        this.bullets.add(b2);

		        Bullet b3 = new Bullet(this);
		        b3.x = (this.player.x + this.player.width / 2 - b3.width / 2 + b3.width + 10);
		        b3.y = (this.player.y - 30);
		        this.bullets.add(b3);

		        Bullet b4 = new Bullet(this);
		        b4.x = (this.player.x + this.player.width / 2 - b4.width / 2 - 2 * b4.width - 20);
		        b4.y = this.player.y;
		        this.bullets.add(b4);

		        Bullet b5 = new Bullet(this);
		        b5.x = (this.player.x + this.player.width / 2 - b5.width / 2 + 2 * b5.width + 20);
		        b5.y = this.player.y;
		        this.bullets.add(b5);
		      }
			
		}
		for(int i = 0; i < this.bullets.size(); ++ i) {
			this.bullets.get(i).drawSelf(g);
		}
		
		if(this.timer % 500 == 0) {
			this.enemyFlag = (int)(Math.random() * 10.0D + 1.0D);
			Enemy enemy = null;
			switch(this.enemyFlag) {
				case 1:
					enemy = new Enemy01(this);break;
				case 2:
					enemy = new Enemy02(this);break;
				case 3:
					enemy = new Enemy03(this);break;
				case 4:
					enemy = new Enemy04(this);break;
				case 5:
					enemy = new Enemy05(this);break;
				case 6:
					enemy = new Enemy06(this);break;
				case 7:
					enemy = new Enemy07(this);break;
				case 8:
					enemy = new Enemy08(this);break;
				case 9:
					enemy = new Enemy09(this);break;
				case 10:
					enemy = new Enemy10(this);break;
				default:
					enemy = new Enemy01(this);
			}
			this.enemies.add(enemy);
		}
		for(int i = 0; i<this.enemies.size(); ++i) {
			this.enemies.get(i).drawSelf(g);
		}
		
		for(int i = 0; i < this.items.size(); ++i) {
			this.items.get(i).drawSelf(g);
		}
		
		g.setColor(Color.WHITE);
		g.drawString(String.valueOf(this.player.pointer), MainFrame.FrameWidth - 140, 15);
		
	}	
	
}
