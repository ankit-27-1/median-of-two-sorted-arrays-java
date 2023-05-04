public class ques1{
     static double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n1 = nums1.length;
         int n2 = nums2.length;
         int n = n1 + n2;
         int[] new_arr = new int[n];

         int i = 0, j = 0, k = 0;

         while (i <= n1 && j <= n2) {
             if (i == n1) {
                 while (j < n2) {
                     new_arr[k++] = nums2[j++];
                     break;
                 }
             }
             else if (j == n2) {
                 while(i < n1) {
                     new_arr[k++] = nums1[i++];

                     break;
                 }
             }
             if (nums1[i] < nums2[j]) {
                 new_arr[k++] = nums1[i++];
             } else {
                 new_arr[k++] = nums2[j++];
             }
         }
       if (n % 2 == 0) return (float) (new_arr[n / 2 - 1] + new_arr[n / 2]) / 2;
        else return new_arr[n / 2];
     }


    public static void main(String[] args) {
        int[] arr=new int[2];
        int[] arr1=new int[1];
        arr[0]=1;
        arr[1]=4;
        arr1[0]=3;
        double a= findMedianSortedArrays(arr,arr1);
        System.out.println(a);
    }
}
