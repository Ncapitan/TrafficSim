package edu.csc150;

public enum Direction {
	UP(270), DOWN(90), LEFT(180), RIGHT(0);
	
	private int rotation;
	
	private Direction(int rotation){
		this.rotation = rotation;
	}
	 
	public int getRotation(){
		return rotation;
	}
	
	public boolean isVertical(){
		return(this == UP || this == DOWN);
	}
	
	public boolean isHorizontal(){
		return(this == LEFT || this == RIGHT);
	}
	
}
