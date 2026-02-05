public class splitarray{
   public static void main(String[] args){
       int[] arr = {1,3,4,2,2,10};
       int totalSum = 0;
       for(int num : arr){
           totalSum += num;
       }
       if(totalSum % 3 != 0){
           System.out.println(false);
           return;
       }
       int partSum = totalSum/3;
       int currSum = 0;
       int count = 0;
       for(int i =0;i<arr.length;i++){
           currSum += arr[i];
           if(currSum == partSum){
               count++;
               currSum =0;
           }
       }
       System.out.println(count>=3);
   }
}