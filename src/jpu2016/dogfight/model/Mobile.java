package jpu2016.dogfight.model;
import java.awt.Dimension;
import jpu2016.dogfight.model.Position;
import jpu2016.dogfight.model.Direction;


public class Mobile  implements IMobile{
	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {
		
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public getDimension getDimension() {
		return dimension;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public Image getImage() {
		return null;
	}

	@Override
	public void move() {
		
	}

	@Override
	public void placeInArea(IArea area) {
		
	}

	@Override
	public boolean isPlayer(int player) {
		return false;
	}

	public void moveUp(){
		
	}
	public void moveDown(){
		
	}
	public void moveRight(){
	
	}
	public void moveLeft(){
	
	}

	public Color getColor(){
		
	}
	
	@Override
	public void setDogfightModel(Dogfight dogfightModel) {
		
	}

	@Override
	public boolean hit() {
		return false;
	}

	@Override
	public boolean isWeapon() {
		return false;
	}

}
