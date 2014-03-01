package l2deserialize.topLevel.RiseSet;

import l2deserialize.topLevel.DateTime.DateTime;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import java.util.List;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class RiseSet {

    @Text
    private String disclaimer;

    @ElementList(inline = true)
    List<DateTime> dateTimes;

    public String getDisclaimer() {
        return disclaimer;
    }

    public List<DateTime> getDateTimes() {
        return dateTimes;
    }
}