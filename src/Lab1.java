
/**
 *
 * @author Azin Mobedmehdiabadi
 */
import java.util.Scanner;
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        for (int i = 0; i < 5; i++) {

            System.out.printf("Enter number%d: ",i+1);
            number = input.nextInt();
            if (number>0) {
                positiveCount++;
            }else if(number<0){
                negativeCount++;
            }else if(number==0){
                zeroCount++;
            }
        }
        System.out.printf("Number of Positive numbers input: %d%n", positiveCount);
        System.out.printf("Number of Negative numbers input: %d%n", negativeCount);
        System.out.printf("Number of Zeros input: %d%n", zeroCount);
        
    }
    
}
