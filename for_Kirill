package MyJava;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.BiFunction;


class Main {
    static int z;
    static String num, w;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите сделать?" +
                "\n1:Перевести число из любой системы счисления в 10 - ую." +
                "\n2:Перевести число из 10 - ой в любую систему счисления. (Пока что поддерживаются только 16 - ая, 8 - ая и 2 - ая)" +
                "\n3:Перевести из любой системы счисления в определенную. (Пока что поддерживаются только целые числа)");
        int act = scanner.nextByte();
        switch (act) {
            case 1: {
                System.out.print("Введите число: ");
                num = scanner.next();
                System.out.print("Введите систему счисления: ");
                z = scanner.nextInt();
                break;
            }
            case 2: {
                System.out.print("Введите число: ");
                num = scanner.next();
                System.out.print("Введите систему счисления: ");
                z = scanner.nextByte();

                System.out.println(conversionFrom10_InAll(z,num));
                break;
            }
            case 3: {
                System.out.print("Введите число: ");
                num = scanner.next();
                System.out.print("Введите систему счисления этого числа: ");
                z = scanner.nextByte();
                System.out.print("Введите систему счисления, в которую хотите перевести число: ");
                w = scanner.next();

                System.out.println(conversionFromAll_InAll(z, num, w));
                break;
            }
        }

    }
    public static String conversionFromAll_InAll (int i, String num, String ss) {
        BigInteger a = new BigInteger(String.valueOf(num), i);
        String r = a.toString(Integer.parseInt(ss));
        return r;
    }

    public static String conversionFrom10_InAll (int i, String num) {
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
        if (num.indexOf('.') != -1)
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
        int i = 0, j, str = 10;
        String conv_num ="";
        j = (int) d;
        d -= j;
        if (num.indexOf('.') != -1)
            conv_num +=".";
        BigInteger a = new BigInteger(String.valueOf(j), str);
        String z = a.toString(Integer.parseInt("8"));

        while (d != 0 && i != 60) {
            d *= 1 << 3;
            j = (int) d;
            conv_num += String.valueOf(j);
            d -= j;
            i++;
        }
        z += conv_num;
        return z;
    }

    public static String conversion_to_16 (String num) {
        final char []A = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        double d = Double.parseDouble(num);
        int i = 0, j, str = 10;
        String conv_num ="";
        j = (int) d;
        d -= j;
        if (num.indexOf('.') != -1)
            conv_num +=".";
        BigInteger a = new BigInteger(String.valueOf(j), str);
        String z = a.toString(Integer.parseInt("16"));

        while (d != 0 && i != 60) {
            d *= 1 << 4;
            j = (int) d;
            conv_num += A[j];
            d -= j;
            i++;
        }
        z += conv_num;
        return z;
    }
}
