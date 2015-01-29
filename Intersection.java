package edu.csc150;

import java.awt.Color;
import java.util.ArrayList;

import greenfoot.*;

public class Intersection extends Actor {
	
	public static int Width = 50;
	public static int Height = 50;
	public static final int START = 0, END = 1, NS = 1, EW = 2;
	public int o, p, set = 0;
	
	ArrayList<IntersectionListener> inList = new ArrayList<IntersectionListener>();
	ArrayList<IntersectionListener> nearList = new ArrayList<IntersectionListener>();
	
	protected ArrayList<Car> wasList = new ArrayList<Car>();
	
	public void act(){
		addLight();
	}
	
	public Intersection(int o, int p){
		GreenfootImage image = new GreenfootImage(Width,Height);
		image.drawRect(0,0,Width,Height);
		image.setColor(Color.PINK);
		image.fill(); 
		this.setImage(image);
		this.o = o;
		this.p = p;
	}
	
	public void addLight(){
		if(set == START){
		getWorld().addObject(new TrafficLights(Direction.UP, NS), this.o, this.p);
		getWorld().addObject(new TrafficLights(Direction.DOWN, NS), this.o, this.p);
		getWorld().addObject(new TrafficLights(Direction.LEFT, EW), this.o, this.p);
		getWorld().addObject(new TrafficLights(Direction.RIGHT, EW), this.o, this.p);
		}
	}
	
	
}
