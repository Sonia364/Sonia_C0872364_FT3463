/** create subclass Modulo from Binary
 *
 */
public class Modulo extends Binary {

    public Modulo(int newLeft, int newRight) {
        super(newLeft, newRight);
        evaluate();
    }

    @Override
    public int evaluate() {
        return super.left % super.right;
    }

}
