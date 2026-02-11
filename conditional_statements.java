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