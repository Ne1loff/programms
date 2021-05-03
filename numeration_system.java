package MyJava;

import java.math.BigInteger;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Ведите число в любой системе счисления: ");
        String s = scanner.nextLine();
        System.out.print("Ведите систему счисления вашего числа: ");
        String str = scanner.nextLine();
        System.out.print("Ведите систему счилсления для перевода: ");
        String t = scanner.nextLine();

        BigInteger a = new BigInteger(s, Integer.parseInt(str));
        String z = a.toString(Integer.parseInt(t));

        System.out.println("Число "+ s +" в " +
                str + " системе счисления = " +
                z +" в " + t + "-ричной ситстеме счисления.");*/
        String num = scanner.nextLine();
        int z = scanner.nextByte();

        System.out.println(conversion(z,num));
    }

    public static String conversion (int i, String num) {
        switch (i) {
            case 2:
                return conversion_to_2(num);
            case 8:
                return conversion_to_8(num);
            case 16:
                return conversion_to_16(num);
            default:
                return "Конверсия в данную систему счисления не производиться((";
        }
    }

    public static String conversion_to_2 (String num) {
        double d = Double.parseDouble(num);
        int i = 0, j, str = 10;
        String conv_num ="";
        j = (int) d;
        d -= j;
        conv_num +=".";
        BigInteger a = new BigInteger(String.valueOf(j), str);
        String z = a.toString(Integer.parseInt("2"));

        while (d != 0 && i != 60) {
            d *= 1 << 1;
            j = (int) d;
            conv_num += String.valueOf(j);
            d -= j;
            i++;
        }
        z += conv_num;
        return z;
    }

    public static String conversion_to_8 (String num) {
        double d = Double.parseDouble(num);
        int i = 0, j;
        String conv_num ="";
        j = (int) d;
        conv_num += j + ".";

        while (d != 0 && i != 60) {
            d *= 1 << 3;
            j = (int) d;
            conv_num += String.valueOf(j);
            d -= j;
            i++;
        }
        return conv_num;
    }

    public static String conversion_to_16 (String num) {
        final char []A = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        double d = Double.parseDouble(num);
        int i = 0, j;
        String conv_num ="";
        j = (int) d;
        conv_num += j + ".";

        while (d != 0 && i != 60) {
            d *= 1 << 4;
            j = (int) d;
            conv_num += A[j];
            d -= j;
            i++;
        }
        return conv_num;
    }
}
