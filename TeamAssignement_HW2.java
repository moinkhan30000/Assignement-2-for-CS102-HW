public class TeamAssignement_HW2 {
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
    
}
    public static void main(String[] args) {
        
    }
}
