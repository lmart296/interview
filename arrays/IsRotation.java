import java.util.Arrays;

class Solution {

    public static void main(String []args){
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.printf("String s1: \"%s\" is a rotation of s2: \"%s\". Got: \"%b\".", s1, s2, isRotation(s1, s2));
    }
    
    public static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int i = 0, j = 0;
        for(j = 0; j < s2.length(); j++){
            if(s2.charAt(j) == s1.charAt(i)) break;
        }
        System.out.println("i="+i);
        System.out.println("j="+j);
        if(j == s2.length()) return false;

        int count = s2.length();
        while(count > 0){
            if(j == s2.length()) j = 0;
            if(s1.charAt(i) != s2.charAt(j)) return false;
            i++;
            j++;
            count--;
        }
        return true;
    }
}
