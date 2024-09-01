class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int index = 0;

        for(int i = 1; i <= n; i++){
            // Push the number i onto the stack
            operations.add("Push");

            // If the number i is in the target array
            if(index < target.length && target[index] == i){
                index++;  // Move to the next element in target
            } 
            else {
                // If i is not in target, pop it from the stack
                operations.add("Pop");
            }

            // Break the loop once all target elements are found
            if(index == target.length){
                break;
            }
        }
        return operations;
    }
}
