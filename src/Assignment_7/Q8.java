package Assignment_7;

public class Q8 {

    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2) return true;
        int x0= coordinates[0][0];
        int y0= coordinates[0][1];
        int x1=coordinates[1][0];
        int y1= coordinates[1][1];
        for(int i=2;i<coordinates.length;i++){
            int x=coordinates[i][0];
            int y= coordinates[i][1];


            if((y1-y0)*(x-x0)!= (y-y0)*(x1-x0)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        int[][] num1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        var result = obj.checkStraightLine(num1);
        System.out.print(result);
    }
}
