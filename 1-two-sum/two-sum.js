/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    console.log('Nums is',nums)
    let count = []
    for (let i=0; i<nums.length ; i++) {
        console.log('Check',nums[i])

        let sumOne = nums[i] 
        for(let j=i+1; j<nums.length ; j++)
        {
            let sum2 = sumOne + nums[j]
             if(sum2 == target)
                count.push(i,j)
        } 
    
    }  
    return count
};