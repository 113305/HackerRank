firstName = raw_input()
lastName = raw_input()

print("Hello %s %s! You just delved into python." % (firstName, lastName))

"""
raw_input()과 input()의 차이
raw_input()은 String 반환
input()은 python표현식 반환
but python3에서는 raw_input()이 input()로 인식된다
원래(phthon2)의 input()을 쓰고싶다면 eval(input())
"""
