class ques5
{
public static void main(String args[]){
int num=1,p,count=0,k=0;
while(num>0&&k<=0){
for(int i=1;i<=20;i++){
	p=num%i;
	count++;
	while(p!=0){
	count=0;
	break;
			}
	if(count==20){
	k++;
	System.out.println(num);
			}	
		}
	num++;
	    }
	  } 
	}	