class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1] = digits[digits.length-1] + 1;
        for (int i = digits.length-1; i > 0; i--){
            System.out.println(i);
            if (digits[i] == 10){
                digits[i] = 0;
                digits[i-1] = digits[i-1]+1;
            }
            else{
                break;
            }
        }
        if (digits[0] == 10){
            int[] updated = new int[digits.length+1];
            updated[0] = 1;
            updated[1] = 0;
            for(int i = 2; i < updated.length; i++){
                updated[i] = digits[i-1];
            }
            return updated;
        }
        return digits;
    }
}