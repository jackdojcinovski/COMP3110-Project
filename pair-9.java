package testcases.p01;
public class Case01 {
    private int value = 1;
    public Case01() { this.value += 10; }
    public int compute(int input) {
        int base = this.value;
        int result = base + input;
        return result;
    }
}
