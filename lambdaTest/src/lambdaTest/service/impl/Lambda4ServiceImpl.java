package lambdaTest.service.impl;

import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;

import lambdaTest.service.Lambda3Service;
import lambdaTest.service.Lambda4Service;

public class Lambda4ServiceImpl implements Lambda4Service<Lambda3ServiceImpl> {
	

	@Override
	public Lambda3ServiceImpl add(List<Lambda3ServiceImpl> list) {
		// TODO Auto-generated method stub
		Lambda3ServiceImpl result = new Lambda3ServiceImpl();
		int x=0,y=0;
		for(Lambda3ServiceImpl t : list) {
			x += t.getX();
			y += t.getY();
		}
		result.setX(x);
		result.setY(y);
		return result;
	}
	
	@Override
	public Lambda3ServiceImpl sub(List<Lambda3ServiceImpl> list) {
		// TODO Auto-generated method stub
		Lambda3ServiceImpl result = new Lambda3ServiceImpl();
		int x=list.get(0).getX(),y=list.get(0).getY();
		for(int i = 1; i < list.size(); i++) {
			x -= list.get(i).getX();
			y -= list.get(i).getY();
		}
		result.setX(x);
		result.setY(y);
		return result;
	}

	
}
