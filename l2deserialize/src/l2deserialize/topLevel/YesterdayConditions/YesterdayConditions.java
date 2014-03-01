package l2deserialize.topLevel.YesterdayConditions;

import l2deserialize.topLevel.ForecastGroup.Temperature;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class YesterdayConditions {

    @ElementList(inline = true)
    List<Temperature> temperatures;

    @Element
    Precip precip;

    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public Precip getPrecip() {
        return precip;
    }
}