# june24_2025
The problems that I solved today

You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.

Return a list of all k-distant indices sorted in increasing order.

Code:
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> s=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==key)
                s.add(i);
        }
        Set<Integer> r=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int x:s)
            {
                if(Math.abs(i-x)<=k)
                    r.add(i);
            }
        }
        List<Integer> res=new ArrayList<>(r);
        Collections.sort(res);
        return res;
    }
}
