package JavaOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        // And && (akan mengembalikan TRUE jika kedua nilai/expression adalah  TRUE
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);

            // contoh lain AND
        int nilai1 = 10;
        int nilai2 = 5;
        int nilai3 = 8;
        /* (nilaiA > nilaiB) adalah true,
        (nilaiC > nilaiB) adalah true
        -> true && true = true
         */
        boolean hasil1 = (nilai1 > nilai2) && (nilai2 < nilai3);
//        System.out.println(hasil1);

        // Or || akan mengembalikan TRUE jika salah satu nilai/expression adalah TRUE
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);

        // Contoh lain Or mengambil statment sebelum nya dari contoh AND
        // (10 < 5)nilai nya false || (5 < 8)nilai nya true
        boolean hasil2 = (nilai1 < nilai2) || (nilai2 < nilai3);
        System.out.println(hasil2);

        // Not !
//        System.out.println(!true);
//        System.out.println(!false);

        // contoh lain  berfungsi untuk membalikkan nilai boolean: true menjadi false, dan false menjadi true
        System.out.println(!hasil2);


    }
}
