#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]
result = 0
for a in arr:
    result += a

print(result)
