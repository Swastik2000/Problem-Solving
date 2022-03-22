
public class Josephus
{
    static int JP(int n, int k){
        if(n==0) return 0;
        else return(JP(n-1,k)+k)%n;
    }
	public static void main(String[] args) {
		System.out.println("Josephus problem");
		System.out.println(JP(5,3));
		
	}
}
