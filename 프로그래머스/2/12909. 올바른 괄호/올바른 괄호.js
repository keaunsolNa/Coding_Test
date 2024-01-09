function solution(text){

    let result = 0
    let answer = true
    
    for (let obj of text) {
      
        if (obj === '(') {
            result++
        } else {
            result--
            if (result < 0) return answer = false
        }

    }

    return result === 0 && answer

}