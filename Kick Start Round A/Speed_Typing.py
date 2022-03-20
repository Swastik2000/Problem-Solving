t=int(input())

for x in range(t):
    print("Case #", end="")
    print(x+1, end="")
    print(": ", end="")
    s1 = input()
    m = len(s1) 
    s2 = input()
    n = len(s2)
    
    cnt, i, j = 0, 0 ,0
    while(i < m and j < n):
        if(s1[i] == s2[j]):
            i+=1
        else:
            cnt+=1;
        j=j+1
    if(i != m):
        print("IMPOSSIBLE")
        
    else:
        print(cnt + n-j)
