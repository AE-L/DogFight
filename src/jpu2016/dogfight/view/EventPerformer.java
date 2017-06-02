package jpu2016.dogfight.view;

import jpu2016.gameframe.IEventPerformer;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;	
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer implements IEventPerformer {

	public EventPerformer(IOrderPerformer orderPerformer) {
	
	}
	public UserOrder keyCodeToUserOrder(int keyCode) {
		UserOrder userOrder = null;
		return userOrder;
	}
	@Override
	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}
}
