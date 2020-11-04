package arrays;

public class Test5 {
    public int findKthPositive(int[] arr, int k){
        int[] missingArr=missingNumber(arr);
        int kValue = missingArr[k-1];
        return kValue;

    }

    public int[] missingNumber(int[] arr){
        int start = 1;
        int end = arr[arr.length-1];
        int[] outputArr = new int[arr.length-1];
        for(int i= start; i<=end; i++){
            if(doGivenNumberPresentInArray(arr, i)){
                continue;
            }
            else{
                outputArr[i-1]=i;
            }

        }
        return outputArr;
    }


    public Boolean doGivenNumberPresentInArray(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(x==arr[i]){
                return true;

            }

        }
        return false;
    }

}
