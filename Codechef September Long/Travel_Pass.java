
import java.util.Scanner;


public class Travel_Pass {
   
    public static void main(String[] args) {
        int t,n,a,b;
        String s;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(1<= t){
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        s=sc.next();

        
        int zeros = s.length() - s.replaceAll("0", "").length();
        int ones = s.length() - s.replaceAll("1", "").length();
        
        System.out.println((a*zeros) + (b*ones));

        t--;
        
        
        }
        

          
        
    }
}