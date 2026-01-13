import java.util.Scanner;
public class ok{
    public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       int[] number = {1,2,4,2,5,1,3,3,6,1};//arrays values number
    
    for(int i =0; i <number.length; i++){//to print the arrays number
        System.out.println(number[i]);
    }

    System.out.println("Enter a number");

    int num = scan.nextInt();//for the user to enter a number
    for(int i =0; i <number.length; i++){
  if(num == number[i]){//if the num == number of array it will print the i which is the index
    System.out.println("The index of numbers is "+ i);
    break;
  }
 
    }
    }
}