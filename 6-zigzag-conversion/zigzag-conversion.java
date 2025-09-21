class Solution {
    public String convert(String s, int numRows) {
       if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }
        //place the string in horizontal order and then try generating rows in which element lies
        //PAYPALISHIRING : 01210121012101 -> PUT THE ELEMENTS IN RESPECTIVE GENERATED INDEXES
        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }
        //FINALLY APPEND ALL THE INDEXES
        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }
        return result.toString();        
    }
}