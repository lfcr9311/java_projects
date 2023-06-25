import java.util.Random;

public class Sort {
    
    
    
    
    public static void main(String[] args) {
        final int array[] = new int[50];

        Random random = new Random();
        
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        BubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }      

    public static void BubbleSort(int[] array){
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]> array[j+1]){
                    int aux = array[j];
                    array[j]=array[j+1];
                    array[j+1] = aux;
                }
            }
            }
        }
}
