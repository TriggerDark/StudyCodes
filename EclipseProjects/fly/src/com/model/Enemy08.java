package com.model;

import java.awt.Toolkit;

import com.view.MainFrame;
import com.view.MyPanel;

public class Enemy08 extends Enemy {

	public Enemy08(MyPanel mypanel) {
		super(mypanel);
		this.width = 116;
		this.height = 83;
		this.x = (int)(Math.random()*(MainFrame.FrameWidth - this.width));
		this.y = (0 - this.height);
		this.image = Toolkit.getDefaultToolkit().getImage("src/images/enemy08.png");
		this.speed = 2;
		this.hp = 5;
		this.pointer = 500;
		this.items = new Item[] { 
			 new Item04(mypanel), 
		     new Item02(mypanel), 
		     new Item02(mypanel) 
		};
	}
	
}
