1 	Diketahui suatu array arr dideklarasikan sebagai berikut:

    var arr: array[0..10, 'a'..'z', 1..2] of longint;
    
Jika sebuah tipe longint membutuhkan 4 byte memori, maka array arr membutuhkan memori sebesar ....

    a 572 byte
    b 2080 byte
    c 2200 byte
    d 2288 byte
    e 4576 byte

2 	Misalkan terdapat sebuah array 1 dimensi bernama tabel. Pada program, dipanggil tabel[x]. Berikut ini tipe data dari variabel x yang mungkin, kecuali ....

    a byte
    b integer
    c longint
    d char
    e real

3 	Perhatikan potongan program berikut:

    // ar merupakan array bertipe longint
    // N merupakan ukuran dari array ar
    for i := 1 to N-1 do begin
        if (ar[i] > ar[i+1]) then begin
            temp := ar[i+1];
            ar[i+1] := ar[i];
            ar[i] := temp;
        end;
    end;

Yang terjadi setelah potongan program tersebut dijalankan adalah ....

    a isi dari array ar menjadi teracak tanpa pola yang jelas
    b bilangan paling kecil pada ar akan berada pada ar[N]
    c bilangan paling besar pada ar akan berada pada ar[N]
    d untuk setiap bilangan pada ar yang lebih besar dari bilangan sesudahnya pada konfigurasi awal ar, bilangan itu ditukar dengan bilangan sesudahnya
    e seluruh bilangan pada ar menjadi sama dengan ar[1]

4 	Perhatikan program berikut:

    var
        a, b: array [1..10] of integer;
        i: integer;

    begin
        for i:=1 to 10 do begin
            a[i]:=3*i mod 10;
        end;
        for i:=1 to 10 do begin
            b[i]:=9*a[((i+3) mod 10)]+5 mod 10;
        end;
        writeln(b[8]);
    end.

Keluaran program tersebut adalah ....

    a 68
    b 5
    c 32
    d 59
    e 86