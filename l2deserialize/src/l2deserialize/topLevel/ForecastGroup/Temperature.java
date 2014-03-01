package l2deserialize.topLevel.ForecastGroup;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Temperature {

    @Attribute
    private String unitType;

    @Attribute
    private String units;

    @Attribute(name="class")
    private String tempClass;

    @Text
    private double temp;

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

    public String getTempClass() {
        return tempClass;
    }

    public void setTempClass(String tempClass) {
        this.tempClass = tempClass;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
