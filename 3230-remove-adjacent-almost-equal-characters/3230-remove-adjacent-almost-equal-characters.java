public class Solution {
    public int removeAlmostEqualCharacters(String word) {
        Stack<Character> charStack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < word.length(); ++i) {
            if (charStack.isEmpty()) {
                charStack.push(word.charAt(i));
            } else if (Math.abs(charStack.peek() - word.charAt(i)) == 0 || Math.abs(charStack.peek() - word.charAt(i)) == 1) {
                cnt++;
                charStack.pop();
            } else {
                charStack.pop();
                charStack.push(word.charAt(i));
            }
        }

        return cnt;
    }
}