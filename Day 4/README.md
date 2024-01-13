# Candy Distribution Problem

## Problem Description

N children are standing in a line, each assigned a rating value. The task is to distribute candies to these children based on the following rules:
1. Each child must have at least one candy.
2. Children with a higher rating should receive more candies than their neighbors.

## Approach

The problem can be solved using a two-pass algorithm:

### First Pass (Left to Right):

1. Initialize an array to store the number of candies for each child (`candies`), and set all values to 1.
2. Iterate through the ratings from left to right.
3. If the rating of the current child is higher than the rating of the previous child, update the candies for the current child to be one more than the previous child.

### Second Pass (Right to Left):

1. Iterate through the ratings from right to left.
2. If the rating of the current child is higher than the rating of the next child and the candies assigned to the current child are not already greater, update the candies for the current child to be one more than the next child.

### Calculate Total Candies:

1. Sum up the candies assigned to each child in the array.

### Return Result:

1. Return the total number of candies.

## Implementation

```java
public class Solution {
    public int candy(int[] A) {
        int n = A.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // First Pass (Left to Right)
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Second Pass (Right to Left)
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calculate Total Candies
        int totalCandies = Arrays.stream(candies).sum();

        return totalCandies;
    }
}


