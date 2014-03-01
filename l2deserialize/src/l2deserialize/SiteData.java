package l2deserialize;

import l2deserialize.topLevel.Almanac.Almanac;
import l2deserialize.topLevel.CurrentConditions.CurrentConditions;
import l2deserialize.topLevel.DateTime.DateTime;
import l2deserialize.topLevel.ForecastGroup.ForecastGroup;
import l2deserialize.topLevel.Location.Location;
import l2deserialize.topLevel.RiseSet.RiseSet;
import l2deserialize.topLevel.YesterdayConditions.YesterdayConditions;
import org.simpleframework.xml.*;

import java.util.List;

@Root(strict = false)
@NamespaceList({
@Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi"),
@Namespace(reference = "xsi:http://dd.weather.gc.ca/citypage_weather/schema/site.xsd", prefix = "noNamespaceSchemaLocation")
})
public class SiteData {

    @Element
    License license;

    @ElementList(inline = true)
    public List<DateTime> dateTimes;

    @Element
    Location location;

    @Element
    CurrentConditions currentConditions;

    @Element
    YesterdayConditions yesterdayConditions;

    @Element
    ForecastGroup forecastGroup;

    @Element
    RiseSet riseSet;

    @Element
    Almanac almanac;

    public License getLicense() {
        return license;
    }

    public List<DateTime> getDateTimes() {
        return dateTimes;
    }

    public Location getLocation() {
        return location;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public YesterdayConditions getYesterdayConditions() {
        return yesterdayConditions;
    }

    public ForecastGroup getForecastGroup() {
        return forecastGroup;
    }

    public RiseSet getRiseSet() {
        return riseSet;
    }

    public Almanac getAlmanac() {
        return almanac;
    }
}
