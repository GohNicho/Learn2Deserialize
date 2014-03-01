package l2deserialize.topLevel.DateTime;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Month {

    @Attribute(name="month")
    private String month;

    @Text
    private int numMonth;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getNumMonth() {
        return numMonth;
    }

    public void setNumMonth(int numMonth) {
        this.numMonth = numMonth;
    }
}
