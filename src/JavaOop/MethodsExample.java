package JavaOop;
import java.util.Scanner;

public class MethodsExample {
    int[] numbers = {1, 18, 34, 6, 68};
    boolean isThere;

    public static void main(String[] args) {
        MethodsExample methodsExample = new MethodsExample();
        methodsExample.searchNumber(18);
        System.out.println("Girilen isim" + "=" + inputScannerString());
        String s = inputScannerString();

        int totalCount = 0;
        int cLive[] = {1, 2, 1, 5, 6, 1};
        for (int a : cLive) {
            if (a == 1) {
                totalCount ++;
            }
        }
        System.out.println("totalCount = " + totalCount);


    }

    public void searchNumber(int a) {
        int inputNumber = a;
        for (int sNumber : numbers) {
            if (sNumber == inputNumber) {
                isThere = true;
                messageShow("Tebrikler Doğru Tahmin");
                break;
            } else {
                messageShow("Yanlış Tahminde Bulundunuz ");
            }

        }
    }

    public static int mRandom() {
        int random = (int) (Math.random() * 50);
        return random;

    }

    public static void messageShow(String string) {
        System.out.println(string);
    }

    public static String inputScannerString() {
        Scanner scanner = new Scanner(System.in);
        messageShow("Lütfen Bir isim giriniz");
        return scanner.nextLine();
    }

    public static int inputScannerInt() {
        Scanner scanner = new Scanner(System.in);
        messageShow("Lütfen Bir Sayı Giriniz");
        return scanner.nextInt();
    }


}
