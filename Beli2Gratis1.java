import java.util.Scanner;


public class Beli2Gratis1 {
 
  public static void main(String[] argx) {
    Scanner in = new Scanner(System.in);
  
  //tampilan masukan
  int barang;
  System.out.print("Masukan Jumlah Barang :");
  barang = in.nextInt();
  int diskon=barang/2;
  int total = barang+diskon;
  System.out.println("Jumlah Bonus :" +diskon);
  System.out.println("Total item yang dibawa pulang :" +total);
  System.out.println("Total Harga :" +barang*25000);
 }
}
  
