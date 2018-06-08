## Mencari Harta Karun

Pak Abdi adalah seorang ayah dengan 4 anak, yaitu Johan, Budi, Didi, dan Tono. Salah satu permainan favorit Pak Abdi dengan anak – anaknya adalah pencarian harta karun di lahan miliknya. Cara bermainnya adalah sebagai berikut:

    - Pertama, keempat anak Pak Abdi akan memilih satu petak sebagai tempat mulai mencari harta     di lahan.
    - Kemudian, Pak Abdi akan memilih satu petak di lahan untuk menyembunyikan harta.
    - Yang pertama kali menemukan harta tersebut adalah pemenangnya.
Saat ini, anak – anak Pak Abdi sudah sangat pintar, sehingga mereka bisa memperkirakan lokasi harta yang disembunyikan, dan selalu mengambil jarak terdekat untuk bisa ke harta tersebut. Pak Abdi ingin sekali mensimulasikan permainan ini ke dalam sebuah program, sehingga Pak Abdi bisa mengetahui siapa pemenang dalam sebuah permainan. Sebagai teman baik Pak Abdi, anda diminta tolong untuk membuat program untuk melakukan tugas ini.

### Input Format

Input dimulai dengan 2 bilangan yaitu X dan Y, yaitu panjang (jumlah kolom) dan lebar (jumlah baris) dari lahan Pak Abdi. X baris berikutnya akan mengandung masing – masing Y karakter yang merupakan gambar peta ladang Pak Abdi.

    ###########
    #..J#.....#
    #.### #.#.#
    #.....#.#.#
    #######+#.#
    #B#...#.#.#
    #.#.#.#.#.#
    #...#.#.#.#
    #####.#.#.#
    #T......#D#
    ###########

Lambang . melambangkan petak kosong Lambang # melambangkan tembok penghalang yang tidak bisa dilewati anak – anak Pak Abdi Lambang J,B,D,T melambangkan lokasi awal masing – masing anak Pak Abdi, sesuai dengan inisialnya. Dipastikan bahwa di tiap input ada salah satu anak yang berhasil mendapatkan harta. Lambang + melambangkan petak berisi harta.

### Constraints

    5 <= X,Y <= 10

### Output Format

Outputkan nama anak Pak Abdi yang berhasil memenangkan permainan tersebut. Jika ada 2 atau lebih anak yang berhasil memenangkan permainan, pilih nama anak dengan urutan leksikografis terkecil.

### Sample Input 0

    5 5
    #####
    ..J..
    .TBD.
    .....
    +....
### Sample Output 0

    Tono