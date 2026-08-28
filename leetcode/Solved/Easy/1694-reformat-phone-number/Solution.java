class Solution {
    public String reformatNumber(String number) {
        
        String pn = number.replaceAll("-", "").replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();

        while (true) {

            if (pn.length() >= 4) {
                String temp = pn.substring(0, 4);
                pn = pn.substring(4, pn.length());
                sb.append(temp).append("-");
            }

            else if (pn.length() <= 3) {
                sb.append(pn);
                break;
            }

        }

        return sb.toString();
    }
}