
 class ques10   {

   
    public static boolean isPrime(long num) {
         
        if (num < 2) 
            return false;
        
        else if (num == 2) 
            return true;
        
        for (int i = 2; i < Math.sqrt(num) + 1; i++)
            if (num % i == 0)
                return false;
            
        return true;
    }
    
    public static void main(String[] args) {
        
        long sum = 0;
        
        for (int i = 0; i < 2000000; i++)
            if (isPrime(i))
                sum = sum + i;

        System.out.print(sum);
    }
}