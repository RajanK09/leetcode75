public class Solution {
    String gcd;
    public int checkinput(String data){
        int length = data.length();
        int i = 1;
        while(i < length){
            if(data.charAt(0) == data.charAt(i)){
                return i;
            }
            i++;
        }
        return 0;
    }
    public String gcdOfStrings(String str1, String str2) {
        //checking length
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }

        // If str1 is not the
        // concatenation of str2
        else if (!str1.startsWith(str2)) {
            return "";
        } else if (str2.isEmpty()) {
            int ret = checkinput(str1);
            if(ret!=0) {
                gcdOfStrings(str1, str1.substring(ret));
            }
            else {
                gcd = str1;
            }
            return gcd;
        } else {

            // Cut off the common prefix
            // part of str1 & then recur
            return gcdOfStrings(str1.substring(str2.length()),
                    str2);
        }
    }

    public int intGcd(int a, int b){
        if(b==0){
            return a;
        }
        return intGcd(b, a%b);
    }
    public String gcd(String s1, String s2){
        if (s1.length()+s2.length()==0 || !(s1+s2).equals(s2+s1)){
            return "";
        }

        int intgcd = intGcd(s1.length(), s2.length());
        String output = s1.substring(0,intgcd);
        int ret = checkinput(output);
        if (ret !=0){
            intgcd = intGcd(output.length(),ret);
        }

        return s1.substring(0,intgcd);

    }

}
