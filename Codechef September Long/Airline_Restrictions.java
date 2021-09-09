import java.util.Scanner;

public class Airline_Restrictions {
    
    public static void print(final int n1, final int n2, final int n3, int D, int E){
        if ( ((n1+n2)<=D && n3<=E) || ((n1+n3)<=D && n2<=E) || ((n2+n3)<=D && n1<=E) ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        
        // final int highest = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
        // final int lowest = n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3;
        // final int middle = n1 != highest && n1 != lowest ? n1 : n2 != highest && n2 != lowest ? n2 : n3;

        // if( lowest+highest<=D && middle<=E ){
        //     System.out.println("YES");
        // }else{
        //     System.out.println("NO");
        // }

    }
    public static void main(String[] args) {
        int t,a,b,c,d,e,i=1;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(i <= t){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            print(a, b, c, d, e);
            t--;

        }     
        
    }
}