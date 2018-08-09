1 	Perhatikan potongan program berikut:

    a := 3;
    if ((a mod 2 <> 1) and (a > 0)) then
        write('genap');
        write('positif');

Keluaran potongan program tersebut adalah ....

    a tidak ada keluaran
    b genap
    c positif
    d genappositif
    e positifgenap

2 	Perhatikan kondisi if berikut:

    if (a > b div 2) then begin
        writeln('bebek');
    end else begin
        writeln('ayam');
    end;

Perhatikan pula variasi-variasi kondisi if berikut:

    I
    if (b div 2 > a) then begin
        writeln('bebek');
    end else begin
        writeln('ayam');
    end;

    II
    if (b div 2 > a) then begin
        writeln('ayam');
    end else begin
        writeln('bebek');
    end;

    III
    if (2*a > b) then begin
        writeln('ayam');
    end else begin
        writeln('bebek');
    end;

    IV
    if (b div 2 >= a) then begin
        writeln('bebek');
    end else begin
        writeln('ayam');
    end;

    V
    if (2*a > b) then begin
        writeln('bebek');
    end else begin
        writeln('ayam');
    end;

Variasi if yang setara dengan kondisi if awal adalah ....

    a I
    b II
    c III
    d IV
    e V

3 	Perhatikan potongan program berikut:

    u := (1 <= x) and (x <= 10);
    v := (0 <= y) and (y < 50);

    if (u and v) then begin
        writeln('masuk');
    end else begin
        writeln('keluar');
    end;

Misalkan x dan y adalah variabel bertipe longint, serta u dan v merupakan variabel bertipe boolean. Agar potongan program tersebut menghasilkan keluaran masuk, nilai x dan y yang perlu dimasukkan adalah ....

    a x = 0, y = 0
    b x = 0, y = 49
    c x = 1, y = 1
    d x = 1, y = 50
    e x = 10, y = 50

4 	Perhatikan potongan program berikut:

    nilai := 85;
    if (nilai >= 80) then
        ch := 'A';
    if (nilai >= 70) then
        ch := 'B';
    if (nilai >= 60) then
        ch := 'C';
    if (nilai >= 50) then
        ch := 'D';
    if (nilai >= 40) then
        ch := 'E';
    writeln(ch);

Keluaran potongan program tersebut adalah ....

    a A
    b B
    c C
    d D
    e E

5 	Perhatikan potongan program berikut:

    a := 26;
    if not (a and 1 = 0) then
        write('genap ')
    else
        write('ganjil ');

    if (a > 0) then
        writeln('positif')
    else if (a < 0) then
        writeln('negatif')
    else
        writeln('nol');
        
Keluaran potongan program tersebut adalah ....

    a genap positif
    b ganjil positif
    c genap negatif
    d ganji negatif
    e ganjil nol

6 	Perhatikan potongan program berikut:

    a := 7;
    if (a <= 3) then
        a := a + 3;
    if (a <= 10) then
        a := a + 10;
    if (a <= 20) then
        a := a + 20
    else if (a <= 40) then
        a := a + 40;
    writeln(a);
    
Keluaran potongan program tersebut adalah ....

    a 25
    b 37
    c 40
    d 35
    e 80

7 	Perhatikan potongan program berikut:

    a := -2;
    b := a+a;
    c := b*b;
    if a>b then
        if c<b then
            writeln(c)
        else
            writeln(b)
    else
        if c<a then
            writeln(c)
        else
            writeln(a);

Keluaran potongan program tersebut adalah ....

    a -2
    b 4
    c -4
    d 16
    e -16

8 	Perhatikan potongan program berikut:

    a := -5
    if a > 0 then
        writeln('one')
    else if a <> 5 then
        writeln('two')
    else if a < 0 then
        writeln('three')
    else
        writeln('four');

Keluaran potongan program tersebut adalah ....

    a one
    b two
    c three
    d four
    e tidak ada keluaran

9 	Perhatikan potongan program berikut:

    x := 2;
    y := 3;
    x := x*y + 1;
    y := x*y - 1;
    x := y;

    if (x < y) then
        x := y - x
    else if (x > y) then
        x := x - y
    else
        x := x div x;

    writeln(x);

Keluaran potongan program tersebut adalah ....

    a 0
    b 1
    c 7
    d 13
    e 20