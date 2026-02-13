class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,j=0;
        int maxOcc=1;
        char maxOccChar=s.charAt(j);
        int maxLen=1;
        for(j=0;j<s.length();j++){
            char jchar=s.charAt(j);
            hm.put(jchar,hm.getOrDefault(jchar,0)+1);
            if(maxOcc<hm.get(jchar)){
                maxOcc=hm.get(jchar);
                maxOccChar=jchar;
            }
            while(j-i+1 -maxOcc>k){
                char ichar=s.charAt(i);
                hm.put(ichar,hm.get(ichar)-1);
                i++;
                for(char key: hm.keySet()){
                    if(maxOcc<hm.get(key)){
                        maxOcc=hm.get(key);
                        maxOccChar=key;
                    }
                }
            }
            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}