
public class ropeCutting
{
    static int maxp(int n, int a, int b , int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int res=Math.max(maxp(n-a,a,b,c), Math.max( maxp(n-b,a,b,c), maxp(n-c,a,b,c)));
        
        if (res == -1) return -1;
        
        return res+1;
    }
	public static void main(String[] args) {
		System.out.println("Rope Cutting Problem");
		System.out.println(maxp(23,11,9,12));
		
	}
}
