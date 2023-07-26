# import re
# def solution(X, Y):
#     answer = ''
#     check = []
#     list_x = sorted(list(X))
#     list_y = sorted(list(Y))
#     for x in list_x:
#         if x in list_y:
#             check.append(x)
#             index = list_y.index(x)
#             list_y.pop(index)
#     check_result = list(reversed(check))
#     if check_result == []:
#         return "-1"
#     elif check_result[0] == "0":
#         return "0"
#     else:
#         return "".join(map(str, reversed(check)))

def solution(X, Y):
    freq_x = {}
    freq_y = {}

    for char in X:
        freq_x[char] = freq_x.get(char, 0) + 1

    for char in Y:
        freq_y[char] = freq_y.get(char, 0) + 1

    common_chars = []
    for char in sorted(set(X) & set(Y)):
        count = min(freq_x[char], freq_y[char])
        common_chars.extend([char] * count)

    if not common_chars:
        return "-1"
    elif common_chars[-1] == "0":
        return "0"
    else:
        return "".join(common_chars[::-1])
