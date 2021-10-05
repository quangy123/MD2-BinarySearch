public class BinarySearch {
    static int[] list ={1,2,6,4,33,66,7,88,22,3,56,9};
    static int binarySearch(int[] list,int key){
        int low = 0;
        int high = list.length-1;
        while (high>=low){
            int mid = (low+high)/2;
            if (key<list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,33));
        System.out.println(binarySearch(list,22));
        System.out.println(binarySearch(list,88));
        System.out.println(binarySearch(list,9));
    }
}

