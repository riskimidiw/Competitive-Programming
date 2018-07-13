1 	Perhatikan program berikut:

    procedure hitung(a, b: longint);
    var
        i: longint;
    begin
        for i := a downto b do begin
            write(i);
        end;
    end;

    begin
        hitung(5, 3);
        write('x');
        hitung(2, 1);
    end.

Jika program itu dijalankan, yang tercetak adalah:

    a 345x12
    b 54321x
    c x54321
    d x12345
    e 543x21

2 	Perhatikan fungsi berikut:

    function sungai(a, b: longint): longint;
    var
        i: longint;
    begin
        sungai := 0;
        i := 0;
        while (i < b) do begin
            sungai := sungai + a;
            i := i + 1;
        end;
    end;

Jika pada program utama dipanggil sungai(sungai(2,3), sungai(5,1)), maka nilai akhir yang dikembalikan adalah:

    a 32768
    b 30
    c 11
    d 9
    e terjadi error karena hasil pemanggilan fungsi tidak dapat dijadikan sebagai parameter fungsi lainnya

3 	Perhatikan potongan program berikut:

    procedure cetak1(x: longint);
    var
        i: longint;
    begin
        for i := 1 to x do begin
            write('x');
        end;
        write('.');
    end;

    procedure cetak2(x: longint);
    var
        i: longint;
    begin
        for i := 1 to x do begin
            cetak1(i);
        end;
    end;

Pemanggilan cetak2(3) pada program utama akan mencetak:

    a 333.333.333.
    b 1.22.333.
    c xxx.xxx.xxx.
    d x.xx.xxx.
    e error karena prosedur cetak1 tidak dipanggil dari program utama

4 	Berikut ini adalah beberapa cara penulisan parameter pada subprogram:

    I
    procedure buatQuartet(a, b, c, d: longint);
    
    II
    procedure fungsiKubik(a, b: longint, c, d: double);
    
    III
    procedure akarKuadrat(a, b: longint; c: int64);
    
    IV
    function jarakTerdekat(p, q: int64);

Yang merupakan cara penulisan yang tepat adalah:

    a hanya I dan II
    b hanya I, II, dan III
    c hanya I dan III
    d hanya I, III, dan IV
    e I, II, III, dan IV

5 	Perhatikan program berikut:

    type
        Titik =
            record
                x, y: longint;
            end;

    var
        pa, pb: Titik;

    procedure pindah(var t: Titik; d: Titik);
    begin
        t.x := t.x + d.x;
        t.y := t.y + d.y;
    end;

    begin
        pa.x := 1;
        pa.y := -2;

        pb.x := 2;
        pb.y := 3;

        pindah(pa, pb);
        writeln(pa.x, ' ', pa.y);
    end.

Jika program dijalankan, yang tercetak adalah:

    a 1 -2
    b 3 1
    c 2 3
    d -1 5
    e terjadi error karena parameter subprogram hanya boleh menggunakan tipe data dasar

6 	Perhatikan program berikut:

    type
        Paket =
            record
                hasil, sisa: longint;
            end;

    function bagi(p, q: longint): Paket;
    begin
        bagi.hasil := p div q;
        bagi.sisa := p mod q;
    end;

    begin
        writeln(bagi(11, 3).hasil, ' ', bagi(7, 3).sisa);
    end.

Jika program dijalankan, maka yang dicetak adalah:

    a 3 1
    b 3 2
    c 2 2
    d 1 3
    e terjadi error karena tipe data record tidak bisa dijadikan tipe data kembalian fungsi

7 	Perhatikan program berikut:

    var
        a: longint;

    procedure tugas1(x: longint);
    begin
        a := x;
    end;

    procedure tugas2(x: longint);
    var
        a: longint;
    begin
        a := x;
    end;

    begin
        a := 2;
        tugas1(3);
        tugas2(4);
        writeln(a);
    end.

Jika program dijalankan, maka yang dicetak adalah:

    a 2
    b 3
    c 4
    d terjadi error karena variabel a dideklarasikan lebih dari satu kali
    e terjadi error karena prosedur tugas1 mengakses variabel a

8 	Perhatikan subprogram berikut:

    function getStatus(x: longint): string;
    begin
        if (x mod 2 = 1) then begin
            getStatus := 'a';
        end else begin
            getStatus := 'b';
        end;
    end;

    procedure printStatus(a, b: longint);
    var
        i: longint;
    begin
        for i := a to b do begin
            writeln(getStatus(i));
        end;
    end;

Pemanggilan prosedur yang menghasilkan keluaran sama persis adalah:

    a printStatus(10, 12) dan printStatus(11, 13)
    b printStatus(10, 12) dan printStatus(2, 4)
    c printStatus(10, 14) dan printStatus(10, 12)
    d printStatus(10, 8) dan printStatus(11, 10)
    e terdapat lebih dari satu jawaban yang benar