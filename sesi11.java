import java.util.Arrays;

public class sesi11{
    static int data[] = {7, 14, 21, 1, 25, 34, 90, 100, 95, 70};
    
    static int nilai_1 [] = {15, 20, 10, 45, 70, 5};
    static int nilai_2 [] = {19, 20, 30, 40, 45, 15, 5};
    
    static int min = data[0];
    static int index = 0;
    static int jumlahSwap = 0;
    
    public static void main(String[] args) {      
        System.out.println("Proses Swap:");
        goSort(nilai_1, "ASC");
        
        System.out.println("\nHasil dari Selection Sort:");
        tampilkanData(nilai_1);
         
        System.out.println("\nSwap yang dilakukan sebanyak: " + jumlahSwap + " Kali");
    }
    
    static void goSort(int[] nilai, String opsi){
        for (int j = 0; j < nilai.length-1 ; j++) {
            for (int i = j; i < nilai.length; i++) {
                if (opsi.equals("ASC")) {
                    if (nilai[i] < min) {
                        min = nilai[i];
                        index = i;
                    } 
                }
                else if(opsi.equals("DESC")){
                    if (nilai[i] > min) {
                        min = nilai[i];
                        index = i;
                    } 
                }
            }
            
            if (opsi.equals("ASC")) {
                if (min < nilai[j]) {
                    nilai[index] = nilai[j];
                    nilai[j] = min;
                    jumlahSwap++;
                }
            }
            else if (opsi.equals("DESC")) {
                if (min > nilai[j]) {
                    nilai[index] = nilai[j];
                    nilai[j] = min;
                    jumlahSwap++;
                }
            }
            min = nilai[j+1];

            System.out.println(Arrays.toString(nilai));
        }
    }
    
    static void tampilkanData(int[] nilai2) {
        for (int i = 0; i < nilai2.length; i++) {
            System.out.print(nilai2[i] + " - ");
        }
        System.out.println("");
    }
}