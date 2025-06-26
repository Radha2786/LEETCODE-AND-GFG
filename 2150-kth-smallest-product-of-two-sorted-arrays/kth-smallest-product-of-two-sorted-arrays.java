class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long result =0; //kth smallest product
        // long l =  Long.MIN_VALUE; // minimum product possible
        // long r =  Long.MAX_VALUE;  // maximum product possible
        long l = -1_000_000_0000L; // -1e10
        long r = 1_000_000_0000L; // 1e10
        while(l<=r){
            long midProduct = l + (r-l) / 2;
            // check if this is kth smallest or not 
            long countsmallest = findCountSmallest(nums1,nums2,midProduct);
            if(countsmallest>=k){
                result = midProduct;
                r = midProduct-1;
            }else{
                l = midProduct+1;
            }
        }
        return result;
    }

    public static long findCountSmallest(int[] nums1, int[] nums2, long midProduct){
        long productsCount=0;
        int n = nums2.length;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>=0){
            int l = 0;
            int r = n-1;
            int m = -1;
            while(l<=r){
                int mid = l+(r-l)/2;
                long product = 1l * nums1[i]*nums2[mid]; 
                if(product<=midProduct){
                    m = mid;
                    l = mid+1;
                }else{
                    r= mid-1;
                }
            }
            productsCount+= (m+1); // covered by nums1[i]
            }else{
                // products will be negative and right hand side will contain smaller products and left hand side larger
                int l =0;
                int r = n-1;
                int m = n; // invalid index on the right hand side
                while(l<=r){
                int mid = l+(r-l)/2;
                long product = 1l* nums1[i]*nums2[mid]; 
                if(product<=midProduct){
                    m = mid;
                    r = mid-1;
                }else{
                    l= mid+1;
                }
            }
                                            // m=2;
            productsCount+= (n-m);  //{-10,-15,-20,-30}  
            // chote jo honge m se vo right hand side honge
            }
        }
        return productsCount;
    }
}