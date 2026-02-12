//check if string is palindrome
//time complexity: O(n) Spsace complexity: O(1)
class palindrome{
  public static boolean ispalindrome(String str){
    int left=0,right=str.length()-1;

    while(left<right){
      if(str.charAt(left) != str.charAt(right)){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  //approch 2: Reverse and compare
  public static boolean ispalindromereverse(String str){
    String reverse=new StringBuilder(str).reverse().toString();
    return str.equals(reverse);
  }

  public static void main(String[] args) {
    String[] testCases = {"madam", "racecar", "hello", "level", "civic", "deed", "rotator"};  

    System.out.println("Test Cases:");
    for (String test : testCases) {
      System.out.println(test + ": is palindrome " + ispalindrome(test));
    }
  }
}