
import java.util.Scanner;


public class PalindromeString {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String originalString = sc.nextLine();
        
        String a = reverseNum(originalString);
        System.out.println(a);
        
        //compare
        if(originalString.equals(a)){
            System.out.println(originalString + " is a palindrome String.");
        }
        else{
            
            System.out.println(originalString + " is not a palindrome String.");
        }
    }
    //reverse the string
    public static String reverseNum(String num){
        String reverse = "";
        
        for(int i = num.length()-1; i >= 0; i--){
            reverse = reverse + num.charAt(i);
            
        }
        return reverse;
        
    }
    
    
}
