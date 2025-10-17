import java.util.Arrays;
import java.util.Scanner;

public class HomeWorck2 {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Введите размер массива: ");
            int N = sc.nextInt();

            int []a=new int[N];



            for (int i = 0; i < N; i++){
                System.out.print("Введите  "  + i +"  элемент массива :");
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);

            System.out.print("Введите целевое значение: ");

            int t = sc.nextInt();

            for (int i : a){

                System.out.println(i);
            }


            Sum ba = new Sum();

            int [] b = ba.twoSumSorted(a,t);

            for (int i : b){

                System.out.println(i);
            }

        }







}
