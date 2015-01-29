package edu.csc150;

import greenfoot.Actor;

public class TrafficLights extends Actor {
	
	static String[] lights = new String[]{"images/trafficLightGreen.png", "images/trafficLightYellow.png", "images/trafficLightRed.png"};
	public int rotation;
	private int COLOR;
	private int count;
	private static final int NS = 1, EW = 2, G = 1, Y = 2, R = 3, GREEN = 1, RED = 201, YELLOW = 151, RESET = 0;
	

	public TrafficLights(Direction p, int x) {
		setRotation(p.getRotation());
		if(x == NS){
			COLOR = G;
			count = GREEN;
		}else if( x == EW){
			COLOR = R;
			count = RED;
		}
	}

	public void act(){
		changeLight();
		getColor();
	}

	public void changeLight(){
		if(count == GREEN){
			this.setImage(lights[0]);
			COLOR = G;
		}
		else if (count == YELLOW){
			this.setImage(lights[1]);
			COLOR = Y;
		}
		else if (count == RED){
			this.setImage(lights[2]);
			COLOR = R;
		}
		else if(count == RESET){
			count = 0;
		}
		
		count++;
	}

	public int getColor() {
		return COLOR;
	}
}
