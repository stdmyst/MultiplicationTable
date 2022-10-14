import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner n0 = new Scanner(System.in);
        Scanner m0 = new Scanner(System.in);
        int n = n0.nextInt(); // горизонталь
        int m = m0.nextInt(); // вертикаль

        for (int j = 1; j <= m; j++) { // вертикаль -> шаг вниз
            for (int i = 1; i <= n; i++) { // горизонталь -> шаг вправо
                int m1 = i * j; // произведение m*n на данном шаге
                int mn = i * m; // максимальное произведение в данном столбце

                String str1 = String.valueOf(m1);
                String str = String.valueOf(mn);
                int indent = (str.length() - str1.length()) + 1; // отступ - разность длин максимального и опредёленного на данном шаге произведений (+ 1, т.к. не должен быть равен 0)
                System.out.print(m1);
                while (indent != 0) {
                    System.out.print(" ");
                    indent--;
                }
            }
            System.out.println();
        }
    }
}