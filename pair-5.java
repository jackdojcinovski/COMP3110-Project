package testcases.p01;
public class pair-5 {
    private int value = 1;
    public pair-5() {
        this.value += 10;
    }
    public int compute(int input) {
        return this.value + input; // pair 1 A
    }
}
