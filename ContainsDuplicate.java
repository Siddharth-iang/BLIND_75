CONTAINS DUPLICATE

class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> freqMap = new HashMap<>();
        
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);

            if(freqMap.get(num) >1){
            return true;
        }
    }
        return  false;
  }
}
