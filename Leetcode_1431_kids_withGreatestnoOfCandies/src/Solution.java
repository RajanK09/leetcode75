import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> retdata = new ArrayList<>();
        int maxCandy=extraCandies;
        for (int candy:candies){
            if(maxCandy<=(extraCandies+candy)){
                retdata.add(true);
                maxCandy = candy;
            }
            else
                retdata.add(false);
        }
        return retdata;
    }
}