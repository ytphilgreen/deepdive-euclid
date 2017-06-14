package edu.cnm.deepdive.euclid;

public class Gcd {

  public static void main(String[] args) {
 
   try {
     int a = Integer.parseInt (args [0]);
     int b = Integer.parseInt(args [1]);
    int result = gcd ( a, b);
     
     System.out.printf("gcd %d %d %d" ,a, b, result);     
   }
   catch (NumberFormatException ex) {
     ex.printStackTrace();
     System.out.println ("i need two numbers");
     
   }
catch (ArrayIndexOutOfBoundsException ex) {
  System.out.println("i need two numbers");
  
}
  }

  public static int gcd (int a, int b) {
    a = Math.abs (a);
    b = Math.abs(b);
    if ( a ==0 ){
      return b;
    }
    if (b ==0){
      return a;
    }
    while (a != b) {
     if (a > b ) {
       a= a-b;
       
     } else {
      if (b > a) 
        b= b-a;
     }
    }
    return a;
  }

}