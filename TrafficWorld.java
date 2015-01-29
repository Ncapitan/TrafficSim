package edu.csc150;

import java.awt.Color;
import java.util.Random;

import greenfoot.Actor;
import greenfoot.World;

public class TrafficWorld extends World {
	
	public static int NUM_NROAD = 7;
	public static int NUM_EROAD = 5;
	public static int EW_CARS = 4;
	public static int NS_CARS = 6;
	public static int ROADWIDTH = 50;
	public static int WORLDWIDTH = 1000;
	public static int WORLDHEIGHT = 750;
	public static int WIDTH_SPACE = 40;
	public static int HEIGHT_SPACE = 35;
	public static int BUFFER = 25;
	public static int HALF = 2;
	public static int N_BUFF = 10;
	
	public TrafficWorld(){
		super(WORLDWIDTH,WORLDHEIGHT,1);
		this.getBackground().setColor(Color.GREEN);
		this.getBackground().fill();

		//ROADS
		int e = getHeight()/HEIGHT_SPACE;
		int r = getWidth()/WIDTH_SPACE;
		for(int i = 0; i < NUM_NROAD; i++){
			this.addObject(new NSRoads(), e, getHeight()/2);
			e += (getWidth()/6)-(45/6);
		}
		
		for(int i = 0; i < NUM_EROAD; i++){
			this.addObject(new EWRoads(), getWidth()/2, r);
			r += (getHeight()/4)-(50/4);
		}
		
		//Intersections
		int o = 21;
		int p = 25;

		for(int i = 0; i < 7; i++){
			for(int q = 0; q < 5; q++){
			this.addObject(new Intersection(o, p), o, p);
			o += (getWidth()/6-(47/6));
			}
			
		}	
		
		//CARS
		int y = N_BUFF;
		int x = HEIGHT_SPACE;		
		for (int i = 0; i < EW_CARS; i++){
			addCarLR(Direction.LEFT, y, getWidth());
			y += (getHeight()/4)-(50/4);
		}
		
		for (int i = 0; i < EW_CARS; i++){
			addCarLR(Direction.RIGHT, y+BUFFER, getWidth());
			y -= (getHeight()/4)-(50/4);
		}	

		for (int i = 0; i < NS_CARS; i++){
			addCarUD(Direction.UP, x, getHeight());
			x += (getWidth()/6)-(50/6);
		}	 
	
		for (int i = 0; i < NS_CARS; i++){
			addCarUD(Direction.DOWN, x-BUFFER, getHeight());
			x -= (getWidth()/6)-(50/6);
		}	
	}
	
	//ADD CAR METHODS
	public void addCarLR(Direction direction, int y, int max){
		Random rand = new Random();
		int x = rand.nextInt(max);
		Car car = new Car();
		this.addObject(car, x, y);
		car.setRotation(direction.getRotation());
	}
	
	public void addCarUD(Direction direction, int x, int max){
		Random rand = new Random();
		int y = rand.nextInt(max);
		Car car = new Car();
		this.addObject(car, x, y);
		car.setRotation(direction.getRotation());
	}
		
}//End Class
