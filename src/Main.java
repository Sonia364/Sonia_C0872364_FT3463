public class Main {

    public static void main(String[] args) {

        // constructing the expression 3 + 2 * 5
        Sum sum = new Sum(3, 2);
        Product product = new Product(sum.evaluate(), 5);
        System.out.println(product.evaluate());

        // Modulus
        Modulo modulo = new Modulo(10,3);
        System.out.println(modulo.evaluate());

    }

}