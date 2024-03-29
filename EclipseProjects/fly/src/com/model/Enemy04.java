package com.model;

import java.awt.Toolkit;

import com.view.MainFrame;
import com.view.MyPanel;

public class Enemy04 extends Enemy {

	public Enemy04(MyPanel mypanel) {
		super(mypanel);
		this.width = 105;
		this.height = 76;
		this.x = (int)(Math.random()*(MainFrame.FrameWidth - this.width));
		this.y = (0 - this.height);
		this.image = Toolkit.getDefaultToolkit().getImage("src/images/enemy04.png");
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
