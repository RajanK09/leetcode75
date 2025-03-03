import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        int max = candies[0];
        for (int i = 1; i < candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean> retdata = new ArrayList<>(candies.length);
        if(extraCandies+candies[0]>=max)
            retdata.add(true);
        else
            retdata.add(false);


        for (int i = 1; i < candies.length;i++){
            if(extraCandies+candies[i] >= max){
                retdata.add(true);
            }
            else
                retdata.add(false);
        }
        return retdata;
    }
}