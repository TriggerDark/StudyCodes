package com.model;

import java.awt.Toolkit;

import com.view.MainFrame;
import com.view.MyPanel;

public class Enemy03 extends Enemy {

	public Enemy03(MyPanel mypanel) {
		super(mypanel);
		this.width = 98;
		this.height = 74;
		this.x = (int)(Math.random()*(MainFrame.FrameWidth - this.width));
		this.y = (0 - this.height);
		this.image = Toolkit.getDefaultToolkit().getImage("src/images/enemy03.png");
		this.speed = 3;
		this.hp = 3;
		this.pointer = 100;
		this.items = new Item[] {
			new Item01(mypanel), 
			new Item01(mypanel), 
			new Item01(mypanel)
		};
	}
	
}
