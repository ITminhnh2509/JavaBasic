
public class Array1 {
    public static final double PI = 3.142;
    public static final String GREETING_MESSAGE = "Hello, World!";

    public enum Day{
        Monday, Tuesday, Wednesday, Thursday, Saturday, Friday, Sunday
    }

    public static void vonglap1(){
        int[] numbers = {1,2,3,4,5};
        for(int number : numbers){
            System.out.println(number);
        }
    }
    public static void vonglap2(){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i =0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
    public static void vonglap3(){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int tong = 0;
        for(int i = 0; i < matrix.length; i++){
            tong +=matrix[i][i];
        }
        System.out.printf("Tổng đường chéo chính là: %d", tong);
        System.out.println();
        int tong1= 0;
        for(int i =0; i < matrix.length; i++){
            tong1 += matrix[i][matrix.length-i-1];
        }
    }
    public static double dientichhinhtron(double bankinh){
        return bankinh*bankinh*PI;
    }
    public static void WIToday(){
            Day today = Day.Sunday;
            double r=8;
            System.out.println(dientichhinhtron(r));
            switch (today){
                case Monday: System.out.println("Today is Monday.");
                break;
                case Friday: System.out.println("Today is Friday.");
                break;
                case Sunday: System.out.println("Today is Sunday.");
                break;
                default:
                    System.out.println("Today is regular day");
                    break;
            }
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(4,3);
        System.out.println("Dài = "+ hcn.dai);
        System.out.println("Rộng = "+ hcn.rong);
        System.out.printf("Chu vi hcn là: %f",hcn.chuviHinhChuNhat());
        System.out.printf("Dien tich hcn la: %f",hcn.dientichHinhChuNhat());
    }
}
