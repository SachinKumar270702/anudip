package classes;

public class rightLeftShift {
    static void main() {
        int i = 0; int j = i++ + ++i;

        System.out.println( j );
        System.out.println(funn(1,2,7));
    }
    public static  int funn(int a, int b, int c)
    {

        c=b+c;

        b=(b+b)+b;

        c=(10+6)&a;

        c=(4+8)&b;

        b=(a+c)&c;

        return a+b+c;

    }
}
