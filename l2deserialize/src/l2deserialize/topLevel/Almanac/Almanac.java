package l2deserialize.topLevel.Almanac;

import l2deserialize.topLevel.ForecastGroup.Pop;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Almanac {

    @ElementList(inline = true)
    List<Temperature> temperatures;

    @ElementList(inline = true)
    List<Precipitation> precipitations;

    @Element
    Pop pop;

    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public List<Precipitation> getPrecipitations() {
        return precipitations;
    }

    public Pop getPop() {
        return pop;
    }
}