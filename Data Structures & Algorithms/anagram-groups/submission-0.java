class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        
        for(String str:strs){

        /* char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        result.putIfAbsent(sortedString, new ArrayList<>());
        result.get(sortedString).add(str);
        } 
        return new ArrayList<>(result.values()); // time complexity: O(m*nlogn), space: O(m*n) */

        int[] count = new int[26];
        for(char c : str.toCharArray()){
           count[c-'a']++;
        }
        String key = Arrays.toString(count);
        result.putIfAbsent(key, new ArrayList<>());
        result.get(key).add(str);
        }
        return new ArrayList<>(result.values()); // time complexity:O(m*n), space: O(m*n)
    };
}
