public class OperationMain {
    public static void main (String args []) {

        // Process 1 ==============================================

        int x =  2, y = 2, z = 4;
        float u = 3.4f, v = 4.2f;
        double w = 4.56d, q = 4.89d, r = 3.23d;
        String s = "Simon", t = "Daniel";

        System.out.println("Process 1 = ");
        System.out.println("");

        Operation mot = new Operation();

        System.out.println( mot.operation(x, y)); // add
        System.out.println(mot.operation(u, v)); // subtract
        System.out.println(mot.operation(w, z)); // multiply
        System.out.println(mot.operation(q, r)); // divide
        System.out.println(mot.operation(s, t)); // concat

        // Process 1 ==============================================

        // Process 2 ==============================================

        System.out.println("");
        System.out.println("Process 2 = ");
        System.out.println("");

        Operation mot1 = new Operation();

        System.out.println(mot1.operation(3, 3)); // add
        System.out.println(mot1.operation(3.2f, 4.9f)); // subtract
        System.out.println(mot1.operation(2.34, 8)); // multiply
        System.out.println(mot1.operation(6.78, 3.56)); // divide
        System.out.println(mot1.operation("Michael", "Smith"));// concat

        // Process 2 ==============================================

        // Process 3 ==============================================

        System.out.println("");
        System.out.println("Process 3 = ");
        System.out.println("");

        Operation mot2 = new Operation();

        int m = 2, n = 2;

        System.out.println(mot2.operation(m,n)); // add
        System.out.println(mot2.operation(m,n) );// subtract
        System.out.println(mot2.operation(m, n)); // multiply
        System.out.println(mot2.operation(m,n)); // divide
        String o = String.valueOf(m), p = String.valueOf(n);

        System.out.println(mot2.operation(o,p)); // concat

        // Process 3 ==============================================

    }
}
