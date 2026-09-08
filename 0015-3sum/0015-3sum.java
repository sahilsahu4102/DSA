class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> mp=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i > 0 && nums[i] == nums[i-1]){
        continue;
    }
            int l=i+1;
            int h=nums.length-1;

            while(l<h){
                int sum=nums[i]+nums[l]+nums[h];
                if(sum>0){
                    h--;
                }else if(sum<0){
                    l++;
                }else{
                    mp.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[h])));
                    l++;
                    h--;
                    while(l<h&&nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<h&&nums[h]==nums[h+1]){
                        h--;
                    }                
                }
            }
        }
        return mp;
    }
}
