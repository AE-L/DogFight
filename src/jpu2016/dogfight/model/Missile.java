package jpu2016.dogfight.model;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.Dimension;

public class Missile extends Mobile{
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension){
		
	}
	public int getWidthWithDirection(Direction direction){
	return direction;
	}
	public int getHeightWithDirection(Direction direction){
	return direction;
	}
	public void move(){
		
	}
	public boolean isWeapon(){
		
	}
}
