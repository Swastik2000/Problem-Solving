
public class TowerOfHanoi
{
    static void TOH(int n, int a, int b , int c){
        if(n>0){
            TOH(n-1,a,c,b);
            System.out.println("Move a disc from "+a+" To "+c);
            TOH(n-1,b,a,c);
        }
    }
	public static void main(String[] args) {
		System.out.println("Tower of Hanoi");
		TOH(2,1,2,3);
		
	}
}
