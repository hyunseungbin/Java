def solution(cards1, cards2, goal):
    answer = ''
    check = []
    for word in goal:
        if word in cards1:
            check.append(cards1[0])
            cards1.pop(0)
        elif word in cards2:
            check.append(cards2[0])
            cards2.pop(0)
    if check == goal:
        return "Yes"
    else:
        return "No"