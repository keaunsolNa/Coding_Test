# [Silver IV] Sklep - 8641 

[문제 링크](https://www.acmicpc.net/problem/8641) 

### 성능 요약

메모리: 362116 KB, 시간: 1928 ms

### 분류

자료 구조, 해시를 사용한 집합과 맵

### 제출 일자

2024년 11월 11일 10:59:26

### 문제 설명

<p>Małgosia prowadzi swoją własną działalność gospodarczą - jest właścicielką sklepu. W każdy poniedziałek otrzymuje nową dostawę z magazynu. Aby nie mylić się w księgowości, Gosia ponumerowała wszystkie znajdujące się w sklepie artykuły. Z każda˛ dostawą sporządzany jest raport - lista z informacją o konkretnej paczce: numer produktu i jego ilość. Wycieńczona pracą właścicielka nie ma już sił na szybkie rozliczenie dostawcy z zamówienia. W takim momencie zwraca się do Ciebie, zaufanego informatyka, z prośbą o pomoc.</p>

<p>Opracuj program, który:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis raportu,</li>
	<li>podsumuje zamówienie,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력 

 <p>W pierwszym wierszu znajduje się liczba $N$ ($1 ≤ N ≤ 1\,000\,000$), oznaczająca ilość wierszy w raporcie. W każdej z następnych $N$ linii zapisano dwie liczby $A$ i $K$ ($1 ≤ A ≤ 10^9$,$1 ≤ K ≤ 100$) oznaczające kolejno numer produktu oraz jego ilość.</p>

### 출력 

 <p>W pierwszym wierszu powinna się znaleźć liczba P określająca ilość różnych produktów przywiezionych tego dnia do sklepu. Każda z kolejnych $P$ linii zawiera dwie liczby $A$ i $S$, gdzie $A$ to numer produktu, zaś $S$ to sumaryczna ilość jaka wpłynęła tego dnia do sklepu (możesz założyć, że liczba $S$ nie przekroczy wartości $2^{31}-1$). Kolejne numery produktów powinny występować w takiej samej kolejności, w jakiej pojawiały się na wejściu.</p>

