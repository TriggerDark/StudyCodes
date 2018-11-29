package com.model;

import java.awt.Image;
import java.awt.Toolkit;

import com.view.MyPanel;

public class Item01 extends Item {
	
	public Item01(MyPanel mypanel) {
		super(mypanel);
		
		this.width = 30;
		this.height = 30;
		this.images = new Image[] {
				Toolkit.getDefaultToolkit().getImage("src/images/star01.png"),
				Toolkit.getDefaultToolkit().getImage("src/images/star02.png"),
				Toolkit.getDefaultToolkit().getImage("src/images/star03.png"),
				Toolkit.getDefaultToolkit().getImage("src/images/star04.png"),
				Toolkit.getDefaultToolkit().getImage("src/images/star05.png"),
				Toolkit.getDefaultToolkit().getImage("src/images/star06.png"),
				Toolkit.getDefaultToolkit().getImage("src/images/star07.png"),
				Toolkit.getDefaultToolkit().getImage("src/images/star08.png"),
				Toolkit.getDefaultToolkit().getImage("src/images/star09.png")
		};
		this.pointer = 100;
		this.atttackMode = 1;
		this.powerTime = 0;
		this.speed = (int)(Math.random()*3.0D +3.0D);
	}
}
