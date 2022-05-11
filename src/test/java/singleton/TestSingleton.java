package singleton;

import org.example.singleton.Singleton7;
import org.junit.Test;

import java.io.*;
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
    public void testSerialize() {
        Singleton7 instance = Singleton7.getInstance();
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(instance);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Singleton7 newInstance = (Singleton7) ois.readObject();
            System.out.println(instance == newInstance);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert bos != null;
                bos.close();
                assert oos != null;
                oos.close();
                assert bis != null;
                bis.close();
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
