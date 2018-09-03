public class ques6{
	public static void main (String[]args) {
		
		int num = 1, sum1 = 0, sum2 = 0;
		
		while(num < 101)
		
		{
			sum1 = sum1 + (num*num);
			sum2 = sum2 +num;
			num++;
		}
		
		sum2= sum2*sum2;
		System.out.println(sum2-sum1);
	  }
	}