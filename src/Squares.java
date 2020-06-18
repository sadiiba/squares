import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number \t\t Square");
        System.out.println("Enter a number: ");
      int userInput = sc.nextInt();
        for(int i=1;i <=userInput; i++){
            System.out.println(i +"\t\t"+i*i);
        }
           System.out.println("loop ends");



























    }
}
