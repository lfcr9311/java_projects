package Others;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        
        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            number = sc.nextInt();
            array[i] = number;
        }
        
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
            ;
        }

        System.out.println(sum);

        sc.close();
    }
}
