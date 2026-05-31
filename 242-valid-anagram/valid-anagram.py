class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        count = {}
        for char in s:
            if char in count:
                count[char] = count[char] + 1 
            else:
                count[char] = 1    
        for char in t:
            if char in count:
                count[char] = count[char] - 1
            else:
                return False
        for val in count.values():
            if val!=0:
                return False
            
        return True
        

