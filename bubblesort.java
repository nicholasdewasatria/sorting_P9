public class bubblesort {
    /**
     * Fungsi untuk mengurutkan array menggunakan Bubble Sort.
     * 
     * Algoritma:
     * 1. Bandingkan elemen yang berdekatan.
     * 2. Tukar elemen jika urutannya salah (elemen kiri > elemen kanan).
     * 3. Ulangi langkah ini sampai array benar-benar terurut.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Panjang array
        
        // Loop untuk melakukan beberapa iterasi pengurutan
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Menandai apakah ada elemen yang ditukar
            
            // Loop untuk membandingkan elemen yang berdekatan
            for (int j = 0; j < n - i - 1; j++) {
                // Jika elemen kiri lebih besar dari elemen kanan, tukar posisi
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1); // Tukar elemen
                    swapped = true; // Tandai bahwa ada elemen yang ditukar
                }
            }

            // Jika tidak ada elemen yang ditukar, array sudah terurut
            if (!swapped) break;
        }
    }

    /**
     * Fungsi untuk menukar dua elemen dalam array.
     * 
     * @param arr Array tempat elemen akan ditukar
     * @param i Indeks elemen pertama
     * @param j Indeks elemen kedua
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Fungsi utama untuk menjalankan Bubble Sort.
     */
    public static void main(String[] args) {
        // Array yang akan diurutkan
        int[] data = {38, 27, 43, 3, 9, 82, 10};

        // Cetak array sebelum diurutkan
        System.out.print("Sebelum diurutkan: ");
        printArray(data);

        // Panggil fungsi bubbleSort untuk mengurutkan array
        bubbleSort(data);

        // Cetak array setelah diurutkan
        System.out.print("Setelah diurutkan: ");
        printArray(data);
    }

    /**
     * Fungsi untuk mencetak elemen-elemen array.
     */
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
