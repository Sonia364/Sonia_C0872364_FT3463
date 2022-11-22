/** create subclass Product from Binary
 *
 */
public class Product extends Binary {

    public Product(int newLeft, int newRight) {
        super(newLeft, newRight);
    }

    @Override
    public int evaluate() {
        return super.left * super.right;
    }
}
