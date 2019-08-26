import java.util.Scanner;


public class perm{
	static String Rotation(String s,int i){
		return s.substring(s.length()-i)+s.substring(0,s.length()-i);
	}
	
	static String Combination(int level,int n,String s) {
		String ans;
		if(level<n) {
			if(level==0) {
				ans = Combination(level+1,n,String.valueOf((char)(65+n-level-1)));
				if(level==n-1) {
					System.out.println(ans);
					}
			}else {
				for(int i=0;i<level+1;i++) {
					ans = Combination(level+1,n,Rotation((char)(65+n-level-1)+s,i));
					if(level==n-1) {
						System.out.println(ans);
					}else {
						System.out.println();
					}
				}
			}
		}
		return s;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your integer:");
		int n = scan.nextInt();
		scan.close();
		
		Combination(0,n,"");
		
		
	}

}