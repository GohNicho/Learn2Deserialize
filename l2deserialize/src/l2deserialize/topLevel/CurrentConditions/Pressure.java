package l2deserialize.topLevel.CurrentConditions;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Pressure {

    @Attribute
    private String unitType;

    @Attribute
    private String units;

    @Attribute
    private double change;

    @Attribute
    private String tendency;

    @Text
    private double pressure;

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

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public String getTendency() {
        return tendency;
    }

    public void setTendency(String tendency) {
        this.tendency = tendency;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
