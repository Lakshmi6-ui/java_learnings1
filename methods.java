import java.util.Scanner;
//method with no return & no parameters & with parameters

class Example1{
  void hello() {
    System.out.println("Hello");
  }
  void add(int a,int b){
    System.out.println(a+b);
  }

  public static void main(String[] args) {
    Example1 obj = new Example1();
    obj.hello();
    obj.add(10,20);
  } 
}

//method with return and no parameters
class Example2{
  int getNumber(){
    return 10;
  }
  public static void main(String[] args) {
    Example2 obj = new Example2();
    int result=obj.getNumber();
    System.out.println(result);
  }
}

class Example3{
  //static method-no object needed
  static void staticMethod(){
    System.out.println("Static method");
  }

  //instance method-need object
  void instanceMethod(){
    System.out.println("Instance method");
  }

  public static void main(String[] args){
    //call static method directly
    staticMethod();
    //call instance method through object
    Example3 obj=new Example3();
    obj.instanceMethod();
  }

}

//user input example
class Example4{
  void greet(String name) {
    System.out.println("Hello "+name);
  }

  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name=scn.nextLine();
    Example4 obj=new Example4();
    obj.greet(name);
  }
}