1 	Perhatikan fungsi berikut:

    function banyak(x: longint): longint;
    begin
        if (x < 0) then begin
            banyak := 0;
        end else begin
            banyak := x + banyak(x - 2);
        end;
    end;

Jika dipanggil banyak(5), maka nilai yang dikembalikan adalah:

    a 120
    b 15
    c 9
    d 0
    e -10

2 	Perhatikan prosedur berikut:

    procedure draw(x: longint);
    var
        i: longint;
    begin
        if (x > 0) then begin
            draw(x-1);

            for i := 1 to x do begin
                write('*');
            end;
            writeln;
        end;
    end;

Berikut adalah beberapa kemungkinan keluaran dipanggil draw(4):

    I
    *
    *
    *
    *
    *

    II
    ****

    III
    ****
    ****
    ****
    ****

    IV
    *
    **
    ***
    ****

    V
    ****
    ***
    **
    *
Dari kemungkinan-kemungkinan tersebut, yang tepat adalah:

    a I
    b II
    c III
    d IV
    e V

3 	Perhatikan fungsi berikut:

    function jabatan(a, b: longint): longint;
    var
        temp: longint;
    begin
        if (b = 0) then begin
            jabatan := 1;
        end else if (b mod 2 = 1) then begin
            jabatan := a * jabatan(a, b - 1);
        end else begin
            temp := jabatan(a, b div 2);
            jabatan := temp * temp;
        end;
    end;

Jika dipanggil jabatan(2, 5), maka nilai yang dikembalikan adalah:

    a 1
    b 7
    c 10
    d 25
    e 32

4 	Perhatikan fungsi berikut:

    function kardus(a, b: longint): longint;
    begin
        if (a > b) then begin
            kardus := 1 + kardus(a - 1, b);
        end else if (a < b) then begin
            kardus := 1 + kardus(a, b - 1);
        end else begin
            kardus := a + b;
        end;
    end;

Jika dipanggil kardus(12, 17), maka nilai yang dikembalikan adalah:

    a 29
    b 17
    c 12
    d 5
    e -5

5 	Perhatikan fungsi berikut:

    function ekor(a, b, t: longint): longint;
    begin
        if (b = 0) then begin
            ekor := t;
        end else begin
            ekor := ekor(a, b - 1, t * a);
        end;
    end;

Jika dipanggil ekor(3, 4, 2), maka nilai yang dikembalikan adalah:

    a 2
    b 24
    c 54
    d 81
    e 162

6 	Perhatikan prosedur berikut:

    procedure majuMundur(str: string; i: longint);
    begin
        if (i = length(str)) then begin
            write(str[i]);
        end else begin
            write(str[i]);
            majuMundur(str, i + 1);
            write(str[i]);
        end;
    end;

Jika dipanggil majuMundur('bebek', 1), maka yang tercetak adalah:

    a bebek
    b kebeb
    c bebekebeb
    d bebekkebeb
    e kebebebek

7 	Perhatikan fungsi berikut:

    function ping(a: longint): longint;
    begin
        if (a = 0) then begin
            ping := 0;
        end else begin
            ping := 1 + pong(a - 1);
        end;
    end;

    function pong(a: longint): longint;
    begin
        if (a = 0) then begin
            pong := 0;
        end else begin
            pong := 2 + ping(a - 1);
        end;
    end;

Jika dipanggil ping(5), maka nilai yang dikembalikan adalah:

    a 7
    b 8
    c 5
    d 10
    e 6

8 	Perhatikan fungsi berikut:

    function wolo(s: string): string;
    var
        t: string;
    begin
        if (length(s) = 0) then begin
            wolo := '';
        end else begin
            t := s;
            delete(t, 1, 1);
            wolo := wolo(t) + s[1];
        end;
    end;

Jika dipanggil wolo('dengklek'), maka nilai yang dikembalikan adalah:

    a dengklek
    b kelkgned
    c denggned
    d kelkklek
    e dddddddd

9 	Perhatikan fungsi berikut:

    function jdd(x: longint): longint;
    begin
        if (x = 0) then begin
            jdd := 0;
        end else begin
            jdd := jdd(x div 100) + (x mod 100);
        end;
    end;

Jika dipanggil jdd(19823), maka nilai yang dikembalikan adalah:

    a 122
    b 104
    c 23
    d 19
    e 0

10 	Perhatikan fungsi berikut:

    function janji(p, q, t: longint): longint;
    begin
        if (p = q) then begin
            janji := t;
        end else if (t mod 2 = 1) then begin
            janji := 2 + janji(p + 1, q, t + 1);
        end else begin
            janji := 2 + janji(p, q - 1, t + 1);
        end;
    end;

Jika dipanggil janji(10, 8, 0), maka nilai yang dikembalikan adalah:

    a 2
    b 4
    c 8
    d 16
    e fungsi berjalan secara rekursif tanpa henti