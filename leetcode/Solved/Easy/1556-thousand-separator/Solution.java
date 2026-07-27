class Solution {
    public String thousandSeparator(int n) {
        
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(n).replace(',', '.');
    }
}