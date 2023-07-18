package Assignment16;

import java.util.HashMap;
class Q1 {


    public static int[] nextGFE(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[n];

        for(int e : arr){
            map.put(e, map.getOrDefault(e, 0)+1);
        }

        for(int i = 0; i < n; i++){
            boolean found = false;
            for(int j = i+ 1; j< n;j++){
                if(map.get(arr[j])>map.get(arr[i])){
                    ans[i] = arr[j];
                    found = true;
                    break;
                }
            }
            if(!found){
                ans[i] = -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 2, 4, 2, 3, 2};
        int ans[] = nextGFE(arr, arr.length);
        for(int e : ans){
            System.out.print(e+" ");
        }
    }
}