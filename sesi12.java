import java.util.Scanner;

public class sesi12{
    public static void main(String[] args) {
        String[][] dataMahasiswa = {
                { "1102021", "Andri Hariadi", "BANDUNG" },
                { "1102022", "Dewi Lestari", "SURABAYA" },
                { "1102023", "Dewi Agustin", "MALANG" },
                { "1102024", "Reni Indrayanti", "MALANG" },
                { "1102025", "Toni Sukmawan", "SURABAYA" },
                { "1102026", "Toni Gunawan", "BANDUNG" }
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama: ");
        String namaDicari = input.nextLine();

        int posisi = cariLinear(dataMahasiswa, dataMahasiswa.length, namaDicari);
        System.out.println("================");
        System.out.println("Hasil Pencarian:");

        if (posisi != -1) {
            int nomor = 1;
            for (int i = 0; i < dataMahasiswa.length; i++) {
                if (dataMahasiswa[i][1].contains(namaDicari)) {
                    System.out.println(nomor + ". " + dataMahasiswa[i][0] + " - " + dataMahasiswa[i][1] + " - "
                            + dataMahasiswa[i][2] + " - Data nomor " + (i + 1));
                    nomor++;
                }
            }
        } else {
            System.out.println("Data yang Anda cari tidak ditemukan");
        }
    }

    public static int cariLinear(String[][] data, int R, String X) {
        int posisi = -1;
        int I = 0;

        while (I < R) {
            if (data[I][1].contains(X)) {
                posisi = I;
                break;
            }
            I++;
        }

        return posisi;
    }
}