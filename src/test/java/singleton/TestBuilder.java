package singleton;

import org.example.builder.Building;
import org.example.builder.CountingBuilder;
import org.example.builder.Designer;
import org.example.builder.ResidenceBuilder;
import org.junit.Test;

public class TestBuilder {
    @Test
    public void test() {
        ResidenceBuilder rb = new ResidenceBuilder();
        Designer designer1 = new Designer(rb);
        Building building = designer1.build();
        building.show();
        Building highBuilding = designer1.buildHigh();
        highBuilding.show();

        CountingBuilder cb = new CountingBuilder();
        Designer designer2 = new Designer(cb);
        Building count = designer2.build();
        count.show();
        Building highCount = designer2.buildHigh();
        highCount.show();
    }
}
