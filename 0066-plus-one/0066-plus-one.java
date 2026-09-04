class Solution {
    public int[] plusOne(int[] digits) {

        boolean p = true;

        // Check if all digits are 9
        for(int i = 0; i < digits.length; i++){
            if(digits[i] != 9){
                p = false;
                break;
            }
        }

        // All 9s
        if(p){
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }

        // Handle carry
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }

        return digits;
    }
}