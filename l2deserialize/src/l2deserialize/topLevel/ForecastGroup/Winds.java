package l2deserialize.topLevel.ForecastGroup;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Winds {

    @Element
    private String textSummary;

    @Element
    Wind wind;

    public String getTextSummary() {
        return textSummary;
    }

    public void setTextSummary(String textSummary) {
        this.textSummary = textSummary;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
