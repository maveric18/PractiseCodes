package src.main.java.testing;
import java.util.HashMap;
public class TwoArray {
    public static Boolean checkArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : arr2) {
            if (map.containsKey(i)) {
                if(map.get(i) == 1) {
                    map.remove(i);
                }else{
                    map.put(i,map.get(i)-1);
                }
            } else {
                return false;
            }
        }
        if (map.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{270,219,702,704,654,934,908,960,729,807,798,721,85,309,335,699,992,377,899,716,53,172,190,560,507,11,17,225,110,540,1,379,110,54,82,115,339,990,427,68148,224,788,232,533,123,282,876,851,180,591,255,351,132,814,858,495,182,82,604,721,434,983,182,488,416,297,826,405,723,893,552,298,33,135,182,507};
        int[] arr2 = new int[]{934,560,876,115,110,604,309,699,54,255,495,960,232,721,533,405,826,488,540,351,814,270,992,798,82,416,721,908,11,298,379,224,983,110,17,297,335,225,1,190,377,702,182,33,132,182,899,704,893,219,851,507,858,807,172,990,788,339,654,282,68,427,53,434,123,552,716,723,507,85,729,148,82,135,180,182,591};
        System.out.println(checkArray(arr1, arr2));
    }
}