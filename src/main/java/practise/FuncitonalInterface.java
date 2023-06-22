package src.main.java.practise;

public class FuncitonalInterface {

    @FunctionalInterface
    interface testing {
        int show(int i, int j);
    }
    public static void main(String[] args) {

        testing test = (int i, int j) -> i+j;

        int result = test.show(5,4);
        System.out.println(result);
    }
}