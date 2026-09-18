class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> duplicateHashMap=new HashMap<>();
        boolean isDuplicate=false;
        for(int i=0;i<nums.length;i++){
            if(duplicateHashMap.get(nums[i])!=null && duplicateHashMap.get(nums[i]))
            {
                isDuplicate=true;
                break;
            }
            duplicateHashMap.put(nums[i],true);
        }
        return isDuplicate;
    }
    
}

//To check whether it has duplicates below logic also will work 
//   return !(Arrays.stream(nums).distinct().count() == nums.length);
