# B. Lucky 7

Time limit | Memory limit
---------- | ------------
1 s	| 64 MB

## Deskripsi
Dapat dibuktikan bahwa untuk seluruh nilai N ≥ 7, terdapat setidaknya sebuah barisan A yang memenuhi syarat-syarat berikut:

- Seluruh elemen dari A adalah bilangan bulat positif.
- Jumlah dari elemen-elemen A adalah N.
- A terurut tidak menurun.
- Jika K adalah panjang A, maka AK - A1 = 1.

Diberikan N, keluarkan barisan A mana pun yang memenuhi syarat-syarat tersebut.

## Format Masukan
Masukan diberikan dalam format berikut:
    N
## Format Keluaran
Baris pertama berisi sebuah bilangan bulat K yang merupakan panjang A.

Baris kedua berisi K buah bilangan bulat positif yang merupakan A1, A2, ..., AK.

## Contoh Masukan
    7
## Contoh Keluaran
    2
    3 4
## Penjelasan Contoh
Salah satu contoh keluaran lain yang memenuhi syarat-syarat tersebut adalah:

    3
    2 2 3
## Batasan
    7 ≤ N ≤ 10.000