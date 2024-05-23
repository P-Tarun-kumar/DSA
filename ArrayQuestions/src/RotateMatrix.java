public class RotateMatrix {
    public static void main(String[] args) {
     RotateMatrix rm=new RotateMatrix();
     int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
     rm.rotateMatrix(arr);
    }
    public void rotateMatrix(int[][] matrix) {
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){

            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }
    }
}
