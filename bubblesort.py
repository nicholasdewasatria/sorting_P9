def bubble_sort(arr):
    """
    Fungsi Bubble Sort untuk mengurutkan array.
    - Membandingkan dua elemen bersebelahan.
    - Menukar elemen jika elemen pertama lebih besar dari elemen kedua.
    - Proses diulang sampai seluruh array terurut
    Langkah-Langkah Bubble Sort
    Bandingkan elemen pertama dengan elemen kedua.
    Jika elemen pertama lebih besar, tukar posisinya.
    Lanjutkan proses ke elemen berikutnya hingga akhir array.
    Ulangi langkah ini untuk seluruh array, mengurangi elemen yang sudah berada di posisi akhir setiap iterasi.
    """
    for i in range(len(arr)):  # Loop untuk mengontrol jumlah iterasi
        for j in range(len(arr) - i - 1):  # Bandingkan elemen yang belum terurut
            if arr[j] > arr[j + 1]:  # Jika elemen lebih besar
                # Tukar posisi elemen
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

# Contoh penggunaan
data = [45, 12, 8, 32, 56, 19]
print("Sebelum diurutkan:", data)
bubble_sort(data)
print("Setelah diurutkan:", data)
