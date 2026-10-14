class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list=new ArrayList<>();
        int[] factorial=new int[n+1];
        int fact=1;
        factorial[0]=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            factorial[i]=fact;
            list.add(i);
        }
        k--;
        StringBuilder result=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            int blockWeight=factorial[i];
            int target=k/blockWeight;
            result.append(list.get(target));
            list.remove(target);
            k=k%blockWeight;
        }
        return result.toString();
    }
}