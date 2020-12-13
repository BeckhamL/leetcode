function minOperations(logs: string[]): number {

    let steps = 0;
    
    logs.forEach(step => {
        
        if (step === '../') {
            if (steps !== 0) {
                steps--;
            }
        }
        else if (step === './') {
            
        }
        else {
            steps++;
        }
    });
    
    if (steps < 0) {
        return 0;
    } else {
        return steps;
    }

};
