package trabalhoDevops;

public class Main {
	
    public static void main(String[] args) {
        Main calculator = new Main();

        int resultAdd = calculator.add(2, 3);
        System.out.println("2 + 3 = " + resultAdd);

        int resultSubtract = calculator.subtract(10, 5);
        System.out.println("10 - 5 = " + resultSubtract);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
