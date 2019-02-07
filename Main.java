/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int userNumber = myScanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= userNumber; i++) {
        sum += i;
        }
        
        System.out.println(sum);
        
        
        
        
    }
}
