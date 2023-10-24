const [[N, M], ...V] = require('fs')
	.readFileSync('./dev/stdin')
	.toString()
	.trim()
	.split('\n')
	.map((v) => v.trim().split(' '));

const week = M / 7;
const vy = new Map();

for (let i = 0; i < N; i++) {
	const [name, day, stime, etime] = V.shift();
	const startTime = stime.split(':').map(Number);
	const endTime = etime.split(':').map(Number);

	const diff = endTime[0] * 60 + endTime[1] - startTime[0] * 60 - startTime[1];
	const w = Math.floor((day - 1) / 7);
	if (vy.has(name)) {
		const timeTable = vy.get(name);
		timeTable[w][0] += 1;
		timeTable[w][1] += diff;
		vy.set(name, timeTable);
	} else {
		const timeTable = Array.from(Array(week), () => Array(2).fill(0));
		timeTable[w][0] += 1;
		timeTable[w][1] += diff;
		vy.set(name, timeTable);
	}
}

const answer = [];
vy.forEach((tb, nm) => {
	let real = true;
	for (let i = 0; i < week; i++) {
		if (tb[i][1] < 3600 || tb[i][0] < 5) {
			real = false;
		}
		if (!real) break;
	}
	if (real) answer.push(nm);
});

if (answer.length == 0) console.log(-1);
else console.log(answer.sort().join('\n'));
