package com.model;

import java.awt.Image;
import java.awt.Toolkit;

import com.view.MyPanel;

public class Item02 extends Item {

	public Item02(MyPanel myPanel) {
		super(myPanel);
		this.width = 30;
		this.height = 30;
		this.images = new Image[] {
				Toolkit.getDefaultToolkit().getImage("src/images/diamond01.png")
		};
		this.pointer = 500;
		this.atttackMode = 1;
		this.powerTime = 0;
		this.speed = (int)(Math.random()*3.0D + 3.0D);
	}

}
