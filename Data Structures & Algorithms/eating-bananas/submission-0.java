class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();

        while(l<r){
            int k=l+(r-l)/2;
            if(canEatAllBananas(piles,k,h))
            r=k;
            else l=k+1;
        }
        return l;
    }

    public  boolean canEatAllBananas(int[] piles,int k,int h){
            int actualHours=0;
            for(int x: piles){
                actualHours+=x/k;
                if(x%k!=0) actualHours++;
            }
        return actualHours<=h;
    }
}
