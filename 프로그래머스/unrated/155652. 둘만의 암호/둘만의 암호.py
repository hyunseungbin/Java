import string

def solution(s, skip, index):
    answer = ''
    alphabet_list = [al for al in string.ascii_lowercase if al not in skip]
    for i in s:
        answer += alphabet_list[(alphabet_list.index(i) + index) % len(alphabet_list)]
    return answer