package kostensky.framework;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Created by lkost on 22.09.2017.
 */
public class FunctionsCollection {
    ArrayList<String> functionsList =  new ArrayList<String>();
    Object o;

    private final static Logger LOGGER = Logger.getLogger(FunctionsCollection.class.getName());

    public FunctionsCollection(Object o) {
        this.o = o;
    }

    public void addFunction(String func) {
        functionsList.add(func);
    }

    public Object runNext(String functionName, Object o) throws Exception {
        Method func = o.getClass().getMethod(functionName);
        return func.invoke(o);
    }

    public Object runAll() throws Exception {
        for (String func : functionsList){
            o = runNext(func, o);
            LOGGER.setLevel(Level.INFO);
            LOGGER.info("Function " + func + " was called and returned " + o);
        }
        return o;
    }
}
