package day_06;

public class C07 {
    public static void main(String[] args) {


            int[][] arr = {{3,5,7},{1,22,4},{1,2},{7}};

            // Toplam element sayisini ve elementlerin toplamini bulunuz ?

        int elementSayisi=0;
        for (int i = 0; i < arr.length ; i++) {
        elementSayisi += arr[i].length;
        }
        System.out.println("Toplam element sayısı : " + elementSayisi);

        int elementlerToplami=0;
        for (int i = 0; i <arr.length ; i++) {
        for (int j = 0; j <arr[i].length ; j++) {
        elementlerToplami+= arr[i][j];
        }
        }
        System.out.println("Elementlerin toplami : " + elementlerToplami);



    }
}
