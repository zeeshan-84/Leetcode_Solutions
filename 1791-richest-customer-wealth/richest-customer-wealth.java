class Solution {
    public int maximumWealth(int[][] accounts) {
       
       int m=accounts.length;
       int n=accounts[0].length;
       int maxi=0;
       for(int i=0; i<m; i++){
          int sum=0;
          for(int j=0; j<n; j++){
            int value=accounts[i][j];
            sum=sum+value;
          }
          maxi=Math.max(maxi,sum);
       }
       return maxi;
    }
}