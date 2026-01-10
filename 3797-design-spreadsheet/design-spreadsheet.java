class Spreadsheet {
    HashMap<String, Integer> map = new HashMap<>();
    int row;
    public Spreadsheet(int rows) {
        row = rows;
    }
    
    public void setCell(String cell, int value) {
        map.put(cell, value);
    }
    
    public void resetCell(String cell) {
        map.remove(cell);
    }
    
    public int getValue(String formula) {
        int sum = 0;
        formula = formula.substring(1);
        String[] str = formula.split("\\+");
        for(String s : str) {
            if(Character.isLetter(s.charAt(0))) {
                sum += map.getOrDefault(s, 0);
            } else {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */