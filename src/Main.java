import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 */
public class Main {

    //斐波那契数列
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int value = Integer.parseInt(n);

        int fibonaci = fibonaci(value);
        System.out.println("fibonaci :" + fibonaci);


      //  System.out.println(":" + translate("李薏"));

    }

    /**
     * 斐波那契数列
     *
     * @param n
     * @return
     */

    public static int fibonaci(int n) {

        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int first = 1, seconde = 1, third = 0;

        for (int i = 3; i <= n; i++) {

            third = first + seconde;
            first = seconde;
            seconde = third;
        }
        return third;


    }

    //编码转换
    static String translate(String str) {
        String tempStr = "";
        try {
            tempStr = new String(str.getBytes("GBK"), "ISO-8859-1");
            tempStr = tempStr.trim();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return tempStr;
    }
}
