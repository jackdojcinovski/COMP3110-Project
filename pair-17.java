package testcases.p17;

public class Sum {

    public int sum(int a, int b) {

        int result = a + b;
        return result;

    }

    public int sum(int a, int b, int c) {

        return sum(a, b) + c;

    }
    
}
