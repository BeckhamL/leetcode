// Given a word, you need to judge whether the usage of capitals in it is right or not.
// 1. All upper
// 2. All lower
// 3. Only first upper

function detectCapitalUse(word: string): boolean {
    
    let charArray = Array.from(word);
    
    if (charArray.every(c => c === c.toUpperCase())) {
        return true;
    }
    else if (charArray.every(c => c === c.toLowerCase())) {
        return true;
    } 
    else if (charArray[0] === charArray[0].toUpperCase() && charArray.slice(1).every(c => c === c.toLowerCase())){
        return true;
    }
    else {
        return false;
    }
};
