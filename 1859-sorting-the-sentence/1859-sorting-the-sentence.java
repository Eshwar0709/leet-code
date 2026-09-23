class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str.length - 1; j++) {
                int digit1 = str[j].charAt(str[j].length() - 1) - '0';
                int digit2 = str[j + 1].charAt(str[j + 1].length() - 1) - '0';
                if (digit2 < digit1) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        String res = "";
        for(int i = 0; i < str.length; i++) {
            res += str[i].substring(0, str[i].length() - 1);
            if(i != str.length - 1) {
                res += " ";
            }
        }
        return res;
    }
}
