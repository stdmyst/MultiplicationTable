public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 15; // горизонталь
        int m = 2224; // вертикаль
        // должны вводиться пользователем, но я не разобрался, какой метод использовать

        for (int j = 1; j <= m; j++) { // сперва проходимся по горизонтали
            for (int i = 1; i <= n; i++) { // идём вниз
                int m1 = i * j; // получаемое произведение на данном шаге
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