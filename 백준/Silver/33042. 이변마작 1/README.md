# [Silver IV] 이변마작 1 - 33042 

[문제 링크](https://www.acmicpc.net/problem/33042) 

### 성능 요약

메모리: 14208 KB, 시간: 104 ms

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 트리를 사용한 집합과 맵

### 제출 일자

2025년 1월 6일 12:39:55

### 문제 설명

<p>마작의 <strong>패</strong><sup>牌</sup>는 $34$종류의 패가 각각 $4$장씩, 총 $136$장으로 이루어져 있습니다. 패의 종류는 다음과 같습니다.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th scope="col">모양</th>
			<th scope="col">이름</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><img alt="" src="" style="vertical-align: middle; height: 3em; display: inline-block;" class="no-responsive"></td>
			<td>만수패<sup>萬數牌</sup></td>
		</tr>
		<tr>
			<td colspan="2">패에 쓰여 있는 한자에 따라 <code><span style="color:#e74c3c;">1m</span></code>, <code><span style="color:#e74c3c;">2m</span></code>, <code><span style="color:#e74c3c;">3m</span></code>, <code><span style="color:#e74c3c;">4m</span></code>, <code><span style="color:#e74c3c;">5m</span></code>, <code><span style="color:#e74c3c;">6m</span></code>, <code><span style="color:#e74c3c;">7m</span></code>, <code><span style="color:#e74c3c;">8m</span></code>, <code><span style="color:#e74c3c;">9m</span></code>으로 총 $9$개의 종류가 있습니다.</td>
		</tr>
		<tr>
			<td><img alt="" src="" style="vertical-align: middle; height: 3em; display: inline-block;" class="no-responsive"></td>
			<td>통수패<sup>筒數牌</sup></td>
		</tr>
		<tr>
			<td colspan="2">패에 그려져 있는 바퀴의 개수에 따라 <code><span style="color:#e74c3c;">1p</span></code>, <code><span style="color:#e74c3c;">2p</span></code>, <code><span style="color:#e74c3c;">3p</span></code>, <code><span style="color:#e74c3c;">4p</span></code>, <code><span style="color:#e74c3c;">5p</span></code>, <code><span style="color:#e74c3c;">6p</span></code>, <code><span style="color:#e74c3c;">7p</span></code>, <code><span style="color:#e74c3c;">8p</span></code>, <code><span style="color:#e74c3c;">9p</span></code>로 총 $9$개의 종류가 있습니다.</td>
		</tr>
		<tr>
			<td><img alt="" src="" style="vertical-align: middle; height: 3em; display: inline-block;" class="no-responsive"></td>
			<td>삭수패<sup>索數牌</sup></td>
		</tr>
		<tr>
			<td colspan="2">패에 그려져 있는 대나무의 개수에 따라 <code><span style="color:#e74c3c;">1s</span></code>, <code><span style="color:#e74c3c;">2s</span></code>, <code><span style="color:#e74c3c;">3s</span></code>, <code><span style="color:#e74c3c;">4s</span></code>, <code><span style="color:#e74c3c;">5s</span></code>, <code><span style="color:#e74c3c;">6s</span></code>, <code><span style="color:#e74c3c;">7s</span></code>, <code><span style="color:#e74c3c;">8s</span></code>, <code><span style="color:#e74c3c;">9s</span></code>로 총 $9$개의 종류가 있습니다.</td>
		</tr>
		<tr>
			<td><img alt="" src="" style="vertical-align: middle; height: 3em; display: inline-block;" class="no-responsive"></td>
			<td>자패<sup>字牌</sup></td>
		</tr>
		<tr>
			<td colspan="2">패에 쓰여 있는 글자의 종류에 따라 <code><span style="color:#e74c3c;">1z</span></code>, <code><span style="color:#e74c3c;">2z</span></code>, <code><span style="color:#e74c3c;">3z</span></code>, <code><span style="color:#e74c3c;">4z</span></code>, <code><span style="color:#e74c3c;">5z</span></code>, <code><span style="color:#e74c3c;">6z</span></code>, <code><span style="color:#e74c3c;">7z</span></code>로 총 $7$개의 종류가 있습니다.</td>
		</tr>
	</tbody>
</table>

<p>여러분은 마작패의 모양을 익히기 위해 마작패를 섞어 하나씩 놓아보고 있습니다. 하지만 여러분이 아직 모르고 있는 사실이 하나 있습니다. 바로 마작패들에 <strong>이변</strong>이 일어나고 있다는 것입니다.</p>

<p>마작에는 같은 종류의 패가 $4$장씩 존재하지만, 이변이 일어난 마작패는 종류가 바뀌기 때문에 경우에 따라서는 같은 종류의 패가 $5$장 이상이 되는 것도 가능합니다.</p>

<p>여러분은 마작패를 늘어놓다가 같은 마작패가 $5$장 이상 나왔을 때 이변을 눈치채고 해결해야 합니다. 이변을 눈치챌 수 있는 시점을 구해 주세요.</p>

### 입력 

 <p>첫 번째 줄에 늘어놓을 마작패의 개수 $N$이 주어집니다. $(1 \le N \le 136)$</p>

<p>두 번째 줄에 $N$장의 마작패의 종류가 놓아볼 순서대로 공백으로 구분되어 주어집니다. 입력으로 주어지는 모든 마작패는 위에서 설명한 $34$종 중 하나입니다.</p>

### 출력 

 <p>$i$번째 패를 놓은 이후에 이변을 눈치챌 수 있다면 $i$를 출력합니다. 패를 끝까지 늘어놓아도 이변을 눈치채지 못한다면, 대신 <code><span style="color:#e74c3c;">0</span></code>을 출력합니다.</p>

