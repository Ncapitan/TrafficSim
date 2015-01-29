package edu.csc150;

import greenfoot.Actor;
import greenfoot.*;  
import java.awt.Color;

public class EWRoads extends Actor {

	private static int REC_WIDTH = 1000;
	private static int HEIGHT = 50;
	
	public EWRoads(){
		GreenfootImage image = new GreenfootImage(REC_WIDTH,HEIGHT);
		image.drawRect(0,0,REC_WIDTH,HEIGHT);
		image.setColor(Color.GRAY);
		image.fill();
		setImage(image);
	}
}// end class
