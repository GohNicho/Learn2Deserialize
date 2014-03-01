package l2deserialize.topLevel.CurrentConditions;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class RelativeHumidity {

    @Attribute
    private String units;

    @Text
    private double relativeHumidity;

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public double getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }
}
