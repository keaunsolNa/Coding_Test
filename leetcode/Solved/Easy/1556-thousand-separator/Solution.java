class Solution {
    public String thousandSeparator(int n) {

        // Pin the symbols to Locale.ROOT: the grouping separator of the default
        // locale differs per JVM (fr-FR uses U+202F, not ','), so relying on it
        // and swapping ',' for '.' afterwards is not portable.
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(Locale.ROOT);
        symbols.setGroupingSeparator('.');

        return new DecimalFormat("#,##0", symbols).format(n);
    }
}
