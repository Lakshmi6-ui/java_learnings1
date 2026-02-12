class array1d{
  public static void main(String[] args){
    int[] numbers={10,20,30,40,50};
    System.out.println("First number: "+numbers[0]);
    System.out.println("Second number: "+numbers[2]);
    System.out.println("Third number: "+numbers[4]);
  }
}

//print all elements using for loop
class array1dprint{
    public static void main(String[] args){
      int[] numbers={10,20,30,40,50};
      for(int i=0;i<numbers.length;i++){
        System.out.println(numbers[i]);
      }
    }
}

//print using enhanced for loop
class array1denchanced{
  public static void main(String[] args){
    int[] numbers={10,20,30,40,50};
    int sum=0;
    for(int num:numbers){
      sum=sum+num;
    }
    System.out.println("sum:"+sum);

  }
}

class array1max{
  public static void main(String[] args){
    int[] numbers={10,20,30,40,50};
    int max=0;
    for(int num:numbers){
      if(num>max){
        max=num;
      }
    }
    System.out.println("max:"+max);

  }
}

class arraymin{
  public static void main(String[] args){
    int[] numbers={10,20,30,40,50};
    int min=numbers[0];
    for(int num:numbers){
      if(num<min){
        min=num;
      }
    }
    System.out.println("min:"+min);
  }
}

//2D array
 class Main{
  public static void main(String[] args){
    int[][] numbers={{1,2,3},{4,5,6}};
    System.out.println(numbers[0][0]);
  }
}

//initalisizing the array
class demo{
  public static void main(String[] args){
   // String[] playlists={"song1","song2","song3"};
   // System.out.println(playlists[0]);
    String[] playlists1=new String[3];
    playlists1[0]="song1";
    System.out.println(playlists1[0]);
    playlists1[1]="song2";
    System.out.println(playlists1[1]);
    }
}

//find the max of array
class arraymax{
  public static void main(String[] args){
    int[] array={10,30,60,80};
    int max=0;
    for(int i=0;i<array.length;i++)
    {
      if(array[i]>max){
        max=array[i];
      }
    }
    System.out.println("Max:"+max);
  }
}