const [SNM, ...CMD] = require('fs').readFileSync('./dev/stdin').toString().trim().split('\n');

let S = +SNM.split(' ')[0]; 
let U = 0;
CMD.forEach((cmd) => {
	cmd = +cmd;
	if (cmd == 0) {
		U--;
	} else if (cmd == 1) {
		if (U + 1 > S) {
			S *= 2;
		}
		U++;
	}
});
console.log(S);