import java.util.Arrays;

class Solution {

    public static void main(String []args){
        String s = "aabcccccaaa";
        System.out.printf("String \"\s\" can be compressed to \"a2b1c5a3\". Got: \"\s\".", s, compressedString(s));
        System.out.println(Arrays.toString(nums1));
    }
    
    public static String compressedString(String s) {
        if(s.isEmpty()) return s;

        ArrayList list = new ArrayList<>();
        int index = 0;
        int count = 1;
        char curr = s.charAt(0);
        for(int i = 1; i < s.length; i++){
            char c = s.charAt(i);
            if(c == curr){
                count++;
            } else {
                list.set(c, index);
                curr = c;
                index += 2;
            }
        }

        

    }
}
