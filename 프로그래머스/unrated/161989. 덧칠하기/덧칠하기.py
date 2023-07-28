def solution(n, m, section):
    paint = section[0] -1
    answer = 0
    for sec in section:
        if sec > paint:
            paint = sec + m -1
            answer += 1
    return answer
