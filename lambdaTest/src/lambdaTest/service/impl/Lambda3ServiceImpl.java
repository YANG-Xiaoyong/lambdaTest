package lambdaTest.service.impl;

import lambdaTest.service.Lambda2Service;
import lambdaTest.service.Lambda3Service;

public class Lambda3ServiceImpl implements Lambda3Service {

	private int x;
	private int y;
	
	public Lambda3ServiceImpl () {
		
	}
	
	public Lambda3ServiceImpl (int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public Lambda2Service invoke(int a) {
		// TODO Auto-generated method stub
		return new Lambda2ServiceImpl(a);
	}

}
