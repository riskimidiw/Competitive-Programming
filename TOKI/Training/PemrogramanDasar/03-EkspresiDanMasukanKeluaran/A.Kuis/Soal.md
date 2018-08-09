1   Misalkan diberikan masukan dalam format berikut: 

    2 3
    4 5 6

Terdapat beberapa percobaan untuk membaca masukan tersebut, seperti:
    
    I
    readln(a1, a2);
    readln(b1, b2, b3);

    II
    read(a1);
    read(a2);
    readln;
    read(b1);
    read(b2);
    read(b3);
    readln;

    III
    read(a1);
    readln(a2);
    read(b1, b2);
    readln(b3);

    IV
    read(a1, a2);
    read(b1, b2, b3);
    readln;
    
Di antara cara-cara di atas, yang tepat untuk membaca masukan tersebut adalah ....

    a hanya I dan III
    b hanya II dan III
    c hanya I dan II
    d hanya I, II, dan III
    e I, II, III, dan IV

2 	Misalkan diberikan keluaran dalam format berikut:

    *1*
    2*3*4

Terdapat beberapa percobaan untuk menghasilkan keluaran tersebut, seperti:

    I
    writeln('*1*');
    writeln('2*3*4');
    
    II
    writeln('*', 1, '*');
    writeln('2', '*', 3, '*', '4');
    
    III
    write('*');
    writeln(1);
    write('*');
    writeln('2', '*', 3, '*', '4');
    
    IV
    write('*', 1, '*');
    writeln;
    writeln('2', '*', 3, '*', '4');

Di antara cara-cara di atas, yang tepat untuk menghasilkan keluaran tersebut adalah ....

    a I, II, III, dan IV
    b hanya I, II, dan III
    c hanya I, II, IV
    d hanya I dan II
    e hanya I

3 	Perhatikan program berikut:

    var
        b1, b2, jml: longint;
    begin
        b1 := 2000000000;
        b2 := 2000000000;

        jml := (b1 + b2) mod 123;
        writeln(jml);
    end.

Ketika dijalankan, program menghasilkan keluaran -12. Hal ini dapat terjadi karena ...

    a operator modulo menjadi tidak akurat ketika salah satu operand mencapai nilai miliaran
    b terjadi overflow saat penjumlahan b1 dengan b2
    c terjadi underflow saat penjumlahan b1 dengan b2
    d angka 123 sebagai salah satu operand tidak memiliki tipe data yang jelas
    e terjadi error selain overflow dan underflow

4 	Perhatikan program berikut:

    var
        b1, b2: longint;
    begin
        b1 := 1;
        b2 := 3;

        b1 := b2
        b2 := b1;
        writeln(b1, ' ', b2);
    end.

Keluaran program tersebut adalah ....

    a 3 3
    b 3 1
    c 1 1
    d 4
    e -2

5 	Perhatikan program berikut:

    var
        b1, b2, temp: longint;
    begin
        b1 := 1;
        b2 := 3;

        temp := b1;
        b1 := b2;
        b2 := temp;

        writeln(b1, ' ', b2);
    end.

Keluaran program tersebut adalah ....

    a 3 3
    b 3 1
    c 1 1
    d 4
    e -2

6 	Perhatikan program berikut:

var
    a, b: longint;
begin
    a := 10;
    b := a + 10;
    writeln(a, ' ', b);
end.

Keluaran program tersebut adalah ....

    a 20 20
    b 20 10
    c 10 20
    d 10 10
    e 30

7 	Perhatikan program berikut:

    var
        a: byte;
    begin
        a := 250;
        write(a + 10);
        a := a + 10;
        writeln(' ', a);
    end.

Keluaran program tersebut adalah ....

    a 4 4
    b 260 4
    c 260 260
    d 4 260
    e tidak ada karena terjadi error

8 	Perhatikan ekspresi berikut:

    h1 := a div b;
    h2 := a / b;
    h3 := a mod b;

Tipe variable yang mungkin untuk h1, h2, dan h3 sehingga program berhasil dikompilasi adalah ....

    a h1: real, h2: real, h3: real
    b h1: boolean, h2: real, h3: integer
    c h1: real, h2: integer, h3: real
    d h1: string, h2: real, h3: real
    e h1: integer, h2: char, h3: real

9 	Perhatikan ekspresi berikut:

    writeln(((a + b) mod c) * d / e * (f div g));

Jika a, b, c, e, f, g bertipe longint, sementara d bertipe double, maka nilai yang dihasilkan dan dicetak dari ekspresi tersebut sebetulnya bertipe data ....

    a longint
    b double
    c extended
    d boolean
    e tidak dapat ditentukan dengan pasti

10 	Ekspresi yang bernilai false jika A = true, B = false, C = true adalah ....

    a (A or B) and C
    b A or (B and C)
    c (A xor B) and C
    d (A xor C) and B
    e (A and C) or B

11 	Diberikan sejumlah ekspresi boolean berikut:

    I
    a and not b or c and d

    II
    (a or not b) and c or not d
    
    III
    a or b and not c and d

    IV
    a and not d or not c or a and b

Jika a = true, b = false, c = true, d = true, maka ekspresi yang bernilai true adalah ....

    a I, II, III, dan IV
    b hanya I, II, dan III
    c hanya I, II, dan IV
    d hanya I dan II
    e hanya I dan III
    
12 	Diberikan dua buah pecahan a/b dan c/d. Anggap variabel pembilang1 dan penyebut1 mendefinisikan a dan b, serta pembilang2 dan penyebut2 mendefinisikan c dan d. Dengan asumsi seluruh variabel yang digunakan memiliki tipe data longint, dan nilainya selalu berupa bilangan positif kurang dari 1000, maka ekspresi yang tepat untuk membandingkan apakah a/b sama dengan c/d adalah ....

    a (pembilang1/penyebut1) = (pembilang2/penyebut2)
    b (pembilang1 div penyebut1) = (pembilang2 div penyebut2)
    c pembilang1*penyebut2 = pembilang2*penyebut1
    d pembilang1*pembilang2 = penyebut1*penyebut2
    e terdapat lebih dari satu jawaban yang tepat