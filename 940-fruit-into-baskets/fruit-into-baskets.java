class Solution {
    public int totalFruit(int[] fruits) {
        // Brute force = two loops (Generating all the subarrays)
        // Optimised = Two Pointers (Sliding Window)
        int l =0 , r=0;
        int MaxLength=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<fruits.length){
                map.put(fruits[r], map.getOrDefault(fruits[r], 0) +1);
             if(map.size()>2){
                while(map.size()>2){
                   map.put(fruits[l], map.getOrDefault(fruits[l], 0) - 1);
                    if(map.get(fruits[l])==0){
                        map.remove(fruits[l]);
                    }
                    l++;
                }
            }
            if(map.size()<=2){
                MaxLength = Math.max(MaxLength, r-l+1);
            } 
            r++;   
        }
        return MaxLength;
    }
}