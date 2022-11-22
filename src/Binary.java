/** create subclass Binary from ArithmeticExp
 *
 */
public class Binary extends ArithmeticExp {

    ArithmeticExp left;
    ArithmeticExp right;

    public Binary(ArithmeticExp newLeft, ArithmeticExp newRight){
        left = newLeft;
        right = newRight;
    }

    @Override
    public String evaluate() {
        return "";
    }
}
