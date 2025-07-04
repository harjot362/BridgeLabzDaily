package July03;

public class sumTarget {
    public static void main(String[] args){
        int[] arr = {2,7,9,11};
        int target =9;
        int sum=0;
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){ // or arr.length -1-[]
                if(arr[i] + arr[j] == target){
                    System.out.println(i + " " + j);
                }
            }
            }
        }


    }

