package third_trimester.Ej2.pckg2;

public class Test {
    private char c1;
    protected char c2;
    public Test(){}
    public Test(char c1, char c2){
        this.setC2(c1);
        this.setC2(c2);
    }

    public char getC1() {
        return c1;
    }

    public void setC1(char c1) {
        this.c1 = c1;
    }

    public char getC2() {
        return c2;
    }

    public void setC2(char c2) {
        this.c2 = c2;
    }
}
