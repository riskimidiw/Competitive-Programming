# A. Segiempat

Time limit | Memory limit
---------- | ------------
1 s	| 64 MB

## Deskripsi
Terdapat sebuah papan berukuran N × M petak. Berapakah segiempat berukuran A × B petak paling banyak yang dapat diletakkan pada papan sehingga:

Seluruh segiempat terletak di dalam papan.
Seluruh segiempat yang diletakkan tidak diputar atau seluruh segiempat yang diletakkan diputar 90 derajat. (Dengan kata lain, seluruh segiempat yang diletakkan menutupi A × B petak, atau seluruh segiempat yang diletakkan menutupi B × A petak.)
Tidak ada segiempat yang saling tumpang tindih.
Format Masukan
Masukan diberikan dalam format berikut:

    N M
    A B

## Format Keluaran
Sebuah baris berisi sebuah bilangan bulat yang menyatakan banyaknya segiempat paling banyak yang dapat diletakkan.

## Contoh Masukan
    2 5
    1 2
## Contoh Keluaran
    5
## Penjelasan Contoh
Apabila seluruh segiempat yang diletakkan menutupi 1 × 2 petak, maka paling banyak terdapat 4 segiempat yang dapat diletakkan dengan konfigurasi berikut:

![](https://repository.ia-toki.org/api/v2/problems/JIDPROGlqsOMNjJq3waIx7t8J20/render/segiempat_1.png)

Apabila seluruh segiempat yang diletakkan menutupi 2 × 1 petak, maka paling banyak terdapat 5 segiempat yang dapat diletakkan dengan konfigurasi berikut:

![](https://repository.ia-toki.org/api/v2/problems/JIDPROGlqsOMNjJq3waIx7t8J20/render/segiempat_2.png)

Dengan demikian, banyaknya segiempat yang dapat diletakkan paling banyak adalah 5.

## Batasan
    1 ≤ N, M, A, B ≤ 100