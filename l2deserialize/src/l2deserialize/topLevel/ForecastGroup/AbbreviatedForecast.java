package l2deserialize.topLevel.ForecastGroup;

import l2deserialize.topLevel.CurrentConditions.IconCode;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class AbbreviatedForecast {

    @Element
    IconCode iconCode;

    @Element
    Pop pop;

    @Text
    private String textSummary;

    public IconCode getIconCode() {
        return iconCode;
    }

    public void setIconCode(IconCode iconCode) {
        this.iconCode = iconCode;
    }

    public Pop getPop() {
        return pop;
    }

    public void setPop(Pop pop) {
        this.pop = pop;
    }

    public String getTextSummary() {
        return textSummary;
    }

    public void setTextSummary(String textSummary) {
        this.textSummary = textSummary;
    }
}
