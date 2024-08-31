package headfirst.designpatterns.observer.simple;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		SimpleObserver simpleObserver2 = new SimpleObserver(simpleSubject);
		SimpleObserver simpleObserver3 = new SimpleObserver(simpleSubject);

		simpleSubject.setValue(80);
		simpleSubject.setValue(199);
		
		simpleSubject.removeObserver(simpleObserver);
	}
}
