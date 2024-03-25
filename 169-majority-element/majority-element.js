/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    // Use Boyer-Moore Voting Algorithm for O(1) space complexity
    let candidate = null;
    let count = 0;

    // Find potential majority element
    for (let num of nums) {
        if (count === 0) {
            candidate = num;
        }
        count += num === candidate ? 1 : -1;
    }

    // Validate the candidate as majority element
    count = 0;
    for (let num of nums) {
        if (num === candidate) {
            count++;
        }
    }

    // If majority element exists, return it
    if (count > nums.length / 2) {
        return candidate;
    } else {
        // Handle cases where there's no majority element
        throw new Error("No majority element found.");
    }
};