public class Main {
    public static void main(String[] args) {
        String result;
        BinOps ops = new BinOps();
        // примеры вычисления
        result = ops.mult(Integer.toBinaryString(5), Integer.toBinaryString(7));
        System.out.println(Integer.parseInt(result, 2));
        result = ops.sum(Integer.toBinaryString(5), Integer.toBinaryString(7));
        System.out.println(Integer.parseInt(result, 2));

    }
}
