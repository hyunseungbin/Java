def solution(keymap, targets):
    answer = []
    
    for target in targets:
        result = 0
        for tar in target:
            check = []
            for j in range(len(keymap)):
                if tar in keymap[j]:
                    check.append(keymap[j].index(tar) + 1)
            if check:
                result += min(check)
            else:
                result = -1
                break
        answer.append(result)
    return answer
