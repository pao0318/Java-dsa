package array;

class Main{
    static void arrangeall(int arr[], int left, int right){
        while(left<=right){
            if (arr[left]<0 && arr[right]<0){
                left++;
            }
            else if(arr[left]>0&& arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left]>0&&arr[right]>0){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    }
    static void display(int arr[], int right) {
        for (int k = 0; k < right; k++)
            System.out.print(arr[k] + " ");

        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 10, -5, -9, -31, 5, 60, 7, 8};

        int arr_size = arr.length;
        arrangeall(arr, 0, arr_size-1);
        display(arr, arr_size-1);
    }



}