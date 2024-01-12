public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
  public int canCompleteCircuit(final int[] A, final int[] B) {
        int start=0;
        int curr=0;
        int currg=0;
        int al=A.length;
        int bl=B.length;
        //invalid input checking
        if(al!=bl||al==0||bl==0){
            System.out.println("Invalid Input");
            return -1;
        }
        //One sized arrays edge case checking
        if(al==1)
        return A[0]==B[0]?0:-1;
       
        while(start<al){
            curr=start;
            currg=A[start];
            while(currg>=B[curr]){
                currg-=B[curr];
                curr++;
               
                if(curr==bl){
                 curr=0;  
                }
                if(curr==start){
                    return start;
                }else{
                    currg+=A[curr];
                }
            }
            start++;
        }
        return -1;
    }
}
