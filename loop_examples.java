//simple For loop
class forloop{
  public static void main(String[] args) {
    for(int i=1;i<=5;i++){
      System.out.println(i);
    }
  }
}

class forloop1{
  public static void main(String[] args) {
    for(int i=1;i<=50;i++){
      while(i%2==0){
        System.out.println(i);
        i++;
      }
    }
  }
}

class forloop2{
  public static void main(String[] args) {
    int sum=0;
    for(int i=0;i<=10;i++){
      sum=sum+i;
    }
    System.out.println(sum);
  }
}

//whileloop
class whileloop{
  public static void main(String[] args) {
    while(true){
      System.out.println("hello");
      break;
    }
  }
}

//do-while loop
class dowhileloop{
  public static void main(String[] args) {
    int i=1;
    do{
      System.out.println(i);
      i++;
    }while(i<=10);
  }
}

