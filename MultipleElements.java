import java.util.function.Function;
public class MultipleElements {
    
    public static Function<int[],Long> sum = (i) -> {
          long res = 1;
          for(int a:i){
              res *= a;
          }
          return res;
     };
    public static void main(String args[]) {
      int[] l1 = {1,65,76,21,32,11};
      int[] l2 = {22,33,44,76,89,20,29};
      int[] l3 = {99,61,25,43};
      int[] l4 = {12,12,32,45,75,25,41};
      System.out.println(sum.apply(l1));
      System.out.println(sum.apply(l2));
      System.out.println(sum.apply(l3));
      System.out.println(sum.apply(l4));
    }
}
//OUTPUT IS
// 36516480
// 125320145280
// 6491925
// 15940800000
