package lambdaTest.service;

import java.util.List;

public interface Lambda4Service<T> {

	public T add(List<T> x);
	public T sub(List<T> x);
	
}
