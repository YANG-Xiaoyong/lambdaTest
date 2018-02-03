import java.util.ArrayList;
import java.util.List;

import lambdaTest.service.Lambda1Service;
import lambdaTest.service.Lambda2Service;
import lambdaTest.service.Lambda3Service;
import lambdaTest.service.Lambda4Service;
import lambdaTest.service.impl.Lambda1ServiceImpl;
import lambdaTest.service.impl.Lambda2ServiceImpl;
import lambdaTest.service.impl.Lambda3ServiceImpl;
import lambdaTest.service.impl.Lambda4ServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3,y = 4;
		Lambda1Service lambda1Service = new Lambda1ServiceImpl();
		System.out.println(lambda1Service.invoke(x, y));
		
		Lambda2Service lambda2Service = new Lambda2ServiceImpl(x);
		System.out.println(lambda2Service.invoke(y));
		
		Lambda3Service lambda3Service = new Lambda3ServiceImpl();
		System.out.println(lambda3Service.invoke(x).invoke(y));
		 
		/** 给出一个类型T的集合，返回T **/
		List<Lambda3Service> list  = new ArrayList<Lambda3Service>();
		for(int i = 1; i <= 3; i++) {
			Lambda3Service temp = new Lambda3ServiceImpl(x,y);
			list.add(temp);
		}
		Lambda4Service lambda4Service = new Lambda4ServiceImpl();
		Lambda3ServiceImpl resultAdd = (Lambda3ServiceImpl) lambda4Service.add(list);
		System.out.println(resultAdd.getX() + "," + resultAdd.getY());
		Lambda3ServiceImpl resultSub = (Lambda3ServiceImpl) lambda4Service.sub(list);
		System.out.println(resultSub.getX() + "," + resultSub.getY());
		
		
	}

}
