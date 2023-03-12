import java.util.Scanner;


public class tugassesi3 {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        
        System.out.println("\n1. Check Kata Palindrome");
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine().toLowerCase();

        if (kataPalindrome(kata)) {
            System.out.println(kata + " adalah Palindrome");
        } else {
            System.out.println(kata + " bukan Palindrome");
        }
        
        System.out.println("\n2. Mencari angka palindrome terdekat");
        System.out.print("Masukan angka: ");
        int angka = input.nextInt();
        
        int angkaPalindrome = M_angkaPalindrome(angka);
        System.out.println("Palindrome terdekat selanjutnya adalah: " + angkaPalindrome + "\n");
    }
    
    // Method untuk mengecek kata palindrome
    public static boolean kataPalindrome(String kata) {
        int i_kata = 0;
        int j_kata = kata.length()-1;

        while (i_kata < j_kata) {
            if (kata.charAt(i_kata) != kata.charAt(j_kata)) {
                return false;
            }
            i_kata++;
            j_kata--;
        }
        return true;
    }
    
    //Method untuk menambahkan angka 1 ke angka inputan
    public static int M_angkaPalindrome(int angka) {
        int angkaSelanjutnya = angka + 1;
        while (!Palindrome(angkaSelanjutnya)) {
            angkaSelanjutnya++;
        }
        return angkaSelanjutnya;
    }
    
    // Method untuk mengecek angka palindrome
    public static boolean Palindrome(int angka) {
        int i_angka = 0;
        int j_angka = angka;
        while (j_angka != 0) {
            int angkaMasuk = j_angka % 10;
            i_angka = i_angka * 10 + angkaMasuk;
            j_angka /= 10;
        }
        return (i_angka == angka);
    }
}