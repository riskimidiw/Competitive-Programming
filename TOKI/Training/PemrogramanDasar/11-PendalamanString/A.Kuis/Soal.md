1 	Yang termasuk dalam prosedur pengolahan string adalah:

    a find, replace, edit
    b str, val, copy
    c pos, insert, delete
    d ord, pos, copy
    e insert, delete, str

2 	Diketahui sebuah string s berisi 'gajah ganesh'. Perintah length(s + ' ') akan mengembalikan nilai:

    a 10
    b 11
    c 12
    d 13
    e error karena fungsi length hanya menerima parameter secara by reference

3 	Perhatikan prosedur dan fungsi berikutf:

    procedure swap(var a, b: char);
    var
        t: char;
    begin
        t := a;
        a := b;
        b := t;
    end;

    function diam(s: string): string;
    var
        len, i: longint;
    begin
        diam := s;
        len := length(s);
        for i := 1 to len do begin
            swap(diam[i], diam[len - i + 1]);
        end;
    end;

Jika dipanggil diam('ganesh') maka nilai yang dikembalikan adalah:

    a hsenag
    b ganesh
    c gannag
    d hseesh
    e aneshg

4 	Perhatikan prosedur berikut:

    procedure dorong(var s: string);
    var
        i: longint;
    begin
        s := s + 'a';
        for i := 2 to length(s) do begin
            s[i] := s[i-1];
        end;
        s[1] := 'a';
    end;

Jika dipanggil dorong(nama) dengan nama adalah variabel string 'abcdef', maka nilai akhir dari variabel nama adalah:

    a abbbbbb
    b abcdefa
    c aabcdef
    d aaaaaaa
    e aaaaaa

Untuk dua soal berikutnya, perhatikan prosedur berikut:

    procedure cari(s, t: string);
    var
        i, j: longint;
        ls, lt: longint;
        benar: boolean;
    begin
        ls := length(s);
        lt := length(t);
        for i := 1 to ls-lt+1 do begin
            benar := true;
            for j := 1 to lt do begin
                if (s[i+j-1] <> t[j]) then begin
                    benar := false;
                    break;
                end;
            end;

            if (benar) then begin
                write(i);
            end;
        end;
    end;

5 	Jika dipanggil dengan perintah cari('abcabcabcda', 'abca'), maka yang dicetak adalah:

    a (tidak ada keluaran)
    b 1
    c 14
    d 147
    e 12345678

6 	Kompleksitas untuk kasus terburuk yang mungkin bagi prosedur cari adalah:

    a O(length(s))
    b O(length(s) + length(t))
    c O(length(s)^2)
    d O(length(s) * length(t))
    e tidak tentu karena terdapat perintah break

7 	Perhatikan fungsi berikut:

    function ubah(s: string): longint;
    var
        i, p, hasil: longint;
    begin
        p := 1;
        hasil := 0;

        for i := 1 to length(s) do begin
            hasil := hasil + p * (ord(s[i]) - ord('0'));
            p := p * 10;
        end;

        ubah := hasil;
    end;

Jika dipanggil ubah('12345'), maka nilai yang dikembalikan adalah:

    a 12345
    b 1500000
    c 15
    d 1234
    e 54321

8 	Perhatikan fungsi berikut:

    function buku(s: string): string;
    var
        arr: array['a'..'z'] of longint;
        i: longint;
        c: char;
    begin
        for c := 'a' to 'z' do begin
            arr[c] := 0;
        end;

        for i := 1 to length(s) do begin
            arr[s[i]] := arr[s[i]] + 1;
        end;

        buku := '';
        for c := 'a' to 'z' do begin
            for i := 1 to arr[c] do begin
                buku := buku + c;
            end;
        end;
    end;

Jika dipanggil dengan buku('dengklekbebek'), maka nilai yang dikembalikan adalah:

    a bbdeeeegkkkln
    b bbddeeggkklln
    c abcdefghijklmnopqrtuvwxyz
    d bdegkln
    e tidak ada pilihan jawaban yang benar