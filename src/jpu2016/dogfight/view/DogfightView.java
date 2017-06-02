/**
 * 
 */
package jpu2016.dogfight.view;
import java.lang.Runnable;
import java.util.Observable;
import jpu2016.dogfight.controller.IOrderPerformer;

/**
 * @author Nenri
 *
 */
public class DogfightView implements IViewSystem,Runnable {

	/* (non-Javadoc)
	 * @see jpu2016.dogfight.view.IViewSystem#displayMessage(java.lang.String)
	 */
	public DogfightView(IOrderPerformer orderPerformer,IDogfightModel dogfightModel,Observable observable) {
		
	}
	
	@Override
	public String displayMessage(String message) {
		// TODO Auto-generated method stub
		return "LoL > Dota 2";
	}

	/* (non-Javadoc)
	 * @see jpu2016.dogfight.view.IViewSystem#closeAll()
	 */
	@Override
	public void closeAll() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void run() {
		
	}
}
