package kostensky.framework;

import java.lang.reflect.Method;

/**
 * Created by lkost on 23.09.2017.
 */
public class Function {
    private Object o;
    private Method function;

    public Function(Object o, Method function) {
        this.o = o;
        this.function = function;
    }

    public Object getObject() {
        return o;
    }

    public void setObject(Object o) {
        this.o = o;
    }

    public Method getFunction() {
        return function;
    }

    public void setFunction(Method function) {
        this.function = function;
    }
}
