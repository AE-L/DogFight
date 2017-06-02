package jpu2016.dogfight.model;
import java.awt.Dimension;
import jpu2016.dogfight.model.Position;
import jpu2016.dogfight.model.Direction;


public class Mobile implements IMobile{
	private int speed;
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		
	}

	@Override
	public Direction getDirection() {
		return null;
	}

	@Override
	public void setDirection() {
		
	}

	@Override
	public Point getPoint() {
		return null;
	}

	@Override
	public Dimension getDimention() {
		return null;
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
