public class math{
   public static int add( int x,int y){
     return x+y;
   }
   public static int sub( int x,int y){
     return x-y;
   }
   public static int mul( int x,int y){
     return x*y;
   }
   public static int div( int x,int y){
     return x/y;
   }
   public static int mod( int x,int y){
     return x%y;
   }
 
 public static void main(String[]args){
   int x=3;
   int y=7;
    
   System.out.println(add(x,y));
   System.out.println(sub(x,y));
   System.out.println(mul(x,y));
   System.out.println(div(x,y));
   System.out.println(mod(x,y));
 }
}
