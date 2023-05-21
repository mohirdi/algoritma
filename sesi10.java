public class Sesi10{
    public static void main(String[] args) {
        String[] data = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};
        
        System.out.println("Data Kota sebelum diurutkan:");
        tampilkanData(data);
        
        insertionSort(data);
        
        System.out.println("\nData Kota setelah diurutkan:");
        tampilkanData(data);
    }
    
    public static void insertionSort(String[] data) {
        int l = data.length;
        
        for (int i = 1; i < l; i++) {
            String key = data[i];
            int j = i - 1;
            
            while (j >= 0 && data[j].compareTo(key) < 0) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            
            data[j + 1] = key;
        }
    }
    
    public static void tampilkanData(String[] data) {
        for (String kota : data) {
            System.out.println(kota);
        }
    }
}