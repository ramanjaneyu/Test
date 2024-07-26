package com.test.core.programs.multidimensionarray;

public class SprialClockwise {
    public static void main(String[] args) {
        int[][] arr = {{3, 4, 7, 11}, {6, 7, 15, 8}, {11, 27, 15, 14}, {8, 1, 12, 13}};
        spiralClockwise(arr);
    }
    private static void spiralClockwise(int[][] arr) {
        int tle = arr.length*arr[0].length;
        int sr=0, sc=0, er=arr.length-1, ec=arr[0].length-1, dir=-1;
        while(tle!=0){
            dir=(dir+1)%4;
            if(dir==0){
                for(int i=sc; i<=ec; i++){
                    System.out.print(arr[sr][i]+" ");
                    tle--;
                }
                sr++;
            } else if(dir==1){
                for(int i = sr; i <= er; i++){
                    System.out.print(arr[i][ec]+" ");
                    tle--;
                }
                ec--;
            } else if (dir==2) {
                for(int i = ec; i>=sc; i--){
                    System.out.print(arr[er][i]+" ");
                    tle--;
                }
                er--;
            } else {
                for(int i = er; i>=sr; i--){
                    System.out.print(arr[i][sc]+ " ");
                    tle--;
                }
                sc++;
            }
        }
    }
}
