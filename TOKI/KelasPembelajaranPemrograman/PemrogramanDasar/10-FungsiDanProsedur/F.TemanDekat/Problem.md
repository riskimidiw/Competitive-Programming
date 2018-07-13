# Teman Dekat

Time limit | Memory limit
---------- | ------------
1 s | 64 MB 

## Deskripsi
Pak Dengklek adalah guru dari SMA TOKI. Ia ingin melihat "tingkat kedekatan" setiap muridnya terhadap murid-murid yang lain. Setiap murid memiliki dua faktor yang dijadikan acuan. Sebut saja faktor tersebut adalah X dan Y. Murid ke-i memiliki nilai Xi dan Yi.

Tingkat kedekatan antara suatu murid ke-i dan murid ke-j, dinyatakan sebagai Ti,j, didefinisikan sebagai berikut:

    Ti,j = |Xj − Xi|^D + |Yj − Yi|^D

dengan D adalah suatu konstanta yang Pak Dengklek tentukan. Notasi |x| merupakan notasi multlak/absolut, yakni jika x negatif, maka x menjadi positif. Sebagai contoh, |−5| = 5. 

SMA TOKI memiliki N murid. Pak Dengklek meminta bantuan Anda untuk membuat program yang dapat menentukan tingkat kedekatan antara setiap pasang murid yang berbeda. Namun, karena data yang dihasilkan akan sangat banyak sekali, Pak Dengklek meminta Anda untuk hanya menampilkan tingkat kedekatan yang terkecil dan yang terbesar.

## Format Masukan
Baris pertama berisi dua buah bilangan bulat N dan D. N baris berikutnya masing-masing berisi dua buah bilangan bulat Xi dan Yi.

## Format Keluaran
Sebuah baris berisi dua buah bilangan bulat: tingkat kedekatan terkecil dan terbesar.

## Contoh Masukan
    3 1
    0 1
    1 1
    10 10
## Contoh Keluaran
    1 19
## Batasan
    2 ≤ N ≤ 1.000
    1 ≤ D ≤ 3
    0 ≤ Xi, Yi ≤ 100