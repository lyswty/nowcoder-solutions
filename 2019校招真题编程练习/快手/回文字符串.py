s = input()
dp = [[0 for i in range(len(s))] for i in range(len(s))]
for i in range(len(s)):
    dp[i][i] = 1
for i in range(1, len(s)):
    for start in range(0, len(s) - i):
        end = start + i
        if s[start] == s[end]:
            dp[start][end] = max(dp[start + 1][end - 1] + 2, dp[start + 1][end], dp[start][end - 1])
        else:
            dp[start][end] = max(dp[start + 1][end], dp[start][end - 1])
print(dp[0][len(s) - 1])