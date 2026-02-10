import java.lang.System;
import java.util.Scanner;
class user_input_int{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    System.out.println("The value of a is: "+a);
  }
}

class user_input_string{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    String a=scn.nextLine();
    System.out.println("The value of a is: "+a);
  }
}

class user_input_float{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    float a=scn.nextFloat();
    System.out.println("The value of a is: "+a);
  }
}

class addition_of_two_numbers{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a=scn.nextInt();
    System.out.println("Enter second number: ");
    int b=scn.nextInt();
    int sum=a+b;
    System.out.println("The sum is: "+sum);
  }
}

class user_input_double{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    double a=scn.nextDouble();
    System.out.println("The value of a is: "+a);
  }
}
    
class user_input_long{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    long a=scn.nextLong();
    System.out.println("The value of a is: "+a);
  }
}