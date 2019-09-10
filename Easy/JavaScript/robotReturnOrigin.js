/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    
    let l = 0;
    let r = 0;
    let u = 0;
    let d = 0;
    
    for (let i = 0; i < moves.length; i++) {
        
        if(moves.charAt(i) == 'U') {
            u++;
        }
        else if(moves.charAt(i) == 'D') {
            d++;
        }
        else if(moves.charAt(i) == 'R') {
            r++;
        }
        else {
            l++;
        }
    }
    
    if (l == r && u == d) {
        return true;
    }
    else {
        return false;
    }
};
