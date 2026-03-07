class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(char ch: t.toCharArray()){
            sum+=(int)ch;
        }
        for(char ch: s.toCharArray()){
            sum-=(int)ch;
        }
        return (char)sum;
    //     HashMap<Character,Integer> hm=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         hm.put(ch,hm.getOrDefault(ch,0)+1);
    //     }
    //     for(int i=0;i<t.length();i++){
    //         char ch=t.charAt(i);
    //         if(!hm.containsKey(ch) || hm.get(ch) == 0){
    //             return ch;
    //         }
    //         hm.put(ch,hm.get(ch)-1);
    //     }
    //     return '\0';
    }
}