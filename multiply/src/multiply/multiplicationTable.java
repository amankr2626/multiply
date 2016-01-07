package multiply;

 
class MultiplicationTable
{
   public static void main(String args[])
   {
      int n, c;
      System.out.println("Enter an integer to print it's multiplication table");
      java.util.Scanner scn = new java.util.Scanner(System.in);
      n = scn.nextInt();
      System.out.println("Multiplication table of "+n+" is :-");
 
      for ( c = 1 ; c <= 10 ; c++ )
         System.out.println(n+"*"+c+" = "+(n*c));
   }

	

}
