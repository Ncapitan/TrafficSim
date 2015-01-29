 package edu.csc150;

import greenfoot.Actor;
import greenfoot.World;

public class Car extends Actor {
	

	
		public Car(){
			String[] images = new String[]{"images/topCarBlue.png" ,
					                       "images/topCarYellow.png", 
					                       "images/topCarPurple.png",
					                       "images/topCarRed.png"};
			int index = (int) (Math.random() * (images.length ));
			this.setImage(images[index]);
		}
		
		public String hitTheEdge(){
			int x = getX();
			int y = getY();
			World myWorld = getWorld();
			int rightSide = myWorld.getWidth() - 1;
			int bottomSide = myWorld.getHeight() - 1;
			if(y == 0){
				return "top";
			}
			else if(x == 0){
				return "left";
			}
			else if(x == rightSide){ 
				return "right";
			}
			else if(y == bottomSide){
				return "bottom";
			}
			else{
				return null;
			}
		}
		
		public void wrapAtEdge(){

			String edge = hitTheEdge();
			int x = getX();
			int y = getY();
			World myWorld = getWorld();
			int rightSide = myWorld.getWidth() - 1;
			int bottomSide = myWorld.getHeight() - 1;
			if(edge == "bottom"){
				setLocation(x,0);
			}
			else if(edge == "top"){
				setLocation(x,bottomSide);
			}
			else if(edge == "left"){
				setLocation(rightSide, y);
			}
			else if(edge == "right"){
				setLocation(0,y);
			}
		}
		
		private void checkIntersection(){
//			if(isTouching(Intersection.class)){
//				num = mixer.nextInt(3);
//				Actor i = getOneIntersectionObject(Intersection.class);
//				
//			}
		}
		
		public void act(){
			move(1);
			wrapAtEdge();
			
		}	
}
