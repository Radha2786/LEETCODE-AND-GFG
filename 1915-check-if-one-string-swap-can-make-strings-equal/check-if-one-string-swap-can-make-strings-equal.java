class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int diffCount=0;
        int firstIndex=-1;
        int secondIndex = -1;
       for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            diffCount++;
             if(diffCount>2){
            return false;
        }
         if(firstIndex==-1){
            firstIndex=i;
        }else{
            secondIndex=i;
        }
        }
        
       
       
       }
       System.out.println("firstIndex.."+ firstIndex);
       System.out.println("secondIndex.."+ secondIndex);
       if(diffCount==1){
        return false;
       }
        // return true;
        return diffCount==2 && s1.charAt(firstIndex) == s2.charAt(secondIndex) && s2.charAt(firstIndex)== s1.charAt(secondIndex);
    }
}