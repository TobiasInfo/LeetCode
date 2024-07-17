class Solution:
    def expand_from_center(self, s, center):
        length = len(s)
        if center % 2 == 0:
            left = center // 2 - 1
            right = center // 2
        else:
            left = center // 2
            right = center // 2

        while left >= 0 and right < length and s[left] == s[right]:
            left -= 1
            right += 1
        return s[left + 1:right]

    def longestPalindrome(self, s: str) -> str:
        if not s or len(s) == 1:
            return s
        sub_string = ""
        for i in range(2 * len(s) - 1):
            result = self.expand_from_center(s, i)
            if len(result) > len(sub_string):
                sub_string = result
        return sub_string