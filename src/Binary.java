/** create subclass Binary from ArithmeticExp
 *
 */
public class Binary extends ArithmeticExp {

    int left;
    int right;

    public Binary(int newLeft, int newRight){
        left = newLeft;
        right = newRight;
    }

    @Override
    public int evaluate() {
        return 0;
    }
}
