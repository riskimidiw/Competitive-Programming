# Tukang Sulap

Time limit | Memory limit
---------- | ------------
1 s | 64 MB 

## Deskripsi
Pada suatu hari, Pak Dengklek mengunjungi seorang tukang sulap. Tukang sulap tersebut mempunyai dua baris masing-masing berisi N buah bola, di atas meja. Sebut saja baris pertama adalah A dan baris kedua adalah B. Bola-bola pada setiap baris dinomori dari 1 sampai dengan N. Masing-masing bola memiliki label bertuliskan sebuah bilangan.

Tukang sulap menunjukkan semua bilangan kepada Pak Dengklek. Lalu, ia menutup semua bola dengan gelas. Ia ingin menguji Pak Dengklek dengan melakukan pertukaran bola sebanyak Q kali. Setiap pertukaran berupa: bola ke-x pada baris P ditukar dengan bola ke-y pada baris Q.

Bantulah Pak Dengklek untuk menyebutkan kondisi akhir dari kedua baris setelah Q pertukaran tersebut dilakukan.

## Format Masukan
Baris pertama berisi sebuah bilangan bulat N. Baris berikutnya berisi N buah bilangan bulat yang menyatakan bilangan-bilangan pada bola-bola pada baris pertama. Baris berikutnya berisi N buah bilangan bulat yang menyatakan bilangan-bilangan pada bola-bola pada baris kedua.

Baris berikutnya berisi sebuah bilangan bulat Q. Q baris berikutnya masing-masing berupa P x Q y, dengan P dan Q menyatakan baris-baris yang dipilih, serta x dan y menyatakan posisi-posisi bola pada baris-baris yang bersangkutan.

## Format Keluaran
Baris pertama berisi N buah bilangan bulat yang menyatakan bilangan-bilangan pada bola-bola pada baris pertama. Baris kedua berisi N buah bilangan bulat yang menyatakan bilangan-bilangan pada bola-bola pada baris kedua.

## Contoh Masukan
    2
    1 2
    2 1
    1
    A 2 B 2
## Contoh Keluaran
    1 1
    2 2
## Batasan
    1 ≤ N ≤ 1.000
    1 ≤ Q ≤ 1.000
    1 ≤ (setiap bilangan pada bola) ≤ 100.000
    P dan Q masing-masing berupa 'A' atau 'B'
    1 ≤ x, y ≤ N
