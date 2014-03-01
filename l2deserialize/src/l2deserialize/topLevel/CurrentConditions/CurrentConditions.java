package l2deserialize.topLevel.CurrentConditions;

import l2deserialize.topLevel.CurrentConditions.Wind.Wind;
import l2deserialize.topLevel.DateTime.DateTime;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import java.beans.Visibility;
import java.util.List;

/**
 * Insert JavaDoc here
 */

@Root
public class CurrentConditions {

    @Element
    Station station;

    @ElementList(inline = true)
    List<DateTime> dateTimes;

    @Text
    private String condition;

    @Element
    IconCode iconCode;

    @Element
    Temperature temperature;

    @Element
    Dewpoint dewpoint;

    @Element
    WindChill windChill;

    @Element
    Pressure pressure;

    @Element
    Visibility visibility;

    @Element
    RelativeHumidity relativeHumidity;

    @Element
    Wind wind;

    public Station getStation() {
        return station;
    }

    public List<DateTime> getDateTimes() {
        return dateTimes;
    }

    public String getCondition() {
        return condition;
    }

    public IconCode getIconCode() {
        return iconCode;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Dewpoint getDewpoint() {
        return dewpoint;
    }

    public WindChill getWindChill() {
        return windChill;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public RelativeHumidity getRelativeHumidity() {
        return relativeHumidity;
    }

    public Wind getWind() {
        return wind;
    }
}
