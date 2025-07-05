class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        int result =-1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key: map.keySet()){
            if(key==map.get(key)){
                result = Math.max(result,key);
            }
        }
        return result;
    }
}