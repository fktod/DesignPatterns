package singleton;

import org.apache.commons.lang3.SerializationUtils;
import org.example.singleton.Singleton7;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestSingleton {

    @Test
    public void testReflect() throws Exception {
        Singleton7 instance = Singleton7.getInstance();
        Constructor<Singleton7> constructor = Singleton7.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton7 newInstance = constructor.newInstance();
        System.out.println(instance == newInstance);
    }

    @Test
    public void testSerialize(){
        Singleton7 instance = Singleton7.getInstance();
        byte[] serialize = SerializationUtils.serialize(instance);
        Singleton7 newInstance = SerializationUtils.deserialize(serialize);
        System.out.println(instance == newInstance);
    }
}
