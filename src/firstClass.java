public class firstClass {
    static void main() {
        //area of rec
        System.out.println("Area of rectangle is " + (2*2));
        //area of circle
        System.out.println("Area of circle is " + (2*Math.PI));
        //ascii of h
        System.out.println("ASCII value of h is " + (int)'h');
        //
        System.out.println("ASCII val" + (char)((int)'d'+3));
        //
        double square= Math.pow(3.9,2);
        System.out.println(square);
        double val=100.235;
        System.out.println((int)val);
        // print values
        print(2,6.90890,'s');

    }
    public static void print(int a,double b,char c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
