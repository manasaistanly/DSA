class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d = {}
        for k in strs:
           key= "".join(sorted(k))
           if key in d :
            d[key].append(k)
           else :
              d[key] = [k]
        return list(d.values())
        