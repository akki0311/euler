 class test
{
	public static void main(String[] args)  {
		System.out.println(new test().run());

	}
	public String run(){
		for (int a=1;a<1000; a++ ) {
			 for (int b=a+1;b<1000; b++) {
			 	int c=1000-a-b;
			 	if (a*a + b*b==c*c)
			 	
			 		 return Integer.toString(a*b*c);
			 		 	
			 }

		}
		throw new AssertionError("not found");
	}
}