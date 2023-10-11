
package Lecture15;

public class Ques07 { 
  public static void main(String[] args) {
    try {
      method();
      System.out.println("After the method call");   
    }   
    catch (RuntimeException ex) {
      System.out.println("RuntimeException in main");   
    }   
    catch (Exception ex) {
      System.out.println("Exception in main");   
    }   
  }

  static void method() throws RuntimeException {
    try {
      String s ="abc";
      System.out.println(s.charAt(3));
    }
    catch (ArithmeticException ex) {
      System.out.println("RuntimeException in method()");   
    }       
    System.out.println("At the end of the method");   
  }
}
