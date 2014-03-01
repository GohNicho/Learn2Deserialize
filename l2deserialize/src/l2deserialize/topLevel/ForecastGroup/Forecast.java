package l2deserialize.topLevel.ForecastGroup;

import l2deserialize.topLevel.CurrentConditions.RelativeHumidity;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Forecast {

    @Element
    Period period;

    @Element
    private String textSummary;

    // TODO: Check with Spencer when he's awake
    @Element
    CloudPrecip cloudPrecip;

    @Element
    AbbreviatedForecast abbreviatedForecast;

    @Element
    Temperatures temperatures;

    // TODO: There's a weird <winds/> here, ask Spencer

    @Element
    Precipitation precipitation;

    @Element
    RelativeHumidity relativeHumidity;

    public Period getPeriod() {
        return period;
    }

    public String getTextSummary() {
        return textSummary;
    }

    public CloudPrecip getCloudPrecip() {
        return cloudPrecip;
    }

    public AbbreviatedForecast getAbbreviatedForecast() {
        return abbreviatedForecast;
    }

    public Temperatures getTemperatures() {
        return temperatures;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public RelativeHumidity getRelativeHumidity() {
        return relativeHumidity;
    }
}
