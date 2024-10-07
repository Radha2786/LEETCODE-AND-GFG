class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int p1 = 0, p2 = 0, i=0;
        int[] ans = new int[nums1.length + nums2.length];
        // step 1 Merge Two sorted Arrays
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] <= nums2[p2]){
                ans[i] = nums1[p1];
                p1++;
            }else{
                ans[i] = nums2[p2];
                p2++;
            }
            i++;
        }
        while(p1<nums1.length){
            ans[i]=nums1[p1];
            p1++;
            i++;
        }
        while(p2<nums2.length){
            ans[i]=nums2[p2];
            p2++;
            i++;
        }
        for(int k=0;k<ans.length;k++){
            System.out.println(ans[k]);
        }
        // check if length is even or odd of newly created array 
        int n = ans.length;
        if(n % 2 ==0){
            int firstVal = ans[n/2];
            int secondVal = ans[(n/2) -1];
             System.out.println(secondVal);
             System.out.println(firstVal);
            double val = ( (double) firstVal + (double) secondVal)/2;
            System.out.println(val);
            return val;
        }else{
           
             return ans[n/2];
        }
    }
}