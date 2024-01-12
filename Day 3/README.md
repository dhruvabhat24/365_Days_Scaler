# Finding Majority Element

## Overview

This Java program determines the majority element in an array, i.e., the element that appears more than ⌊ n/2 ⌋ times, where n is the length of the array.

## Approach

The approach used here is to sort the array in ascending order. The majority element, by definition, will be the middle element of the sorted array, as it appears more than ⌊ n/2 ⌋ times.

### Steps:

1. **Sort the Array:**
   - Use `Arrays.sort(A)` to sort the input array in ascending order.

2. **Find the Majority Element:**
   - The majority element will be at the index ⌊ n/2 ⌋ in the sorted array, where n is the length of the array.

3. **Return the Majority Element:**
   - Return the found majority element.

