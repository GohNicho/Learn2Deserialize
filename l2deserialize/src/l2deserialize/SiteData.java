package l2deserialize;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class SiteData {

    @ElementList(inline = true)
    public list<dateTime> dateTimes {

    }

    @Element
    public class Location {

    }

    @Element
    public class CurrentConditions {

    }

    @Element
    public class ForecastGroup {

    }

    @Element
    public class YesterdayConditions {

    }

    @Element
    public class RiseSet {

    }

    @Element
    public class Almanac {
        
    }



}
