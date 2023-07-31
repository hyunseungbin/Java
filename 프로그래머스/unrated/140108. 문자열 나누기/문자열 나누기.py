def solution(s):
    ret = 1
    answer = 1
    result = 0
    check = s[0]
    check_list = s[answer::]
    print(check_list)
    for i in check_list:
        if answer != result:
            if check == i:
                answer += 1
            else:
                result += 1
        else:
            check = i
            answer = 1
            result = 0
            ret += 1
    return ret