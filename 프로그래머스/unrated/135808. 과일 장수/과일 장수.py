def solution(k, m, score):
    answer = 0
    score = sorted(score)
    boxes = score[len(score) % m::m]
    min_value = score[len(score) % m::m]
    for min in min_value:
        answer += min * m
    
 
    return answer