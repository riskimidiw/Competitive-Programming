# Perkalian Matriks

Time limit | Memory limit
---------- | ------------
1 s | 64 MB

## Deskripsi
Misalkan terdapat dua buah matriks A dan B. Matriks pertama berukuran N × M, sedangkan matriks kedua berukuran M × P. Perkalian dari dua buah matriks tersebut akan menghasilkan suatu matriks C yang berukuran N × P. Elemen ke-(i, j) dari matriks C = AB ini didefinisikan sebagai:

    Cij = Ai1 B1j + Ai2 B2j + ... + AiM BMj

Pak Dengklek memberikan dua buah matriks tersebut. Kalikan kedua matriks tersebut lalu cetak hasilnya.

## Format Masukan
Baris pertama berisi tiga buah bilangan bulat N, M, dan P.

N baris berikutnya masing-masing berisi M buah bilangan bulat, yang menyatakan elemen-elemen matriks A.

M baris berikutnya masing-masing berisi P buah bilangan bulat, yang menyatakan elemen-elemen matriks B.

## Format Keluaran
Sebuah matris berukuran N x P dengan format seperti masukan yang merupakan matriks yang sudah diputar.

## Contoh Masukan
    2 3 4
    1 1 1
    1 1 2
    1 1 1 1
    1 1 1 1
    1 1 1 2
## Contoh Keluaran
    3 3 3 4
    4 4 4 6
## Batasan
    1 ≤ N, M, P ≤ 100
    1 ≤ (setiap elemen matriks) ≤ 100