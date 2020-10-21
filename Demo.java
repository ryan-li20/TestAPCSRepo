public class Demo{
  public static void print(int n){
    for(int i = n; i > 0; i--){
      for(int j = 0; j < i; j++){
        System.out.print(n-i+1);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr){
    String output = "{";
    if(arr.length < 1){
      return output + "}";
    }
    for(int i = 0; i < arr.length-1; i++){
      output = output + arr[i] + ", ";
    }
    output = output + arr[arr.length-1] + "}";
    return output;
  }

  public static String arrayDeepToString(int[][] arr){
    String output = "{";
    for(int i = 0; i < arr.length-1; i++){
      output = output + arrToString(arr[i]);
      output = output + ", ";
    }
    output = output + arrToString(arr[arr.length-1]) + "}";
    return output;
  }

  public static void main(String[] args){
    int[] one = new int[3];
    int[] two = new int[5];
    int[] three = new int[14];
    int[] four = new int[6];
    int[] five  = new int[1];
    int[][] doble = {one, two, three, four, five};
    System.out.println(arrayDeepToString(doble));
    System.out.println(create2DArray(4,4,4));
    System.out.println(arrayDeepToString(create2DArray(4,4,4)));
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] two = new int[rows][cols];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        int give = (int) (Math.random()*maxValue+1);
        two[i][j] = give;
      }
    }
    return two;
  }
}
