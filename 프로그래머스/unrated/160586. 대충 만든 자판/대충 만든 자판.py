# def solution(keymap, targets):
#     answer = []
    
#     for target in targets:
#         result = 0
#         for tar in target:
#             check = []
#             for j in range(len(keymap)):
#                 if tar in keymap[j]:
#                     check.append(keymap[j].index(tar) + 1)
#             if check != []:
#                 result += min(check)
#         if result == 0:
#             answer.append(-1)
#         else:
#             answer.append(result)
#     return answer
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
                break  # If the character is not found in any key, break the loop and set result to -1
        answer.append(result)
    
    return answer