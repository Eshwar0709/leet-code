class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
      HashMap<Character,Integer> hm=new HashMap<>();
        int maxwin=1,i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            int prevfreq=hm.getOrDefault(ch,0);
            hm.put(ch,prevfreq+1);
            
            while(hm.get(ch)>1){
                char ich=s.charAt(i);
                hm.put(ich,hm.get(ich)-1);
                i++;
            }
            maxwin=Math.max(maxwin,j-i+1);
        }  
        return maxwin;
    }
}