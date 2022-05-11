package singleton;

import org.example.prototype.CloneableSheep;
import org.example.prototype.SerializableSheep;
import org.junit.Test;

public class TestPrototype {
    @Test
    public void test() throws Exception {
        CloneableSheep cs1 = new CloneableSheep("多利", 3, new CloneableSheep("彭彭", 2, null));
        CloneableSheep cs2 = (CloneableSheep) cs1.clone();
        System.out.println("cs1 hashcode:" + cs1.hashCode() + ",cs1 friend hashcode:" + cs1.getFriend().hashCode());
        System.out.println("cs2 hashcode:" + cs2.hashCode() + ",cs2 friend hashcode:" + cs2.getFriend().hashCode());

        SerializableSheep ss1 = new SerializableSheep("山姆", 3, new SerializableSheep("乐乐", 2, null));
        SerializableSheep ss2 = (SerializableSheep) ss1.clone();
        System.out.println("ss1 hashcode:" + ss1.hashCode() + ",ss1 friend hashcode:" + ss1.getFriend().hashCode());
        System.out.println("ss2 hashcode:" + ss2.hashCode() + ",ss2 friend hashcode:" + ss2.getFriend().hashCode());
    }
}
