package kostensky.framework;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Created by lkost on 22.09.2017.
 *
 * FunctionsCollection saves methods which will be called in order they were added and first object on which the first
 * method will be called.
 */
public class FunctionsCollection {
    ArrayList<String> functionsList =  new ArrayList<String>();
    Object o;
    Object firstObject;

    private final static Logger LOGGER = Logger.getLogger(FunctionsCollection.class.getName());

    /*
     * First method will be called on the object given in constructor.
     */
    public FunctionsCollection(Object o) {
        this.o = o;
        this.firstObject = o;
    }

    /*
     * add new method to collection.
     */
    public void addFunction(String func) {
        functionsList.add(func);
    }

    /*
     * Runs specified method on specified object.
     */
    public Object runNext(String functionName, Object o) throws Exception {
        Method func = o.getClass().getMethod(functionName);
        return func.invoke(o);
    }

    /*
     * Method will start operations in order they were added into collection.
     */
    public Object runAll() throws Exception {
        for (String func : functionsList){
            o = runNext(func, o);
            LOGGER.setLevel(Level.INFO);
            LOGGER.info("Function " + func + " was called and returned " + o);
        }
        return o;
    }

    /*
     * Deletes function from collection.
     */
    public boolean deleteFunction(String func){
        return functionsList.remove(func);
    }

    /*
     * Reinitialize collection, so it can be called again.
     */
    public void reinitialize(){
        o = firstObject;
    }
}
