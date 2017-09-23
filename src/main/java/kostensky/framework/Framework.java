package kostensky.framework;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by lkost on 22.09.2017.
 */
public class Framework {
    public static void main(String[] args) {
        TestObject o = new TestObject("kajakar");
        FunctionsCollection functions = new FunctionsCollection(o);

        functions.addFunction("testString");
        functions.addFunction("length");
        functions.addFunction("floatValue");
        try {
            System.out.println(functions.runAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
