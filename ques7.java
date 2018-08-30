public class ques7
{
	public static void main(String[] args) {
		int count=0;
		int prime_num=0;
		for (int num=2;num<10000000;num++ ) {
			boolean prime=true;
			  	 for (int factor=2;factor<num;factor++ ) {
			  	 	   if (num % factor == 0) {
                         prime = false;
                           break;	 	
			  	 }
		}
		     if (prime) {
                prime_num = num;
                count++;
            }
            if (count == 10001) {
                break;
	        }

       }
        System.out.println(prime_num);
    }
  }