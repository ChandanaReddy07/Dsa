import java.util;
import java.io.*;
static boolean isAnagram(String a, String b) {
        
    String str1= a.toLowerCase();
    String str2= b.toLowerCase();
    
       if (str1.length() != str2.length()) {
        return false;
    }
    int count[] = new int[256];
    for (int i = 0; i < str1.length(); i++) {
        count[str1.charAt(i)]++;
        count[str2.charAt(i)]--;
    }
    for (int i = 0; i < 256; i++) {
        if (count[i] != 0) {
            return false;
        }
    }
    return true;

}
