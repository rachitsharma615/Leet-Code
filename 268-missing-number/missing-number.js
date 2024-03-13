/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    
    let sum = 0
    const n = nums.length
    const totalSum = (n * (n+1))/2

    for(let i = 0; i<nums.length; i++)
    {
        sum = sum + nums[i]

    }

return totalSum - sum

};