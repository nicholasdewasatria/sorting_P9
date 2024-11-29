def quick_sort(arr):
    """
    Fungsi Quick Sort untuk mengurutkan array.
    - Pilih pivot (elemen terakhir).
    - Bagi array menjadi dua bagian:
        1. Elemen lebih kecil dari pivot.
        2. Elemen lebih besar dari pivot.
    - Rekursif panggil quick_sort untuk kedua bagian.
    """
    if len(arr) <= 1:  # Jika array hanya memiliki satu elemen, kembalikan array
        return arr
    
    pivot = arr[0]  # Pilih pivot (elemen pertama)
    # Bagi array menjadi elemen lebih kecil dan lebih besar dari pivot
    left = [x for x in arr[1:] if x <= pivot]
    right = [x for x in arr[1:] if x > pivot]
    
    # Rekursif sorting untuk bagian kiri dan kanan, gabungkan dengan pivot
    return quick_sort(left) + [pivot] + quick_sort(right)

# Contoh penggunaan
data = [38, 27, 43, 3, 9, 82, 10]
print("Sebelum diurutkan:", data)
sorted_data = quick_sort(data)
print("Setelah diurutkan:", sorted_data)
