var sortColors = function(nums) {
    const map = {};
    for (let num of nums) {
        if(!map[num]){
            map[num] = 1;
        }else{
            map[num] = map[num] + 1;
        }
    }
    const result = [];
    let finalIndex = 0;
    let numberOfZeros = map[0];
    let numberOfOnes = map[1];
    let numberOfTwos = map[2];

    while (numberOfZeros > 0){
        result[finalIndex]=0;
        finalIndex++;
        numberOfZeros--;
    }
    while (numberOfOnes > 0){
        result[finalIndex]=1;
        finalIndex++;
        numberOfOnes--;
    }
    while (numberOfTwos > 0 && finalIndex < nums.length){
        result[finalIndex]=2;
        finalIndex++;
        numberOfTwos--;
    }
};

const nums = [2,0,2,1,1,0]

sortColors(nums);

console.log(nums)
