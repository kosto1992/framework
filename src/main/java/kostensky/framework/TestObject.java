package kostensky.framework;

import java.util.Random;

/**
 * Created by lkost on 23.09.2017.
 */
public class TestObject {
    String string;

    public TestObject(String string) {
        this.string = string;
    }

//    public boolean isItTrue(){
//        Random random = new Random();
//        if (random.nextInt(2)<1){
//            return false;
//        }
//        else {
//            return true;
//        }
//    }
//
//    public TestObject getThis(boolean isItTrue){
//        if (isItTrue){
//            System.out.println("It is True!");
//        }
//        else {
//            System.out.println("It is False :(");
//        }
//        return this;
//    }

    public String testString(){
        System.out.println(string);
        return string;
    }
}
