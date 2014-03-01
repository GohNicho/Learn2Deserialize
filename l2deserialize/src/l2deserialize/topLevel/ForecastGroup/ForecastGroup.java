package l2deserialize.topLevel.ForecastGroup;

import l2deserialize.topLevel.DateTime.DateTime;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class ForecastGroup {

    @ElementList(inline = true)
    List<DateTime> dateTimes;

    @Element
    RegionNormals regionNormals;

    @ElementList(inline = true)
    List<Temperature> temperatures;

    @ElementList(inline = true)
    List<Forecast> forecasts;

    public List<DateTime> getDateTimes() {
        return dateTimes;
    }

    public RegionNormals getRegionNormals() {
        return regionNormals;
    }

    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }
}