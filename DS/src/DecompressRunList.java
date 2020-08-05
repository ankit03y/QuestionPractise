/*We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.



Example 1:

Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
Example 2:

Input: nums = [1,1,2,3]
Output: [1,3,3]



i/p = [2,3,2,5,3,6]
pair = (2,3) (2,5) (3,6)

o/p array length = sum of all values at even index = 2+2+3 = 7
 o/p array  = [0, 1, 2, 3, 4, 5, 6] --> index are filled

o/p from_which_index_to_fill = 0
fill value in o/p here = []

Looping on i/p
jump by 2


i = 0
freq = i/p[0] = 2
value_to_fill = ip[i+1] = 3
===================================================

i = 2
freq = 2
value_to_fill = 5
o/p from_which_index_to_fill = 2
===================================================

i = 4
o/p from_which_index_to_fill  = 4
freq = 3
value_to_fill = 6


method --> fill(from_which_index_to_fill, freq, value_to_fill, o/p)
                [3, 3, 5, 5, 6, 6, 6]
                int i = 0
                while(i < freq) {
                    o/p[from_which_index_to_fill] = value_to_fill
                    from_which_index_to_fill++;
                    i++;
                }
                return from_which_index_to_fill


*/


