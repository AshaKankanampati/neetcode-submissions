class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            {
                map.get(nums[i]).add(nums[i]);
            }else{
                map.put(nums[i], new ArrayList<>());
    map.get(nums[i]).add(nums[i]);
            }
           
        }
       List<Integer> result = map.entrySet()
        .stream()
        .sorted(
            Comparator.comparingInt(
                (Map.Entry<Integer, List<Integer>> entry) -> entry.getValue().size()
            ).reversed()
        )
        .limit(k)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());



        return result.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    }
}
