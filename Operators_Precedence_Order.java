public class Test {
    public static void main(String[] args){
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + ",");
        System.out.println(exp2);

        int a = 200, b = 50, c = 100;
        if(a > b&& b > c){System.out.println("Hello");}
        if(c > b && c < a){System.out.println("Java");}
        if((b+200) < a && (b+150) < c){System.out.println("Hello Java");}

        int d, e, f;
        d = e = f = 2;
        d += e;
        e -= f;
        f /= (d + e);
        System.out.println(d + " " + e + " " + f);

        int j = 9, k = 12;
        int g = 2, h = 4, i = 6;
        int exp = 4/3 * (j + 34) + 9 * (g + h * i) + (3 + k * (2 + g)) / (g + h * k);
        System.out.println(exp);

        int l = 10, m = 5;
        int exp3 = (m * (l / m + l / m));
        int exp4 = (m * l / m + m * l / m);
        System.out.println(exp3);
        System.out.println(exp4);
    }
}
