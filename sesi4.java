
public class sesi4 {
    public static void main(String[] args) {
        System.out.println("Tugas sesi 4 \n");

        char hotel [][] = {
            // Kamar (Kolom) 1, 2, 3, 4, 5
            // Lantai (Baris) 1, 2, 3, 4          
            {'*', '*', '*', '*', 'X'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', 'X', '*'}
        };
        
        char kamarIsi = 'X';
        char kamarKosong = '*';
        int jumlahKamar = hotel.length;
        int jumlahKamarKosong = 0;
        
        for(int lantai = 0; lantai < jumlahKamar; lantai++){
            for(int kamar = 0; kamar < hotel[lantai].length; kamar++){
                if(hotel[lantai][kamar] == kamarIsi){
                    System.out.println("Tamu berada di Lantai "+ (lantai+1) /* atau (lantai-4) */ +" Kamar "+ (kamar+1));
                }
                
                if(hotel[lantai][kamar] == kamarKosong){
                    jumlahKamarKosong++;
                }
            }
        }
        System.out.println("\nJumlah kamar yang tersedia adalah " + jumlahKamarKosong + " kamar");
    }
}