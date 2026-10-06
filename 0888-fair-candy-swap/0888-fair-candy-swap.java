class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal=0,bobTotal=0;
        for(int x:aliceSizes){
            aliceTotal+=x;
        }
        for(int x:bobSizes){
            bobTotal+=x;
        }
        Set<Integer> target=new HashSet<>();
        for(int i=0;i<aliceSizes.length;i++){
            target.add((bobTotal-aliceTotal+2*aliceSizes[i])/2);
        }
        for(int i=0;i<bobSizes.length;i++){
            if(target.contains(bobSizes[i])){
                return new int[]{(aliceTotal+2*bobSizes[i]-bobTotal)/2,bobSizes[i]};
            }
        }
        return new int[0];
    }
}