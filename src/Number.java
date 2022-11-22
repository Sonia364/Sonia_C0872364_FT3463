/** create subclass Number from ArithmeticExp
 *
 */
public class Number extends ArithmeticExp {

    private int value;

    public Number(int newValue) {
       value = newValue;
       evaluate();
    }


    @Override
    public int evaluate() {
        return 0;
    }
}
