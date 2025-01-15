import java.util.Arrays;
public class ConcreteStrategyA  {

    public int[] execute(int[] data) {
        int[] result = data.clone();
        Arrays.sort(result);
        return result;
    }
}
