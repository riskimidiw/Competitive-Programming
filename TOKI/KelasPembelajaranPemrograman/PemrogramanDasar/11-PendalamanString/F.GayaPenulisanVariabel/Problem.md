# Gaya Penulisan Variabel

Time limit | Memory limit
---------- | ------------
1 s | 64 MB

## Deskripsi
Dalam pemrograman terdapat setidaknya dua gaya penulisan variabel yang dikenal, yaitu camel case dan snake case. Asumsikan sebuah variabel tersusun dari beberapa kata. Tiap kata ditulis hanya menggunakan huruf kecil dari 'a' sampai 'z'. Setiap kata terdiri atas setidaknya satu karakter.

Dalam gaya camel case, kata-kata ini disambungkan tidak menggunakan karakter tambahan apapun. Namun untuk setiap kata kecuali kata pertama, huruf pertama pada kata tersebut diganti menjadi huruf besar.

Dalam gaya snake case, kata-kata ini disambungkan dengan menggunakan karakter underscore (_).

Seperti contoh, misalkan sebuah variabel yang disusun oleh kata-kata banyak dan bebek jika ditulis menggunakan camel case akan menjadi banyakBebek, namun jika ditulis menggunakan snake case akan menjadi banyak_bebek.

Pak Dengklek kali ini akan memberikan Anda sebuah variabel berupa string S, dan menguji Anda untuk mengganti gaya penulisan variable S tersebut. Lebih tepatnya, jika S adalah variabel dalam gaya camel case, Anda harus mengubahnya menjadi bentuk snake case, demikian juga sebaliknya.

## Format Masukan
Sebuah baris berisi sebuah string S.

## Format Keluaran
Sebuah baris berisi S yang sudah diubah gaya penulisannya seperti permintaan Pak Dengklek.

## Contoh Masukan 1
    super_vin_hebat
## Contoh Keluaran 1
    superVinHebat
## Contoh Masukan 2
    supervinganteng
## Contoh Keluaran 2
    supervinganteng
## Batasan
    String S terdiri atas 1 sampai dengan 100 karakter, inklusif.
    String S dijamin merupakan variabel yang ditulis menggunakan gaya camel case atau snake case.
