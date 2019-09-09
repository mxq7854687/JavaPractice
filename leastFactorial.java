import java.util.*;


public class leastFactorial {
	static int leastFac(int n) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    int factorial = 1;
	    int result = 0;
	    
	    list.add(factorial);
	    for(int i =1;i<120;i++){
	        factorial = factorial*(i+1);
	        list.add(factorial);
	    }    
	    for(int fac:list){
	        if(fac>=n){
	            result = fac;
	            break;
	        }
	    }
	    return result;
	}
	
	public static void main(String []args) {
		System.out.println(leastFac(17));
		System.out.println(leastFac(119));
		System.out.println(leastFac(146));
	
	}
	
}
