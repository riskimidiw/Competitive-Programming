1 	Perhatikan potongan program berikut:

    i := 100;
    while (i > 0) do
        write('+');
        i := i div 2;

Keluaran potongan program tersebut adalah ...

    a ++++++++
    b +++++++
    c ++++++
    d terjadi runtime error
    e + terus tercetak tanpa henti

2 	Perhatikan potongan program berikut:

    a := -50;
    repeat
        write('masuk');
    until (a < 0);
    writeln(' keluar');

Keluaran potongan program tersebut adalah ....

    a masuk keluar
    b  keluar
    c masuk
    d tidak bisa ditentukan
    e terjadi runtime error

3 	Perhatikan potongan program berikut:

    n := 5;
    i := 1;
    while (i < n) do
    begin
        write(n);
        inc(i);
    end;

Keluaran potongan program tersebut adalah ....

    a 12345
    b terjadi infinite loop
    c 1234
    d 5555
    e 55555

4 	Perhatikan dua buah potongan program berikut:

    I
    i := 1;
    n := 10;
    for i := 1 to n do
    begin
        writeln(2 * i);
    end;

    II
    i := 2;
    n := 10;
    ...  // isi di sini
    begin
        writeln(i);
        inc(i, 2);
    end;

Potongan kode yang paling tepat untuk mengisi bagian kosong agar potongan program I dan potongan program II menghasilkan keluaran yang sama adalah ....

    a while (i <= n) do
    b while (i < n) do
    c while (i <= 2 * n - 1) do
    d while (i < 2 * n) do
    e while (i <= 2 * n) do

5 	Perhatikan potongan program berikut:

    t := 0;
    for i := 1 to n do
        t := t + (n-i);
    writeln(t);

Jika n = 10, keluaran potongan program tersebut adalah ....

    a 100
    b 45
    c 55
    d 10
    e 75

6 	Perhatikan potongan program berikut:

    n := 100;
    nn := 0;
    while (n > 1) do
    begin
        nn := nn + 1;
        n := n - (n div 2);
    end;
    writeln(nn);

Keluaran potongan program tersebut adalah ....

    a 6
    b 7
    c 8
    d 9
    e 10
7 	Perhatikan potongan program berikut:

    a := 45;
    b := 56;
    repeat
        a := a – 3;
        b := b - 5;
    until (a<0) and (b<0);
    writeln(a, ' ', b);

Keluaran potongan program tersebut adalah ....

    a -3 -24
    b 9 -4
    c 12 1
    d 42 51
    e terjadi infinite loop