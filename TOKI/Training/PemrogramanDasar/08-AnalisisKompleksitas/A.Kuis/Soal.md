1 	Perhatikan potongan program berikut:

    x := 0;
    for i := 1 to N do begin
        for j := 1 to N do begin
            for k := j to N do begin
                x := x + 2;
            end;
        end;
    end;

Untuk sembarang nilai N, nilai x setelah potongan program tersebut dijalankan sama dengan ....

    a N3 - N
    b N2 (N + 1)
    c N2 (N + 1) / 2
    d N (N + 1)(N + 2) / 6
    e N3

2 	Perhatikan potongan program berikut:

    count := 0;
    n := 5;
    for i := 1 to n do
    begin
        count := count + (2 * i - 1);
    end;
    writeln(count);

Untuk sembarang nilai n, nilai count setelah potongan program tersebut dijalankan sama dengan ....

    a 1 + 2 + 3 + ... + n
    b 1 + 3 + 5 + ... + (n - 1)
    c 2 + 4 + 6 + ... + n
    d n2
    e 2n

3 	Perhatikan potongan program berikut:

    total := 0;
    for i := 1 to N do begin
        for j := N-3 downto i do begin
            total := total + 1;
        end;
    end;

Kompleksitas potongan program tersebut paling mendekati ....

    a O(log N)
    b O(N2)
    c O(N3)
    d O(N - 3)
    e Pilihan a sampai dengan d salah

4 	Perhatikan potongan program berikut:

    for i := 1 to N do begin
        if (i*i > N) then
            break;
    end;

Kompleksitas potongan program tersebut paling mendekati ....

    a O(log N)
    b O(sqrt(N))
    c O(N/2)
    d O(N)
    e Pilihan a sampai dengan d salah

5 	Perhatikan potongan program berikut:

    counter := N;
    while (counter > 0) do begin
        counter := counter div 3;
    end;

Kompleksitas potongan program tersebut paling mendekati ....

    a O(log N)
    b O(sqrt(N))
    c O(N/2)
    d O(N)
    e Pilihan a sampai dengan d salah

6 	Perhatikan potongan program berikut:

    for i := 1 to N do begin
        counter := i;
        while (counter > 0) do begin
            counter := counter div 2;
        end;
    end;

Kompleksitas potongan program tersebut paling mendekati ....

    a O(N log N)
    b O(sqrt(N))
    c O(N2 / 2)
    d O(N2)
    e Pilihan a sampai dengan d salah

7 	Perhatikan potongan program berikut:

    for i := 1 to N do begin
        counter := i;
        while (counter > 0) do begin
            counter := counter div 2;
        end;

        counter := 0;
        while (counter*counter < N) do begin
            counter := counter + 1;
        end;
    end;

Kompleksitas potongan program tersebut paling mendekati ....

    a O(N log N)
    b O(N sqrt(N))
    c O(N log N sqrt(N))
    d O(N2)
    e Pilihan a sampai dengan d salah

8 	Perhatikan potongan program berikut:

    total := 0;
    for i := 1 to N do begin
        for j := 1 to M do begin
            total := total + 1;
        end;

        for j := 1 to N do begin
            total := total + 1;
        end;
    end;

Kompleksitas potongan program tersebut paling mendekati ....

    a O(N2)
    b O(NM)
    c O(N2 + NM)
    d O(N + M)
    e Pilihan a sampai dengan d salah

9 	Perhatikan potongan program berikut:

    total := 0;
    for i := 1 to N do begin
        for j := 1 to N do begin
            total := total + 1;
        end;
    end;

Jika untuk N = 10 potongan program tersebut membutuhkan waktu 1 detik untuk dijalankan, maka untuk N = 100 potongan program tersebut kira-kira membutuhkan waktu ....

    a 1 detik
    b 10 detik
    c 100 detik
    d 10.000 detik
    e Pilihan a sampai dengan d salah