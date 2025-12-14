package JavaOperators;

public class ArithmaticOperator {
    public static void main(String[] args) {

        // 1. Penjumlahan
        int hasilPenjumlahan = 1 + 2 + 3 + 10;
        System.out.println("1 + 2 + 3 + 10 = " + hasilPenjumlahan);

        // 2. Pengurangan
        int hasilPengurangan1 = 20 - 5 - 3;
        int hasilPengurangan2 = 20 - 5 - 3 + 2;

        System.out.println("20 - 5 - 3 = " + hasilPengurangan1);
        System.out.println("20 - 5 - 3 + 2 = " + hasilPengurangan2);

        // 3. Perkalian
        int hasilPerkalian = 5 * 20;
        System.out.println("5 * 20 = " + hasilPerkalian);

        /* catatan : operator pada java bisa dimasukan ke variable seperti diatas atau
        langsung print seperti di bawah ini =
         */

        // 4. Pembagian
        System.out.println("20 / 5 = " + 20 / 5);

        // 5. Modulus (sisa hasil bagi)
        System.out.println("23 % 6 = " + 23 % 6);

        // 6. penjumlahan string
        System.out.println("Hallo nama saya Ubadillah umur saya " + 3 + " tahun");

        // 7. Operasi aritmatik dengan Float
        System.out.println(1.2f + 1.4f);
        System.out.println(1.2 + 1.4);
            // contoh Integer - Float atau Integer + Float
        System.out.println(5 - 2.5);
        System.out.println(5 + 2.5);

        float contoh1 = 5 - 2.49999995f;
        System.out.println(contoh1);

        float contoh2 = 5 + 2.49999995f;
        System.out.println(contoh2);
    }
}
