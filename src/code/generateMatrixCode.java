package code;

public class generateMatrixCode {
    public int[][] generateMatrix(int n) {
        int nums[][] = new int[n][n];
        int startX = 0;
        int startY = 0;
        int offset = 1;

        int count = 1; //矩阵中需要填写的数字，易错点：易错点写成了0
        int loop = 1; //记录当前的圈数，易错点：写成了0
        int i;
        int j;
        while(loop <= n/2){
            for(j=startY; j<n-offset; j++ ){
                nums[startX][j]=count++;
            }
            for(i  = startX; i<n-offset; i++ ){
                nums[i][j] = count++;
            }
            for( ; j>startX; j--){ //j不需要再初始化
                nums[i][j] = count++;
            }
            for( ; i>startY; i--){
                nums[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            //count++;易错点，count不能+，会越界
            loop++;
        }
        if(n%2 == 1){ // n 为奇数时，单独处理矩阵中心的值
            nums[startX][startY]=count;
        }
        return nums;
    }
}

