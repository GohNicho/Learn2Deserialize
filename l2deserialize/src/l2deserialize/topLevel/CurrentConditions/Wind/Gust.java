package l2deserialize.topLevel.CurrentConditions.Wind;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Gust {

    @Attribute
    private String unitType;

    @Attribute
    private String units;

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
