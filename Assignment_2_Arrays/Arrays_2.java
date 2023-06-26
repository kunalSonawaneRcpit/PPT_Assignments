import java.util.*;
class Arrays_2 {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> typeCandySet = new HashSet<>();
        int halfLength = candyType.length/2;

        for (int c : candyType) {
            if (typeCandySet.size() >= halfLength)
                return halfLength;
            typeCandySet.add(c);
        }
        return Math.min(typeCandySet.size(), halfLength);
    }
    public static void main(String[] args) {
        int[] candyType={1,1,2,2,3,3};
        int ans=distributeCandies(candyType);
        System.out.println(ans);
    }
}