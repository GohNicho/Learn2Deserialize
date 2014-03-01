package l2deserialize.topLevel.CurrentConditions;

import l2deserialize.topLevel.DateTime;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

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


}
