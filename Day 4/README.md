# Candy Distribution Problem

## Overview

This Java program solves the Candy Distribution Problem, where you need to distribute candies to children following certain rules based on their ratings.

## Approach

The approach used here is a two-pass algorithm. In the first pass, it iterates from left to right, ensuring that a child with a higher rating gets more candies than its left neighbor if applicable. In the second pass, it iterates from right to left, making sure that a child with a higher rating gets more candies than its right neighbor if applicable. The final result is the sum of candies distributed in both passes.

## Explanation

1. **Initialize Variables:**
   - Initialize a variable `sum` to store the total number of candies.
   - Create an array `choc` to represent the number of candies each child receives, initialized to 1 for each child.

2. **First Pass (Left to Right):**
   - Iterate through the ratings from left to right.
   - If the rating of the next child is higher and the candies assigned to the next child are less than or equal to the current child, update the candies for the next child to be one more than the current child.

3. **Second Pass (Right to Left):**
   - Iterate through the ratings from right to left.
   - If the rating of the previous child is higher and the candies assigned to the previous child are less than or equal to the current child, update the candies for the previous child to be one more than the current child.

4. **Calculate Total Candies:**
   - Sum up the candies assigned to each child in the array.

5. **Return Result:**
   - Return the total number of candies.

