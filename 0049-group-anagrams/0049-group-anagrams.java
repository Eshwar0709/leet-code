class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        Map<String, List<String>> map=new HashMap<>();
        for(String str: strs){
            int[] freq=new int[26];
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;
            }
            String freqStr=Arrays.toString(freq);
            if(!map.containsKey(freqStr)){
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(freqStr,list);
            }
            else{
                map.get(freqStr).add(str);
            }
        }
        for(List<String> entry: map.values()){
            result.add(entry);
        }
        return result;
    }
}