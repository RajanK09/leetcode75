public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        char[] merged = new char[length1 + length2];
        int count, count1;
        if (length1 == length2) {
            for (count = 0, count1 = 0; count1 < (length1); count += 2, count1++) {

                merged[count] = ch1[count1];
                merged[count + 1] = ch2[count1];
            }
        } else if (length1 > length2) {
            for (count = 0, count1 = 0; count1 < (length2); count += 2, count1++) {
                merged[count] = ch1[count1];
                merged[count + 1] = ch2[count1];
            }
            //count1++;
            for (int c = count; count1 < length1; c++, count1++)
                merged[c] = ch1[count1];

        } else {
            for (count = 0, count1 = 0; count1 < (length1); count += 2, count1++) {
                merged[count] = ch1[count1];
                merged[count + 1] = ch2[count1];
            }
            //count += 2;
            for (int c = count; count1 < length2; c++, count1++)
                merged[c] = ch2[count1];


        }

        //System.out.println(strArray.toString());
        return String.valueOf(merged);


    }


}
