import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача1");
        int[] arrInt = new int[]{1, 2, 3};

        double[] arrDouble = new double[]{1.57, 7.654, 9.986};

        char[] arrChar = new char[]{60, 12, 38};
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrDouble));
        System.out.println(Arrays.toString(arrChar));

    }
    public static void task2() {
        System.out.println("Задача2");
        int[] arrInt = new int[]{1, 2, 3};
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]);
            if (i != arrInt.length-1){
                System.out.print(", ");
            }

        }
        System.out.println(" ");
        double[] arrDouble = new double[]{1.57, 7.654, 9.986};
        for (int a = 0; a < arrDouble.length; a++) {
            System.out.print(arrDouble[a]);
            if (a != arrDouble.length-1){
                System.out.print(", ");
            }

        }
        System.out.println(" ");
        char[] arrChar = new char[]{60, 12, 38};
        for (int b= 0; b < arrChar.length; b++) {
            System.out.print(arrChar[b]);
            if (b != arrChar.length-1){
                System.out.print(", ");
            }

        }

        System.out.println(" ");

    }

    public static void task3() {
        System.out.println("Задача3");
        int[] arrInt = new int[]{1, 2, 3};
        for (int i = arrInt.length-1; i >=0; i--) {
            System.out.print(arrInt[i]);
            if (i != 0){
                System.out.print(", ");
            }

        }
        System.out.println(" ");
        double[] arrDouble = new double[]{1.57, 7.654, 9.986};
        for (int a = arrDouble.length-1; a >=0; a--) {
            System.out.print(arrDouble[a]);
            if (a !=0){
                System.out.print(", ");
            }

        }
        System.out.println(" ");
        char[] arrChar = new char[]{60, 12, 38};
        for (int b = arrChar.length-1; b >=0; b--) {
            System.out.print(arrChar[b]);
            if (b != 0){
                System.out.print(", ");
            }

        }
        System.out.println(" ");
    }

    public static void task4() {

        System.out.println("Задача4");
        int[] arrInt = new int[]{2, 3, 4};
        for (int i = 0; i <arrInt.length; i++) {
            if (arrInt[i]%2==0){
                arrInt[i]+=1;
            }

        }
        System.out.println(Arrays.toString(arrInt));

    }

}