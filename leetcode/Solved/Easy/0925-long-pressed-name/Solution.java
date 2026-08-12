class Solution {

    public boolean isLongPressedName(String name, String typed) {

        int nameLength = name.length();
        int typedLength = typed.length();
        int nameIndex = 0;
        int typedIndex = 0;
      
        while (nameIndex < nameLength && typedIndex < typedLength) {

            if (name.charAt(nameIndex) != typed.charAt(typedIndex)) return false;
          
            int nameGroupEnd = nameIndex + 1;
            while (nameGroupEnd < nameLength && 
                   name.charAt(nameGroupEnd) == name.charAt(nameIndex)) {
                nameGroupEnd++;
            }
          
            int typedGroupEnd = typedIndex + 1;
            while (typedGroupEnd < typedLength && 
                   typed.charAt(typedGroupEnd) == typed.charAt(typedIndex)) {
                typedGroupEnd++;
            }
          
            int nameGroupSize = nameGroupEnd - nameIndex;
            int typedGroupSize = typedGroupEnd - typedIndex;
          
            if (nameGroupSize > typedGroupSize) return false;
          
            nameIndex = nameGroupEnd;
            typedIndex = typedGroupEnd;
        }
      
        return nameIndex == nameLength && typedIndex == typedLength;
    }
}
