public class Main {
    public static void main(String[] args) {
        String [][] arr = new String[6][4];
        for(int i = 0; i < arr.length; i++ ){
            for (int k = 0; k < arr[i].length; k++){
                if(i == 0 || i == 2){
                    arr[i][k] = " * ";
                }else if( k == 0 || k == 3){
                    arr[i][k] = " * ";
                }else {
                    arr[i][k] = "   ";
                }
            }
        }
        for(String[] row : arr){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}