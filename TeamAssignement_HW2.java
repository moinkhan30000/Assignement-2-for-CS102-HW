import java.util.Arrays;
import java.util.Scanner;

public class TeamAssignement_HW2 {
    
    public static int[] createAndFill(int arraySize){
        
        int[] arr = new int[arraySize];
        int index = 0;
        
        while(index < arraySize){
            arr[index] = (int)Math.round(Math.random() * 100);
            index++;
        }

        return arr;

    }

    public static int findMax(int arr[]){

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
        
    }

    public static int findMin(int arr[]){

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
        
    }
    public static int sumOfOdd(int[] array){
    int sum = 0;
    if(array.length>1)
    for(int i = 1 ; i < array.length ; i++){
     if(i%2 != 0){
      sum += array[i] ;
     }
    }
    return sum ;
 }

 public static int sumOfEven(int[] array){
    int sum = 0;
    for(int i = 0 ; i < array.length ; i++){
     if(i%2==0){
      sum += array [i] ;
     }
    }
    return sum ;
 }

    public static double[] differenceOfAverageOfArray(int s[])
    {
        int sizeOfArray = s.length;
        double sumOfArray = 0 ;
        double averageOfArray;
        for(int i=0; i<sizeOfArray; i++)
        {
            sumOfArray = sumOfArray + s[i];
        }
        averageOfArray = sumOfArray/sizeOfArray;
        double s2[] = new double[sizeOfArray];
        for (int j = 0; j<sizeOfArray; j++)
        {
            double difference;
            difference = s[j] - averageOfArray;
            s2[j] = difference;
        }
        return s2;
    }
    
    public static void main(String[] args) {
        int arraySize;
        System.out.print("Enter the array size: ");
        Scanner input = new Scanner(System.in);
        arraySize = input.nextInt();
        int[] array = createAndFill(arraySize);
        System.out.println(Arrays.toString(array));
        System.out.print("Menu: \n1-Find the differences from the average as an array \n2-Find the sum of the even indexes of the array \n3-Find the sum of the odd indexes of the array \n4-Find the minimum of the array \n5-Find the maximum of the array \n6-Quit \nEnter choice: ");
        int choice = input.nextInt();
        while(choice!=6){
            if(choice==1){
            System.out.println(Arrays.toString(differenceOfAverageOfArray(array)));
            }else if (choice==2){
            System.out.println(sumOfEven(array));
            }else if(choice==3){
            System.out.println(sumOfOdd(array));
            }else if(choice==4){
            System.out.println(findMin(array));
            }else if(choice==5){
            System.out.println(findMax(array));
            }
            System.out.print("Menu: \n1-Find the differences from the average as an array \n2-Find the sum of the even indexes of the array \n3-Find the sum of the odd indexes of the array \n4-Find the minimum of the array \n5-Find the maximum of the array \n6-Quit \nEnter choice: ");
            choice = input.nextInt();
        } 
        input.close();
    }
}
