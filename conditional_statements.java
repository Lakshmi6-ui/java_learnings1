import java.util.Scanner;
//simple if statement
class ifexample{
  public static void main(String[] args){
    int age=18;
    if(age>=18){
      System.out.println("you are an adult");
    }
  }
}

//if-else statement
class if_else1{
  public static void main(String[] args){
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter value of num1:");
    int num1=scn.nextInt();
    System.out.println("Enter value of num2:");
    int num2=scn.nextInt();
    if(num1>num2)
    {
      System.out.println(num1+"is greater than "+num2);
    }
    else
    {
      System.out.println(num1+"is not greater than "+num2);
    }
  }
}

class ifelse2{
  public static void main(String[] args){
    int number=5;
    if(number%2==0)
    {
      System.out.println(number+ " is even");
    }
    else
    {
      System.out.println(number+ " is odd");
    }
  }
} 

//if-else-if staement
class elseif{
  public static void main(String[] args)
  {
    int marks=85;
    if(marks>=90){
      System.out.println("Grade:A");
    }
    else if(marks>=80){
      System.out.println("Grade:B");
    }
    else if(marks>=70){
      System.out.println("Grade:C");
    }
    else if(marks>=60){
      System.out.println("Grade:D");
    }
    else{
      System.out.println("Fail");
    }
  }
}

//Logical operators
class logicaloperators{
  public static void main(String[] args){
    int age=45;
    boolean hasTicket=true;
    //AND operator
    if(age>=18 && hasTicket){
      System.out.println("you can enter the movie");
    }
    //OR operator
    boolean isWeekend=true;
    boolean isHoliday=false;
    if(isWeekend || isHoliday){
      System.out.println("you can relaxe");
    }

    //NOT operator
    boolean isRaining=false;
    if(!isRaining){
      System.out.println("you don't need an umbrella");
    }
  }
}

//practice 1:to check the number is positive ,negative or zero
class demo{
  public static void main(String[] args){
    int num=10;
    if(num<0)
    {
      System.out.println("negative number");
    }
    else if(num>0)
    {
      System.out.println("positive number");
    }
    else
    {
      System.out.println("zero");
    }
  }
}

//practice 2:largest of three numbers
class largest{
  public static void main(String[] args){
    int a=12;
    int b=10;
    int c=90;
    if(a>b && a>c){
      System.out.println("a is largest");
    }
    else if(b>a && b>c){
      System.out.println("b is largest");
    }
    else{
      System.out.println("c is largest");
    }
  }
}

//practice 3:character is vowel or consonant using switch
class character{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a character: ");
    char ch=scn.next().charAt(0);
    switch(ch){
      case 'a':System.out.println("a is vowel");
      break;
      case 'e':System.out.println("e is vowel");
      break;
      case 'i':System.out.println("i is vowel");
      break;
      case 'o':System.out.println("o is vowel");
      break;
      case 'u':System.out.println("u is vowel");
      break;
      default:System.out.println("consonant");
      break;
    }
    
  }
}

