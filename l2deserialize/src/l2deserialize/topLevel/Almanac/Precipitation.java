package l2deserialize.topLevel.Almanac;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Precipitation {

    @Attribute(name="precipClass")
    private String precipClass;

    @Attribute
    private String period;

    @Attribute
    private String unitType;

    @Attribute
    private String units;

    @Attribute
    private int year;

    @Text
    private double precip;

    public String getPrecipClass() {
        return precipClass;
    }

    public void setPrecipClass(String precipClass) {
        this.precipClass = precipClass;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecip() {
        return precip;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }
}
