package l2deserialize.topLevel.ForecastGroup;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Period {

    @Attribute
    private String textForecastName;

    @Text
    private String currPeriod;

    public String getTextForecastName() {
        return textForecastName;
    }

    public void setTextForecastName(String textForecastName) {
        this.textForecastName = textForecastName;
    }

    public String getCurrPeriod() {
        return currPeriod;
    }

    public void setCurrPeriod(String currPeriod) {
        this.currPeriod = currPeriod;
    }
}
