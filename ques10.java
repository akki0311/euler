import java.util.Scanner;
public class ques10{
public static void main(String args[]){
    long sum=2;
    long temp=0;
    Scanner sc=new Scanner(System.in);
    
    for(long i=2;i<2000000;i++){
        for(long j=2;j<=Math.sqrt(2000000);j++){
            if(i%j!=0){
                sum=sum+i;
            }
            else
            {
                temp++;
            } 
            
        }

    }

    System.out.println(sum);
     

}

}