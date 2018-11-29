package com.model;

import java.awt.Graphics;
import java.awt.Image;

import com.view.MainFrame;
import com.view.MyPanel;

public class Item {
	public int width;
	public int height;
	public int x;
	public int y;
	public Image[] images;
	public int imageIndex = 0;
	public MyPanel mypanel;
	public int pointer;
	public int atttackMode = 1;
	public int powerTime = 0;
	public int speed;
	public int imageSpeed;
	
	public Item(MyPanel myPanel) {
		this.mypanel = myPanel;
		this.imageSpeed = (int)(Math.random()*20.0D + 20.0D);
	}
	
	public void drawSelf(Graphics g) {
		g.drawImage(this.images[this.imageIndex], this.x, this.y, this.width, this.height, null);
		if(this.mypanel.timer % this.imageSpeed == 0) {
			this.imageIndex += 1;
			if(this.imageIndex >= this.images.length) {
				this.imageIndex = 0;
			}
		}
		if(this.mypanel.timer % this.speed == 0) {
			this.y += 1;
			if(this.y > MainFrame.FrameHeight) {
				this.mypanel.enemies.remove(this);
			}
		}
	}
	
	public void eated() {
		this.mypanel.player.pointer += this.pointer;
		if(this.atttackMode >= this.mypanel.player.attackMode) {
			this.mypanel.player.attackMode = this.atttackMode;
			this.mypanel.player.powerTime = this.powerTime;
		}			
		this.mypanel.items.remove(this);
		System.gc();
	}
	
}
