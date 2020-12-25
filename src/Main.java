public class Main {

    public static void soutArray (int[][] array,int n, int m){

        System.out.println("Random array "+n+"*"+m+":");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void task1 (int[][] array){
        int lastNumFromFirsString = array[0][array[0].length-1];
        int firsNumFromLastString = array[array.length-1][0];
        System.out.println("элемент, расположенный в правом верхнем углу: "+lastNumFromFirsString);
        System.out.println("элемент в левом нижнем углу массива: "+firsNumFromLastString);

    }

    public static void main(String[] args) {
        int n = (int) (Math.random() * 8 + 2);
        int m = (int) (Math.random() * 7 + 3);

        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        soutArray(array,n,m);
        task1(array);
    }

}
