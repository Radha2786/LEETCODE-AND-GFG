class Solution {
    public double separateSquares(int[][] squares) {

        double low = Integer.MAX_VALUE;
        double high = Integer.MIN_VALUE;
        double totalArea = 0;

        for(int[] s: squares){
            double y = s[1], l= s[2];
            low = Math.min( low, y);
            high = Math.max( high, y + l);
            totalArea+= l*l;
        }

        // apply binary search
        double result_y = 0.00000;

        while(high-low >  1e-5){

            double mid_y = (low + high)/2.0;
            result_y = mid_y;

            // we are putting check on bottom area
            if(check(squares , mid_y , totalArea)== true){ // bottom area is greater 
            // shift mid_y down to balance area 
            high = mid_y ;
            }else{
                low = mid_y;
            }
        }
        return result_y;
    }

    private boolean check(int[][] squares, double mid_y, double total){
        double bottomArea = 0.0;
        for(int[] s: squares){
            double y = s[1];
            double l = s[2];
            double BottomY = y;
            double TopY = y+l;
            if(mid_y > TopY){
                bottomArea+= l*l;
            }else if(mid_y > BottomY){
                bottomArea+= l * (mid_y - BottomY);
            }
        }
        return bottomArea >= total / 2.0;  //Is bottom area more than above ?
    }
}