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
        Designer designer = new Designer();
        Building building = designer.designBuilding(rb);
        building.show();
        Building highBuilding = designer.designHighBuilding(rb);
        highBuilding.show();

        CountingBuilder cb = new CountingBuilder();
        Building count = designer.designBuilding(cb);
        count.show();
        Building highCount = designer.designHighBuilding(cb);
        highCount.show();
    }
}
