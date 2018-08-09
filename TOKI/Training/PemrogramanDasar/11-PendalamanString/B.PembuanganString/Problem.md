# Pembuangan String

Time limit | Memory limit
---------- | ------------
1 s | 64 MB

## Deskripsi
Hari ini, Pak Dengklek ingin mengajak Anda bermain Pembuangan String. Pertama-tama, Pak Dengklek memberi Anda sebuah string S. Kemudian, ia memberi Anda sebuah string T. Tugas Anda adalah menjalankan algoritma berikut:

    while (S mengandung T sebagai substring) {
        buang kemunculan terkiri T pada S
    }

    cetak S

Bisakah Anda menerima tantangan Pak Dengklek?

## Format Masukan
Sebuah baris berisi dua buah string S dan T.

## Format Keluaran
Sebuah baris berisi string S pada kondisi terakhir.

## Contoh Masukan
    sabunkeramaskekerara kera
## Contoh Keluaran
    sabunmas
## Batasan
String S dan T terdiri atas karakter-karakter a - z.
String S dan T terdiri atas 1 sampai dengan 100 karakter, inklusif.