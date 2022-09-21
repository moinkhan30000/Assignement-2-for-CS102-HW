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

    public static void main(String[] args) {
        
    }
}
