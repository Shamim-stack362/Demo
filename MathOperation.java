public class MathOperation {
    public int Operation(int a, int b) {
    return a + b;
    }
    public float Operation(float a, float b) {
        return a - b;
    }
    public double Operation(double a, double b) {
        return a * b;
    }
    public double Operation(double a, float b) {
        return a / b ;
    }
    public String Operation(String a, String b) {
        return a +""+ b;

    }
    public static void main(String[] args) {
        int x=1,y=2,s=3;
        float u=3.4f,a=3.5f;
        double v=3.5d, l=6.89d,q=9.97d;
        String f="shamim", b="hosen";
        MathOperation m = new MathOperation();
        System.out.println(m.Operation(2, 3));
        System.out.println(m.Operation(3.4f, 3.5f));
        System.out.println(m.Operation(3.5d, 6.89d));
        System.out.println(m.Operation(6.89d, 9.97d));
        System.out.println(m.Operation(f,  b));

    }
}
