const input = +require('fs').readFileSync('./dev/stdin').toString();
const temp = input / 4763;
if (Math.floor(temp) != temp) {
	console.log(0);
	process.exit();
}

const answer = [];
for (let i = 0; i <= 200; i++) {
	for (let j = 0; j <= 200; j++) {
		const x = i;
		const y = j;
		if (
			temp == x * 508 + y * 212 ||
			temp == x * 508 + y * 305 ||
			temp == x * 108 + y * 212 ||
			temp == x * 108 + y * 305
		)
			answer.push([x, y]);
	}
}

console.log(answer.length);
console.log(answer.map((v) => v.join(' ')).join('\n'));