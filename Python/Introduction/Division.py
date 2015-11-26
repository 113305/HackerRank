from __future__ import division
a = int(raw_input())
b = int(raw_input())

print(a//b)
print(a/b)


"""
원래의 / 결과
1.0 / 2.0 --> 0.5
1.0 / 2   --> 0.5
1 / 2.0   --> 0.5
1 / 2     --> 0

from __future__ import division 입력 후의 / 결과

1 / 2 --> 0.5
4 / 2 --> 2.0
1 // 2 --> 0
4 // 2 --> 2
"""
