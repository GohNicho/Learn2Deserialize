package l2deserialize.topLevel.DateTime;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Insert JavaDoc here
 */

@Root
public class DateTime {

    @Attribute(name="dateTimeName")
    private String dateTimeName;

    @Attribute
    private String zone;

    @Attribute
    private int utcOffset;

    @Text
    private String year;

    @Element
    Month month;

    @Element
    Day day;

    @Text
    private int hour;

    @Text
    private int minute;

    @Text
    private String timeStamp;

    @Text
    private String textsummary;

    public String getDateTimeName() {
        return dateTimeName;
    }

    public String getZone() {
        return zone;
    }

    public int getUtcOffset() {
        return utcOffset;
    }

    public String getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    public Day getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getTextsummary() {
        return textsummary;
    }
}
