function isValid(s: string): boolean {

    let charArray = Array.from(s);
    let stack = [];
    
    if (charArray.length % 2 !== 0) {
        return false;
    }
    
    for (let i = 0; i < charArray.length; i++) {
        let c = charArray[i];
        if (c === '(' || c === '[' || c === '{') {
            stack.push(c);
        }
        else if (c === ')') {
            if ([...stack].pop() !== '(' || stack.length === 0) {
                return false;
            } else {
                stack.pop();
            }
        }
        else if (c === ']') {
            if ([...stack].pop() !== '[' || stack.length === 0) {
                return false;
            } else {
                stack.pop();
            }
        }
        else if (c === '}') {
            if ([...stack].pop() !== '{' || stack.length === 0) {
                return false;
            } else {
                stack.pop();
            }
        }
    }
    
    if (stack.length === 0) {
        return true;
    }
    
    return false;
};
