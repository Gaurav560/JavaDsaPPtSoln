package Assignment11;

public class Q7Soln {

        public static int[] searchRange(int[] arr, int t) {
            int[] brr=new int[2];
            brr[0]=-1;brr[1]=-1;
            int f=-1;int l=-1;
            for(int i=0;i<arr.length;i++){
                if(t==arr[i]){
                    if(f==-1){
                        brr[0]=i;
                        f++;
                    }
                    else{
                        brr[1]=i;
                        l++;
                    }
                }
            }
            if(f!=-1&&l==-1){
                brr[1]=brr[0];
                return brr;
            }

            return brr;
        }

    public static void main(String[] args) {

            int[] nums={5,7,7,8,8,10};
            int target=8;
            int[] ans=searchRange(nums,target);
        for (int x:ans
             ) {
            System.out.print(x+" ");
        }
    }
    }


