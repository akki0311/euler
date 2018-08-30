import java.util.Scanner;
class Test{

  getSmallestDivisor(n){
  var i = n;

 
  function check(i)
  {
    for (var j = 1; j <= n; j++) {
            if( i % j !== 0 ){ return false; }
  };
    return true;
  }
 
  while( !(check(i)) ){ i+=n; }
  return i;
}
}
class testApp
{
 public static void main(String[] args) {
   int n=20;
   test ob=new test();
   System.out.println(ob);
 }
}