import java.util.Scanner;

class AToZ{
	
	int []create(int n) {
		char character = 'A';
		int ascii= (int)character;
		int []atoz = new int[n];
		for(int l=0;l<n;l++) {
			atoz[l]=ascii+l;
		}	
		return atoz;
	}
	int[]swap(int[]myint,int i , int j) {
		int temp = myint[i];
		myint[i]=myint[j];
		myint[j]=temp;
		return myint;
	}
	
}

public class perm{
	static int factorial(int n) {
		if (n==1) {
			return n;
		}
		return n*factorial(n-1);
	}
	
	static void temp(int[]arr,int n) {
		int[][]storage = new int[n][2*n];
		
		int counter = 0;
		for(int i=0;i<n;i++) {
			for(int j=i; j<arr.length+i;j++) {
				if(counter==arr.length) {
					counter=0;
				}
				storage[i][j] = arr[counter];
				System.out.print((char)(storage[i][j]));
				counter++;
			}
			counter--;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("please enter:");
		int n = scan.nextInt();
		scan.close();
		
		AToZ atoz = new AToZ();
		int []arr = atoz.create(n);
		
		temp(arr,n);
		System.out.println();
		for(int i=1;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int []swapedArray = atoz.swap(arr, i,j);
				temp(swapedArray,n);
				System.out.println();
			}
		}

		System.out.println("end");
	}

}