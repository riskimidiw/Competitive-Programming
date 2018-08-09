# Menggambar Pegunungan

Time limit | Memory limit
---------- | ------------
1 s | 64 MB

## Deskripsi
Pak Dengklek ingin mengisi waktu luangnya dengan menggambar pemandangan alam. Namun, dia sedang berada di laboratorium komputer dan di sana tidak ada kertas dan pensil. Oleh karena itu, dia memutuskan untuk menggambar pegunungan dengan program komputer.

Pegunungan yang ingin digambar Pak Dengklek memiliki aturan sebagai berikut:

Pegunungan tingkat 1 memiliki bentuk seperti ini:

    *
Pegunungan tingkat 2 memiliki bentuk seperti ini:

    *
    **
    *
Pegunungan tingkat 3 memiliki bentuk seperti ini:

    *
    **
    *
    ***
    *
    **
    *
dan seterusnya. Secara umum, pegunungan tingkat N untuk N ≥ 2 diawali dengan pegunungan tingkat N - 1, dilanjutkan dengan satu baris berisikan N buah karakter *, dan diakhiri dengan pegunungan tingkat N - 1.

Bantulah Pak Dengklek membuat program yang dapat menggambar pegunungan yang memiliki tingkat N.

Format Masukan
Sebuah baris berisi sebuah bilangan bulat N.

Format Keluaran
Gambar pegunangan tingkat N.

Contoh Masukan
    4
Contoh Keluaran

    *
    **
    *
    ***
    *
    **
    *
    ****
    *
    **
    *
    ***
    *
    **
    *
Batasan

    1 ≤ N ≤ 10