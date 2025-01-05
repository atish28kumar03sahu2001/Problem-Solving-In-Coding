// Input: 14	Output: Even	Input: 23	Output: Odd
function EvenOdd(num) {
    if(num % 2 === 0) return "EVEN";
    else return "ODD";
}
console.log(EvenOdd(14)); // EVEN
console.log(EvenOdd(23)); // ODD