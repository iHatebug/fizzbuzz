/**
 * Created by Hanze on 24/11/2018.
 */
public class FizzBuzz {

    public static void printFizzBuzz(int n){
        for(int i=1; i<=n; i++){
            if(i % 3 == 0){
                if(i % 5 ==0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public static void enhanceFizzBuzz(int n){
        for(int i=1; i<=n; i++){
            if(i % 3 == 0 || String.valueOf(i).indexOf('3') != -1){
                if(i % 5 == 0 || String.valueOf(i).indexOf('5') != -1) {
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if(i % 5 == 0 || String.valueOf(i).indexOf('5') != -1){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
