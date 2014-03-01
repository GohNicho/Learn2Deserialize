package l2deserialize.topLevel.DateTime;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Day {

    @Attribute(name="dayOfWeek")
    private String dayOfWeek;

    @Text
    private int numDayOfWeek;

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getNumDayOfWeek() {
        return numDayOfWeek;
    }

    public void setNumDayOfWeek(int numDayOfWeek) {
        this.numDayOfWeek = numDayOfWeek;
    }
}
