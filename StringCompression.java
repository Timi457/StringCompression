/**
 * Name: Timi Ryan Lab Name: StringCompression Purpose: The goal of String
 * compression is to compress a string using by implementing the disemvowel
 * compress and simple compress methods Date: 10/1/18
 */

public class StringCompression {

    // takes out the vowels and compresses the string
    public static String disV(String s){
         for(int i = 0; i < s.length(); i++){
             if(s.charAt(i) == 'a' || s.charAt(i) == 'A'||
             s.charAt(i) == 'e' || s.charAt(i) == 'E'||
             s.charAt(i) == 'i' || s.charAt(i) == 'I'||
             s.charAt(i) == 'o' || s.charAt(i) == 'O'||
             s.charAt(i) == 'u' || s.charAt(i) == 'U'||){
                 s = s.substring(0,i) + substring(i+1, s.length());
             }
         }
         return s;
     }

    // this compression numbers repetitions of letters
    public static String simpC(Stirng s) {
        String st = "";
        for (int i = 0; i < s.length();) {
            int num = 0;
            char ch = s.charAt(i);
            while (i < s.length() && s.charAt(i) == ch) {
                num++;
                i++;
            }
            n += ch;
            if (num > 1) {
                n += num;
            } else {
                i++;
            }
            return n;
        }
    }

}