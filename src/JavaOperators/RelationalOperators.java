package JavaOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 10;
        int d = 5;

        // Relational/Comparison Operator digunakan untuk mengecek relasi atau komparasi dari dua operan

        // sama dengan ==
        boolean hasilCompare1 = a == b;
        System.out.println("a is " + a + " b is " + b + " c is " + c + " d is " + d);
        System.out.println(hasilCompare1);

        //Lebih Kecil <
        boolean hasilCompare2 = a < b;
        System.out.println(hasilCompare2);
        // atau
        System.out.println(a < b);

        // Lebih Besar >
        boolean hasilCompare3 = c > d;
        System.out.println(hasilCompare3);
        // atau
        System.out.println(b > d);
        System.out.println(a > c);

        // Lebih kecil dari sama dengan
        boolean hasilCompare4 = a <= b;
        System.out.println(hasilCompare4);
            // atau
        System.out.println(a <= b);
        System.out.println(a <= d);

        // lebih besar sama dengan
        boolean hasilCompare5 = b >= d;
        System.out.println(hasilCompare5);
        System.out.println(a >= d);

    }
}
