import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleDecimalToBinaryUsingRecursion {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a decimal number");
    int num = Integer.parseInt(br.readLine());
    decToBin(num);
  }

  public static void decToBin(int n) {
    if (n > 0) {
    decToBin(n / 2);
    System.out.printf("%d", n % 2);
    }
    }
}
