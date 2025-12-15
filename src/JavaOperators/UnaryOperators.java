package JavaOperators;

public class UnaryOperators {

    /* Unary Operator adalah operator yang hanya memerlukan satu operand (satu nilai atau variabel)
     untuk bekerja
     */
    public static void main(String[] args) {
        // Decrement
        int a = 7;
        int b = 5;
        int c = -a;

            // Prefix (Nilai berubah sebelum statement (baris kode) tersebut selesai dieksekusi.)
        int hasil1 =  ++a; // a menjadi 8, hasil1 menjadi 8
        System.out.println("hasil Prefix = " + hasil1);
            //Postfix (Nilai berubah setelah statement (baris kode) tersebut selesai dieksekusi.)
        int hasil2 = b++; // hasil2 menjadi 5, b menjadi 6
        System.out.println("hasil Postfix = " + hasil2);

        // Increment
            // Prefix
        int hasil3 = --a;
        System.out.println("hasil Prefix increment = " + hasil3);
            // Postfix
        int hasil4 = b--;
        System.out.println("hasil Postfix increment = " + hasil4);

        // negatif
        System.out.println("negatif dari a = " + c);

        // not (Membalikkan nilai boolean (dari true menjadi false, dan sebaliknya).)
        boolean isHujan = true;
        boolean isPanas = !isHujan; // isPanas menjadi False.

        System.out.println(isPanas);

    }

}
