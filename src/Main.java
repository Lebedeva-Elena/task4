public class Main {

    public static void main(String[] args) {

        try {
            divide(6, 3);
        } catch (DivideException e) {
            System.out.println("Ошибка:  " + e.getMessage());
        } finally {
            System.out.println("Результат равен " + divide(6, 3));
        }
    }

    public static double divide(int num1, int num2) throws DivideException{
        if (num2 == 0) {
            throw new DivideException("Делить на ноль нельзя");
        }
        return (double) num1 / num2;
    }
}














