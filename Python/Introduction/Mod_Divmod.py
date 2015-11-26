from __future__ import division

a = int(raw_input())
b = int(raw_input())

print(a//b)         #나눈 몫 정수형으로 반환
print(a%b)          #나머지 반환
print divmod(a, b)  #두개의 숫자를 입력값으로 받아 몫과 나머지를 튜플형태로 반환
