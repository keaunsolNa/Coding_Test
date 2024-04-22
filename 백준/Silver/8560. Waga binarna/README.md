# [Silver V] Waga binarna - 8560 

[문제 링크](https://www.acmicpc.net/problem/8560) 

### 성능 요약

메모리: 14020 KB, 시간: 120 ms

### 분류

수학, 정렬

### 제출 일자

2024년 4월 23일 08:46:13

### 문제 설명

<p>Waga binarna to specyficzne urządzenie, które może dokonywać pomiarów dowolnych wielkości z przedziału (0, 1) z ustaloną dokładnością. Dokładność wagi ustala się pokrętłem, które można ustawić na pozycji 1 lub 2, lub 3, lub ..., lub 10. Gdy dokładność jest ustawiona na <em>m</em>, to waga dokonuje pomiarów z dokładnością do 1 / 2<em><sup>m</sup></em>. Wyniki pomiarów wagi są zapisywane w postaci par (<em>ℓ</em>, <em>m</em>). Taka para oznacza, że dokładność wagi jest ustawiona na <em>m</em> i wskazanie wagi wynosi <em>ℓ</em>, czyli ciężar ważonego przedmiotu wynosi <em>ℓ</em>/2<em><sup>m</sup></em> (<em>ℓ</em> jest liczbą naturalną i oczywiście 0 < <em>ℓ</em> < 2<em><sup>m</sup></em>, gdyż wspominaliśmy, że waga wskazuje wielkości z przedziału (0, 1)).</p>

<p>Twoim zadaniem jest napisanie programu, który uporządkuje wyniki pomiarów od najmniejszych do największych. Wyniki pomiarów zadane są w postaci par (<em>ℓ</em>, <em>m</em>). Różne pary oznaczające takie same wyniki (np. (1, 2) i (2, 3)) należy uporządkować rosnąco według wskazań, czyli pierwszych elementów w parach.</p>

### 입력 

 <p>Program powinien czytać dane z wejścia standardowego. W pierwszym wierszu danych podana jest liczba <em>n</em> (1 ≤ <em>n</em> ≤ 20 000), oznaczająca liczbę par. W kolejnych <em>n</em> wierszach podane są pary liczb <em>ℓ<sub>i</sub></em> i <em>m<sub>i</sub></em>, po jednej parze w wierszu; <em>ℓ<sub>i</sub></em> i <em>m<sub>i</sub></em> są oddzielone pojedynczym odstępem. Dla każdej pary spełnione są warunki: 1 ≤ <em>m<sub>i</sub></em> ≤ 10 oraz 1 ≤ <em>ℓ<sub>i</sub></em> ≤ 2<em><sup>m<sub>i</sub></sup></em>.</p>

### 출력 

 <p>Program powinien pisać wynik na wyjście standardowe. Wynikiem powinno być <em>n</em> par liczb podanych na wejściu, ale w takiej kolejności, by pary odpowiadające mniejszym wartościom pomiarów występowały przed parami odpowiadającymi większym wartościom. Takie same pomiary należy zapisać niemalejąco według wskazań. Każdą parę należy zapisać w takiej samej postaci, w jakiej była podana na wejściu.</p>

