package l2deserialize.topLevel.ForecastGroup;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Precipitation {

    @Element
    private String textSummary;
    
    @Element
    PrecipType precipType;

    public PrecipType getPrecipType() {
        return precipType;
    }

    public void setPrecipType(PrecipType precipType) {
        this.precipType = precipType;
    }
}
