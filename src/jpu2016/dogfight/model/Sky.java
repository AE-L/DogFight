package jpu2016.dogfight.model;
import jpu2016.dogfight.model.Dimension;

public class Sky implements IArea {
	public Sky(Dimension dimension) {
	}
	@Override
	public void getImage() {
		return image;
	}
	@Override
	public Dimension getDimension() {
		return dimension;

	}
}
