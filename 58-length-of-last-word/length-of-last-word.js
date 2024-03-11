/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let lastWord = "";

    for (let i = 0; i < s.length; i++) {
        if (s[i] === " ") {
            // Check if the next character is not a space and reset lastWord
            if (i + 1 < s.length && s[i + 1] !== " ") {
                lastWord = "";
            }
        } else {
            lastWord = lastWord + s[i];
        }
    }

    return lastWord.length;
};