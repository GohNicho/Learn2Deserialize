package l2deserialize.topLevel.CurrentConditions;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Dewpoint {

    @Attribute
    private String unitType;

    @Attribute
    private String units;

    @Text
    private double temp;

    public String getUnitType() {
        return unitType;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
