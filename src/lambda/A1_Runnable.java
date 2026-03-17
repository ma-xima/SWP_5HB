package lambda;

public class A1_Runnable {
	public static void main(String[] args) {
    Runnable runnable = () -> {System.out.println("1 2 3 4 5 6 7 8 9 10");};
    new Thread(runnable).start();
	}
}
