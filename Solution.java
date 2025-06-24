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