 class ques5{
	
	public static long gcd(long a, long b) {

	    long x;
	    
	    if (b > a) {
	         x = a;
	         a = b;
	         b = x;
	    }

	    while (b != 0) {
	        x = a%b;
	        a = b;
	        b = x ;

	    }
	  return a;
	
	}	
	
	public static long lcm(long a, long b) {
		
		return a*b/gcd(a, b);
		
	}
	
	
 public static void main (String[]args) {
	 
	long l = 1;
	for(int i = 2; i < 21; i++)
		l = lcm(l,i);
	 
	 System.out.println(l);
 }
       }
	