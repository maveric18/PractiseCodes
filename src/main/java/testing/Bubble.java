package src.main.java.testing;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

public class Bubble {

    public static void checkConsecutive(int[] arr){
        int max = 0;
        for(int a : arr){
            max = Math.max(max,a);
        }
        if(max == arr.length){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }

    public static int[] bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    arr = swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{285, 223, 327, 320, 107, 127, 266, 277, 324, 282, 322, 260, 257, 87, 288, 321, 269, 86, 69, 206, 66, 165, 160, 67, 316, 216, 161, 118, 330, 337, 274, 145, 256, 318, 250, 187, 273, 68, 105, 193, 314, 137, 77, 336, 287, 120, 334, 278, 281, 279, 289, 299, 291, 307, 190, 212, 286, 113, 227, 226, 301, 300, 174, 270, 123, 317, 275, 338, 202, 205, 70, 101, 344, 271, 102, 312, 157, 224, 201, 106, 88, 292, 305, 343, 246, 328, 138, 148, 315, 254, 108, 229, 346, 350, 255, 304, 247, 302, 208, 85, 158, 63, 225, 147, 172, 64, 78, 89, 258, 109, 323, 237, 80, 191, 110, 283, 83, 221, 296, 111, 72, 71, 155, 140, 95, 252, 126, 90, 91, 114, 228, 163, 303, 197, 162, 248, 75, 339, 116, 92, 209, 198, 139, 112, 276, 143, 306, 319, 180, 173, 325, 184, 335, 326, 156, 240, 293, 115, 261, 340, 290, 351, 58, 117, 341, 241, 329, 311, 119, 232, 121, 192, 135, 308, 213, 182, 313, 253, 146, 103, 214, 124, 331, 332, 230, 349, 194, 333, 259, 211, 284, 294, 342, 166, 309, 195, 73, 264, 164, 233, 98, 345, 74, 136, 239, 122, 231, 167, 175, 183, 93, 125, 84, 263, 200, 347, 132, 295, 128, 129, 177, 130, 280, 94, 234, 168, 297, 141, 104, 142, 207, 262, 131, 298, 144, 76, 154, 310, 57, 348, 59, 60, 265, 152, 61, 153, 62, 236, 65, 242, 235, 79, 176, 149, 133, 81, 82, 96, 169, 97, 210, 170, 99, 268, 151, 100, 251, 134, 150, 267, 159, 171, 272, 178, 196, 179, 203, 181, 185, 186, 188, 189, 199, 243, 204, 215, 217, 218, 238, 219, 220, 222, 244, 245, 249};
        System.out.println(bubbleSort(arr));
        checkConsecutive(arr);
        int[] zeroArray = { 472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412};
        String str = "";
        for (int i : zeroArray) {
            str = str + i;
        }
        System.out.println("str--" + str);

        BigInteger al = new BigInteger(str);
        String newStr = al.toString();
        System.out.println(al);

    }
}
