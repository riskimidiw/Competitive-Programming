# Operasi String

Time limit | Memory limit
---------- | ------------ 
1 s | 64 MB

## Deskripsi
Anda diberikan empat buah string yang kita beri nama S1, S2, S3, dan S4. Misalnya Anda mendapat masukan seperti ini:

    abcdehalofghi
    bcd
    halo
    semua

Dijamin bahwa string S1 mengandung sebuah string S2 di dalamnya. Buang string S2 yang ditemukan pada string S1 (dijamin ada, dan hanya satu). Kemudian, sisipkan string S4 pada posisi setelah string S3 yang ditemukan pada string hasil operasi sebelumnya (dijamin ada, dan hanya satu). Jadi pada contoh di atas, abcdehalofghi diubah menjadi aehalofghi, lalu menjadi aehalosemuafghi. Keluarkan string hasil akhir, yang pada contoh ini adalah aehalosemuafghi.

## Format Masukan
Empat buah baris, masing-masing berisi S1, S2, S3, dan S4.

## Format Keluaran
Sebuah baris berisi string hasil akhir semua operasi.

## Contoh Masukan
    abcdehalofghi
    bcd
    halo
    semua
## Contoh Keluaran
    aehalosemuafghi
## Batasan
    String S1, S2, S3, dan S4 terdiri atas karakter-karakter a - z.
    String S1, S2, S3, dan S4 terdiri atas 1 sampai dengan 100 karakter, inklusif.