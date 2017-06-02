package jpu2016.dogfight.model;
import jpu2016.dogfight.model.Dimension;
import java.awt.color.*;
import java.awt.Image;
public class Sky implements IArea {
	public Sky(Dimension dimension) {
	}
	@Override
	public Image getImage() {
		return image;
	}
	@Override
	public Dimension getDimension() {
		return dimension;

	}
}
