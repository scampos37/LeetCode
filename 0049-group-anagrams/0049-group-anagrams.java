class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map of strings
        Map<String, Integer> mp = new HashMap<>();
        // returned list of string lists
        List<List<String>> answer = new ArrayList<>();
        // loops through String[] "strs" for every String variable "str"
        for (String str: strs){
            // character array of string in string array
            char[] strChar = str.toCharArray();
            // sort character array alphabetically
            Arrays.sort(strChar);
            // creates new string that's sorted
            String sortedStr = new String(strChar);

            // if the sorted string exists in the map, add it to the answer through the sorted key string
            // at the current size of the answer array
            if (mp.containsKey(sortedStr)){
                answer.get(mp.get(sortedStr)).add(str);
            }
            // if sorted string doesn't exist in map, add it to the map with the value as the current size of the answer list
            // then create a new ArrayList with the string as it's first value and add it to the answer List.
            else{
                mp.put(sortedStr, answer.size());
                answer.add(new ArrayList<>(Arrays.asList(str)));
            }
        }
        return answer;

    }
}