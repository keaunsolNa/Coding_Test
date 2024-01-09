function solution(text){
  const result = []
  let answer = true

  text.split('').map((obj) => {
    if (obj === '(') {
      result.push(obj)
    } else {
      if (result.length === 0) answer = false
      result.pop()
    }
  })

  return result.length === 0 && answer
}