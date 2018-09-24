package javaLearning;

interface Vehicle{
	void start();
	void run();
	void stop();
}
public class Car implements Vehicle{
public void start() {
	System.out.println("car is started");
}
public void run() {
	System.out.println("car is running");
}
public void stop() {
	System.out.println("car is stopped");
}
	public static void main(String[] args) {
		new Car().start();
        new Car().run();
        new Car().stop();
		
	}

}
