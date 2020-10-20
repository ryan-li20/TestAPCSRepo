public class Demo{
  public static void print(int n){
    for(int i = n; i > 0; i--){
      for(int j = 0; j < i; j++){
        System.out.print(n-i+1);
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    int arg = Integer.parseInt(args[0]);
    Demo.print(arg);
  }
}
