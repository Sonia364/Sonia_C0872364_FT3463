/** create subclass Sum from Binary
 *
 */
public class Sum extends Binary{
    public Sum(int newLeft, int newRight) {
        super(newLeft, newRight);
        evaluate();
    }
    @Override
    public int evaluate() {
        return super.left + super.right;
    }
}
