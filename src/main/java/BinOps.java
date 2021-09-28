public class BinOps {
    // суммирование двух бинарных чисел
    public String sum(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalStateException("Not enough operands!");
        }
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(arg1 + arg2);
    }
    // перемножение двух бинарных чисел
    public String mult(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalStateException("Not enough operands!");
        }
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(arg1 * arg2);
    }
}