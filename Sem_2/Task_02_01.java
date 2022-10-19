import java.util.Scanner;

public class Task_02_01 {

    public static void main(String[] args) {
            System.out.print("Input number of disks: ");
            Scanner iScanner = new Scanner(System.in);
            int n = iScanner.nextInt();
            iScanner.close();
        
            hanoi_tower(n, 'A', 'B', 'C');
    }

       static void hanoi_tower(int n, char start, char middle, char end) {     // n - количество дисков 
        if (n == 1) {                                                          // A, B, C - start, middle, end -башни
            move(n, start, end);
        } else {
            hanoi_tower(n - 1, start, end, middle);
            move(n, start, end);
            hanoi_tower(n - 1, middle, start, end);
        }
    } 
    public static  void move (int n, char from, char to) {
        System.out.println(" endure " + n + " from " + from + " to " + to );
    }

}
