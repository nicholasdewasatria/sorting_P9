public class quicksort {
    /**
     * Fungsi utama untuk Quick Sort.
     * Memanggil fungsi rekursif untuk mengurutkan array.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Menentukan posisi pivot yang sudah di tempatkan di posisi yang benar
            int pivotIndex = partition(arr, low, high);

            // Rekursif sorting untuk elemen sebelum dan sesudah pivot
            quickSort(arr, low, pivotIndex - 1); // Bagian kiri
            quickSort(arr, pivotIndex + 1, high); // Bagian kanan
        }
    }

    /**
     * Fungsi untuk membagi array berdasarkan pivot.
     * Elemen lebih kecil dari pivot akan di kiri, lebih besar di kanan.
     * 
     * @param arr Array yang sedang diproses
     * @param low Indeks awal dari bagian array
     * @param high Indeks akhir dari bagian array
     * @return Indeks akhir dari pivot setelah dipindahkan
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pilih pivot (elemen terakhir)
        int i = low - 1; // Indeks elemen yang lebih kecil dari pivot

        for (int j = low; j < high; j++) {
            // Jika elemen saat ini lebih kecil atau sama dengan pivot
            if (arr[j] <= pivot) {
                i++; // Tingkatkan indeks elemen yang lebih kecil
                // Tukar elemen arr[i] dan arr[j]
                swap(arr, i, j);
            }
        }

        // Tempatkan pivot di posisi yang benar
        swap(arr, i + 1, high);
        return i + 1; // Kembalikan posisi pivot
    }

    /**
     * Fungsi untuk menukar dua elemen dalam array.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Fungsi utama untuk menjalankan Quick Sort.
     */
    public static void main(String[] args) {
        // Array yang akan diurutkan
        int[] data = {38, 27, 43, 3, 9, 82, 10};
        
        // Cetak array sebelum diurutkan
        System.out.print("Sebelum diurutkan: ");
        printArray(data);

        // Panggil quickSort untuk mengurutkan array
        quickSort(data, 0, data.length - 1);

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
