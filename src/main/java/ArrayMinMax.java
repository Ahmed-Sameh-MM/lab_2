public class ArrayMinMax {

    public int[] minMax(int arr[]) {
        int min = arr[0], max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }

        return new int[] {min, max};
    }
}
