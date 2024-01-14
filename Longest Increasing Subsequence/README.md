# Longest Increasing Subsequence

## Approach

The given Java code solves the Longest Increasing Subsequence problem using a dynamic programming approach. Below is a step-by-step explanation:

1. **Initialization:**
   - Initialize an array `ans` of size `n`, where `n` is the length of array `A`.
   - Initialize each element of `ans` to 1, representing the minimum length of an increasing subsequence at each index.

2. **Dynamic Programming Loop:**
   - Iterate through each element of the array `A` starting from the second element (index 1).
   - For each element at index `i`, iterate through the elements before it (indexes 0 to i-1).
   - If the current element at index `i` is greater than the element at index `j` (A[i] > A[j]), update `ans[i]` to be the maximum of its current value and `1 + ans[j]`.
   - This step ensures that we consider the length of increasing subsequences ending at index `i`.

3. **Update Maximum Length:**
   - While iterating, keep track of the maximum length of increasing subsequences found so far in the variable `sol`.

4. **Return Result:**
   - The final result is the maximum length of increasing subsequences, stored in the variable `sol`.

## Time Complexity
The time complexity of the solution is O(N^2), where N is the length of the array. This is due to the nested loops involved in the dynamic programming approach.

## Code

```java
public class Solution {
    public int lis(final int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int sol = 1;
        for(int i = 1; i < n; i++){
            for(int j=0; j < i; j++){
                if(A[i] > A[j]){
                    ans[i] = Math.max(ans[i], 1 + ans[j]);
                }
                if(ans[i] > sol){
                    sol = ans[i];
                }
            }
        }
        return sol;
    }
}
