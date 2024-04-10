class Solution {
    public int romanToInt(String s) {
        int sum = 0, size = s.length();
        for (int i = 0; i < size; i++){
            if (s.charAt(i) == 'M'){
                sum += 1000;
            }else if (s.charAt(i) == 'D'){
                sum += 500;
            }else if (s.charAt(i) == 'C'){
                if (i < size-1 && (s.charAt(i+1) == 'M' || s.charAt(i+1) == 'D')){
                    sum -= 100;
                }else{
                    sum += 100;
                }
            }else if (s.charAt(i) == 'L'){
                sum += 50;
            }else if (s.charAt(i) == 'X'){
                if (i < size-1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                    sum -= 10;
                }else{
                    sum += 10;
                }
            }else if (s.charAt(i) == 'V'){
                sum += 5;
            }else if (s.charAt(i) == 'I'){
                if (i < size-1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                    sum -= 1;
                }else{
                    sum += 1;
                }
            }
        }
        return sum;
    }
}