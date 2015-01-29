package edu.csc150;

import greenfoot.Actor;
import greenfoot.*;  
import java.awt.Color;

public class NSRoads extends Actor {

	private static int ROAD_LENGTH = 1000;
	private static int ROAD_WIDTH = 50;
	
	public NSRoads(){
		GreenfootImage image = new GreenfootImage(ROAD_WIDTH,ROAD_LENGTH);
		image.drawRect(0,0,ROAD_WIDTH,ROAD_LENGTH);
		image.setColor(Color.GRAY);
		image.fill();
		setImage(image);
	}
}// end class
