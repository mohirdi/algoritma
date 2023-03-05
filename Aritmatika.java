import java.util.Scanner;

public class        Aritmatika {

   public static void main(String[] args) {

       double bilangan1;
       double bilangan2;
       char operator;
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Masukkan bilangan 1: ");
           bilangan1 = scanner.nextDouble();
           System.out.print("Masukkan bilangan 2: ");
           bilangan2 = scanner.nextDouble();
           System.out.print("Masukkan operator (+, -, *, /, %): ");
           operator = scanner.next().charAt(0);
       }

      double hasil;

      switch (operator) {
         case '+':
            hasil = bilangan1 + bilangan2;
            System.out.printf("Hasil penjumlahan %.1f dan %.1f adalah %.1f", bilangan1, bilangan2, hasil);
            break;
         case '-':
            hasil = bilangan1 - bilangan2;
            System.out.printf("Hasil pengurangan %.1f dan %.1f adalah %.1f", bilangan1, bilangan2, hasil);
            break;
         case '*':
            hasil = bilangan1 * bilangan2;
            System.out.printf("Hasil perkalian %.1f dan %.1f adalah %.1f", bilangan1, bilangan2, hasil);
            break;
         case '/':
            hasil = bilangan1 / bilangan2;
            System.out.printf("Hasil pembagian %.1f dan %.1f adalah %.1f", bilangan1, bilangan2, hasil);
            break;
         case '%':
            hasil = bilangan1 % bilangan2;
            System.out.printf("Hasil modulus %.1f dan %.1f adalah %.1f", bilangan1, bilangan2, hasil);
            break;
         default:
            System.out.println("Operator yang dimasukkan tidak valid!");
            break;
      }
   }
}