function solution(num_str) {
    var answer = 0;
    var i = [...num_str];
    var e = i.map(Number);
    answer = e.reduce((avg,num) => avg+ num),0 
    return answer;
}