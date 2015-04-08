import java.util.Scanner;

class belahketupat {
  public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input tinggi : ");
        int n=scn.nextInt();
     

    for (int i = 1; i < n; i += 2) {
      for (int j = 0; j < 4 - i / 2; j++)
        System.out.print("*");

      for (int j = 0; j < i; j++)
        System.out.print(" ");
        System.out.print(" ");
    }

    for (int i = n; i > 0; i -= 2) {
      for (int j = 0; j < 4 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print(" ");
        System.out.print(" ");
    }
  }
}
