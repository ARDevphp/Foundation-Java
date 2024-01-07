public class Array36 {
    public static void main(String[] args) {
        int [] array = {3,15,41,23,5,3,4,6,7,8,9,71};//15,23,5,4,6,7,8,9
        arrayMaxEle(array);
    }
    static void arrayMaxEle(int [] arr) {
        int maxEle = arr[1];
        for (int i = 1; i < arr.length-1; i++) {

            if (!(arr[i-1] < arr[i] && arr[i] > arr[i+1] && arr[i-1] > arr[i] && arr[i] < arr[i+1])) {
                if (maxEle < arr[i]) {
                    maxEle = arr[i];
                }
            }
        }
        System.out.println(maxEle);
    }
}
