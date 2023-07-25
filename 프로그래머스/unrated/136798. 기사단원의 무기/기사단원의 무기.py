import math

def find_divisors_optimized(number):
    divisors_count = 0
    for i in range(1, int(math.sqrt(number)) + 1):
        if number % i == 0:
            divisors_count += 1
            if i != number // i:
                divisors_count += 1
    return divisors_count

def solution(number, limit, power):
    result = 0
    check_divisor = []
    
    for j in list(range(1,number+1)):
        answer = 0
        
        if find_divisors_optimized(j) <= limit:
            check_divisor.append(find_divisors_optimized(j))
        else:
            check_divisor.append(power)
            
    for k in check_divisor:
        result += k
    return result