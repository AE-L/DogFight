package jpu2016.dogfight.model;

public class Dimension {
	private int width;
	private int height;
	Dimension(int width, int height){
	}
	Dimension(Dimension dimension){
		
	}
	public int getWidth(){
		return width;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public int getHeigth(){
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}
}
