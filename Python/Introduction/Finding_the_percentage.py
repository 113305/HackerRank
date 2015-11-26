"""
There is a record of 'n' students,
each record having name of student, percent marks obtained in Maths, Physics and Chemistry

<Input Format>
Integer N followed by name and marks for N students, followed by the name of the particular student.

<Output Format>
Average percentage of marks obtained

<Constraints >
2 <= N <= 10
0 <= Marks <= 100


<Sample Input>
3
Krishna 67 68 69
Arjun 70 98 63
Malika 52 56 60
Malika

<Sample Output>
56.00
"""
#학생수 입력
n = int(input())
students = {}
who = ""

#학생 수만큼 딕셔너리에 넣고, 누구의 값을 추가할 것인지 받아야하기 때문에 n+1번 반복
for line in range(n+2):
    #" "로 나눠서 저장
    info = input().split(" ")
    #입력받은 학생 이름이 딕셔너리에 없으면 뒤에나오는 점수 값 딕셔너리에 저장
    #있으면 who 변수에 저장
    if info[0] not in students.keys():
        students[info[0]] = info[1:]
    else:
        who = info[0]

total = 0
length = len(students[who])

#mark를 String으로 받았기 때문에 float로 형변환 후 더함
for mark in students[who]:
    total += float(mark)

#평균구함
average = total/length
#소수 두번째자리까지 출력
print('{:.2f}'.format(average))
