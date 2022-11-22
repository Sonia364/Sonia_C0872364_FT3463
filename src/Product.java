/** create subclass Product from Binary
 *
 */
public class Product extends Binary {

    public Product(ArithmeticExp newLeft, ArithmeticExp newRight) {
        super(newLeft, newRight);
    }

    @Override
    public String evaluate() {
        return "";
    }
}
