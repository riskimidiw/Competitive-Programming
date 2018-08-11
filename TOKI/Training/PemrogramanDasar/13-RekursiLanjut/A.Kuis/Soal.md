1 	Perhatikan prosedur berikut:

    procedure batang(x: longint);
    begin
        if (x = 0) then begin
            writeln('daun');
        end else begin
            batang(x - 1);
            batang(x - 1);
        end;
    end;

Jika dipanggil batang(3), maka berapa kali tulisan 'daun' dicetak?

    a 3
    b 4
    c 6
    d 8
    e 16

2 	Perhatikan prosedur berikut:
    
    procedure rindang(x: longint);
    var
        i: longint;
    begin
        if (x > 0) then begin
            for i := 1 to x do begin
                rindang(x-1);
            end;
        end;
    end;

Kompleksitas paling tepat untuk prosedur tersebut jika dipanggil dengan rindang(N) adalah:

    a O(N)
    b O(N^2)
    c O(2^N)
    d O(N!)
    e O(N^N)

Untuk dua soal berikutnya, perhatikan program berikut:

    const
        N = 5;

    var
        ar: array[1..N] of longint = (1, 3, 5, 8, 11);

    function wow(i, t: longint): boolean;
    begin
        if (i > N) then begin
            if (t = 0) then begin
                wow := true;
            end else begin
                wow := false;
            end;
        end else begin
            wow := wow(i + 1, t - ar[i]) or wow(i + 1, t);
        end;
    end;

    begin
    writeln(wow(1, 2));
    writeln(wow(1, 6));
    writeln(wow(1, 9));
    end.

3 	Jika program dijalankan, maka secara berturut-turut yang dicetak adalah:

    a TRUE, TRUE, TRUE
    b FALSE, TRUE, TRUE
    c TRUE, FALSE, FALSE
    d TRUE, FALSE, TRUE
    e TRUE, TRUE, FALSE

4 	Kompleksitas pemanggilan fungsi wow adalah:

    a O(N)
    b O(N^2)
    c O(2^N)
    d O(N!)
    e O(N^N)

5 	Perhatikan prosedur berikut:

    procedure gali(x: longint);
    begin
        write(x, '_');
        if (x > 1) then begin
            gali(x div 4);
            gali(x div 2);
        end;
        write(-x, '_');
    end;

Jika dipanggil gali(4), maka yang dicetak adalah:

    a 4_1_-1_2_0_0_1_-1_-2_-4_
    b 4_1_2_0_1_-1_0_-1_-2_-4_
    c 4_-4_1_-1_2_-2_0_0_1_-1_
    d 4_1_0_0_-1_-4_
    e 4_2_1_0_0_-1_-2_-4_