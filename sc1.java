public class sc1 {
public static void main(String[] args) {
    var n = 10;
    var sum = 0;
    var product = 1;
    for (var i = 1; i <= n; i++) {
      sum += i;
      product *= i;
    }
    System.out.println(sum);
}
}