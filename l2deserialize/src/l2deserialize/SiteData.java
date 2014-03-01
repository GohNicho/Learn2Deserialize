package l2deserialize;

import l2deserialize.topLevel.*;
import l2deserialize.topLevel.CurrentConditions.CurrentConditions;
import l2deserialize.topLevel.ForecastGroup.ForecastGroup;
import l2deserialize.topLevel.Location.Location;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class SiteData {

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

}
