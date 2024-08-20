import java.util.Scanner;

public class Main {

    public static void bai1() {
        String name = null;
        int tuoi = 0;
        double chieucao = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.printf("Hãy nhập tên: ");
            name = scanner.nextLine();
            System.out.printf("Hãy nhập tuổi: ");
            tuoi = scanner.nextInt();
            System.out.printf("Hãy nhập chiều cao: ");
            chieucao = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Đầu vào không hợp lệ: " + e.getMessage());
            scanner.nextLine(); // Clear the buffer
        } finally {
            scanner.close();
        }

        System.out.println("\nTên là: " + name + "\nTuôi là: " + tuoi + "\nChiều cao là: " + chieucao + "cm");

        int a = 2, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a / b = " + ((float) a / b));
        System.out.println("a / b = " + (a / (float) b));
        System.out.println("a / b = " + (a / (double) b));
        System.out.println("a / b = " + a * 1.0 / b);
        System.out.println("a / b = " + a / (b * 1.0));
    }

    public static void nhapbai1() {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        int abc = 0;

        while (!flag) {
            try {
                System.out.println("Hãy nhập số:");
                abc = scanner.nextInt();
                flag = true;
            } catch (Exception e) {
                System.out.println("Đầu vào không hợp lệ, vui lòng thử lại.");
                scanner.nextLine(); // Clear the buffer
            }
        }
        System.out.println("Số đã nhập: " + abc);
        scanner.close();
    }

    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int value = 0;
        while (!validInput) {
            try {
                System.out.printf("Hãy nhập số: ");
                value = sc.nextInt();
                sc.nextLine();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Đầu vào không hợp lệ, vui lòng thử lại.");
                sc.nextLine();
            }
        }
        return value;
    }

    public static void nhapXuat() {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while (!flag) {
            try {
                System.out.printf("Hãy nhập tên bạn: ");
                String name = sc.nextLine();
                System.out.println("Hãy nhập tuổi");
                int age = inputNumber();
                System.out.println("Hãy nhập chiều cao");
                int height = inputNumber();
                System.out.printf("Tên: %s\n", name);
                System.out.printf("Tuổi: %d\n", age);
                System.out.printf("Chiều cao: %d m\n", height);
                flag = true;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
            sc.close();
    }
    public static void tinhCungHoangDao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập ngày");
        int ngay = inputNumber();
        System.out.println("Hãy nhập tháng");
        int thang = inputNumber();
         if(thang == 1){
            if(ngay >= 1 && ngay <= 19){
                System.out.println("Cung Ma Kết");
            }
            else if(ngay >= 20 && ngay <= 31){
                System.out.println("Cung Bảo Bình ");
            }
        }else if(thang == 2){
             if(ngay >= 1 && ngay <= 18){
                 System.out.println("Cung Bảo Bình");
             }
             else if(ngay >= 19 && ngay <= 31){
                 System.out.println("Cung Song Ngư");
             }
         }
         else if(thang == 3){
            if(ngay >= 1 && ngay <= 20){
                System.out.println("Bạch Dương (Aries) - 21/3 - 19/4");
                }
            else if(ngay >= 21 && ngay <= 31){
                System.out.println("Bạch Dương (Aries) - 21/3 - 19/4");
                System.out.println("Biểu Tượng: Cừu");
                System.out.println("Nguyên Tố: Lửa");
                System.out.println("Tính Cách: Quyết đoán, năng động, nhiệt huyết, thích chinh phục thử thách.");
                System.out.println("Điểm Mạnh: Dũng cảm, lãnh đạo tốt, sáng tạo");
                System.out.println("Điểm Yếu: Cấp bách, thiếu kiên nhẫn, dễ nóng giận.");

            }
        }
        else if(thang == 4){
            if(ngay >= 1 && ngay <= 19){
                System.out.println("Bạch Dương (Aries) - 21/3 - 19/4");
                System.out.println("Biểu Tượng: Cừu");
                System.out.println("Nguyên Tố: Lửa");
                System.out.println("Tính Cách: Quyết đoán, năng động, nhiệt huyết, thích chinh phục thử thách.");
                System.out.println("Điểm Mạnh: Dũng cảm, lãnh đạo tốt, sáng tạo");
                System.out.println("Điểm Yếu: Cấp bách, thiếu kiên nhẫn, dễ nóng giận.");

            }
            else if(ngay >= 20 && ngay <= 31){
                System.out.println("Kim Ngưu (Taurus) - 20/4 - 20/5\n");
                System.out.println("Biểu Tượng: Bò");
                System.out.println("Nguyên Tố: Đất");
                System.out.println("Tính Cách: Kiên định, thực tế, yêu thích sự ổn định và an toàn");
                System.out.println("Điểm Mạnh: Dũng cảm, lãnh đạo tốt, sáng tạo");
                System.out.println("Điểm Yếu: Cấp bách, thiếu kiên nhẫn, dễ nóng giận.");

            }
        }
        else if(thang == 5){
            if(ngay >= 1 && ngay <= 20){
                System.out.println("Cung Kim Ngưu");
            }
            else if(ngay >= 20 && ngay <= 31){
                System.out.println("Cung Song Tử");
            }
        } else if(thang == 6){
            if(ngay >= 1 && ngay <= 20){
                System.out.println("Cung Song Tử");
            }
            else if(ngay >= 21 && ngay <= 31){
                System.out.println("Cung Cự Giải");
            }
        } else if(thang == 7){
            if(ngay >= 1 && ngay <= 22){
                System.out.println("Cung Cự Giải");
            }
            else if(ngay >= 23 && ngay <= 31){
                System.out.println("Cung sư tử");
            }
        } else if(thang == 8){
            if(ngay >= 1 && ngay <= 22){
                System.out.println("Cung sư tử");
            }
            else if(ngay >= 23 && ngay <= 31){
                System.out.println("Cung xử nữ");
            }
        } else if(thang == 9){
            if(ngay >= 1 && ngay <= 22){
                System.out.println("Cung sư tử");
            }
            else if(ngay >= 25 && ngay <= 31){
                System.out.println("Cung Thiên Bình");
            }
        } else if(thang == 10){
            if(ngay >= 1 && ngay <= 22){
                System.out.println("Cung Thiên Bình");
            }
            else if(ngay >= 23 && ngay <= 31){
                System.out.println("Cung Bọ cạp");
            }
        } else if(thang == 11){
            if(ngay >= 1 && ngay <= 21){
                System.out.println("Cung Bọ cạp");
            }
            else if(ngay >= 22 && ngay <= 31){
                System.out.println("Cung Nhân Mã");
            }
        }  else if(thang == 12){
            if(ngay >= 1 && ngay <= 21){
                System.out.println("Cung Nhân Mã");
            }
            else if(ngay >= 22 && ngay <= 31){
                System.out.println("Cung Ma Kết");
            }
        }
    }

    public static void main(String[] args) {

    }
}
