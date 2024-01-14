public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lis(final int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        int sol = 1;
        for(int i = 1; i < n; i++){
            for(int j=0; j < i; j++){
                if(A[i]>A[j]){
                    ans[i]=Math.max(ans[i], 1+ans[j]);
                }
                if(ans[i]>sol){
                    sol = ans[i];
                }
            }
        }
        return sol;
    }
}
