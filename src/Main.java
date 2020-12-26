import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[][] randomArray ( int string, int column, int min, int max) {

        int[][] randomArray = new int[string][column];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = min+(int)(Math.random()*(max-min+1));
            }
        }
        return randomArray;
    }

    public static void soutArray(int[][] array, int n, int m) {

        System.out.println("Random array " + n + "*" + m + ":");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task1(int[][] array) {
        int lastNumFromFirsString = array[0][array[0].length - 1];
        int firsNumFromLastString = array[array.length - 1][0];
        System.out.println("элемент, расположенный в правом верхнем углу: " + lastNumFromFirsString);
        System.out.println("элемент в левом нижнем углу массива: " + firsNumFromLastString);

    }

    public static void task2(int[][] array, int string, int column) {

        System.out.println("Elements of " + string + " string:");
        System.out.println(Arrays.toString(array[string - 1]));
//           Second method
//            for (int j = 0; j < array[string-1].length; j++) {
//                System.out.print(array[string-1][j] + "\t");
//            }
        System.out.println("Elements of " + column + " column:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][column - 1]);
        }
    }
    public static void soutString (int[][] array, int string) {

        System.out.println("Elements of string with max sum ("+(string+1)+"):");
        System.out.println(Arrays.toString(array[string]));
    }
    public static void task3 (int [][]array){
        int maxSum =0;
        int sumString =0;
        int indexMaxString = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                sumString+=array[i][j];
            }
            if (sumString>maxSum) {
                maxSum=sumString;
                indexMaxString=i;
            }
            sumString=0;
        }
        soutString(array,indexMaxString);
    }
    public static int task4 (int [][]array){
        int sumArray =0;
        int sumString =0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                sumString+=array[i][j];
            }
            sumArray+=sumString;
            sumString=0;
        }
        return sumArray;
    }

    public static void main(String[] args) {
        int quantityString = (int) (Math.random() * 2+ 1);
        int quantityColumn = (int) (Math.random() * 2 +2);
        int minOfDiapason = (int) (Math.random() * -1);
        int maxOfDiapason = (int) (Math.random() * 10);
        int [][] array=randomArray(quantityString,quantityColumn, minOfDiapason,maxOfDiapason);
        soutArray(array, quantityString, quantityColumn);
        //task1(array);
        int numStringForSout = 5;
        int numColumnForSout = 2;
        //task2(array, numStringForSout, numColumnForSout);
        //task3(array);
        // Task4 массив случайных чисел создавался для всех задач
        System.out.println("Summ of array: "+task4(array));
    }

}
