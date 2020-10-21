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
    print(Integer.parseInt(args[0]));
    //System.out.println(arrayDeepToString(create2DArrayRandomized(4,4,4)));
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] two = new int[rows][cols];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        int give = (int) (Math.random()*(maxValue+1));
        two[i][j] = give;
      }
    }
    return two;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] two = new int[rows][];
    for(int i = 0; i < rows; i++){
      int amt = (int)(Math.random()*(cols+1));
      two[i] = new int[amt];
    }
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < two[i].length; j++){
        int give = (int) (Math.random()*(maxValue+1));
        two[i][j] = give;
      }
    }
    return two;
  }
}
