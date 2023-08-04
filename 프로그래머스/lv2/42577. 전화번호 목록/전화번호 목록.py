def solution(phone_book):
    answer = True
    check = phone_book[0]
    check_true = 0
    for i in range(1, len(phone_book)):
        print(check,phone_book[i],check in phone_book,check_true)
        if check in phone_book[i]:
            check_true += 1
        if check not in phone_book[i]:
            check = phone_book[i]
    if check_true == 0:
        return True
    else:
        return False