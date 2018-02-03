package lambdaTest.service.impl;

import lambdaTest.service.Lambda2Service;

public class Lambda2ServiceImpl implements Lambda2Service {

	private int y;
	
	public Lambda2ServiceImpl(int y) {
		this.y = y;
	}
	
	@Override
	public int invoke(int x) {
		// TODO Auto-generated method stub
		return x + y;
	}



}
