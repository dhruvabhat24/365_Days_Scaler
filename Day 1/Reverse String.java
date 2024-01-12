public class Solution {
    public String reverseString(String A) {
        Stack<Character> queue = new Stack<>();
        String reversedString = "";
        for(int i =0; i <A.length();i++)
        queue.push(A.charAt(i));
        int sizeQueue = queue.size();
        for (int i =0; i<sizeQueue; i++)
        reversedString = reversedString.concat(queue.pop().toString());
        return reversedString;
    }
}
