# [Bronze III] Sõnakuulelik Tom - 32728 

[문제 링크](https://www.acmicpc.net/problem/32728) 

### 성능 요약

메모리: 14172 KB, 시간: 108 ms

### 분류

구현

### 제출 일자

2024년 11월 21일 11:06:44

### 문제 설명

<p>Tomil on $N$ mänguasja ja nad on alailma mööda tuba laiali. Ema tüdines sellest ja andis Tomile kolm kasti mänguasjade paigutamiseks. Igasse kasti mahub $K$ mänguasja ja kastides on kokku piisavalt ruumi kõikide mänguasjade jaoks.</p>

<p>Tom otsustas esialgu panna mänguasjad kastidesse sellise reegli järgi: sinised mänguasjad sinisesse kasti A, rohelised mänguasjad rohelisse kasti B ja punased mänguasjad punasesse kasti C. Siis aga hakkas ta mõtlema: mis siis, kui kõik mänguasjad ei mahu samavärvilisse kasti? Sellepärast otsustas ta veel, et kui järjekordset mänguasja ei saa enam panna kasti A, siis püüab ta selle panna kasti B, B asemel kasti C ja C asemel kasti A.</p>

<p>On teada mänguasjade värvid kastidesse paigutamise järjekorras. Leida, kuidas paigutuvad mänguasjad kastidesse.</p>

### 입력 

 <p>Esimesel real on kaks täisarvu: mänguasjade koguarv $N$ ja ühte kasti mahtuvate mänguasjade arv $K$ ($0 \le N \le 100$, $K \le 40$, $N \le 3 \cdot K$).</p>

<p>Teisel real on $N$-täheline sõne, mis koosneb tähtedest '<code>s</code>', '<code>r</code>' ja '<code>p</code>' ning kirjeldab mänguasjade värve kastidesse paigutamise järjekorras.</p>

### 출력 

 <p>Kolmele reale kirjutada sõned, mis kirjeldavad kastidesse A, B ja C pandud mängu\-asjade värve. Igal real peavad mänguasjade värvid olema mänguasjade vastavasse kasti paigutamise järjekorras.</p>

