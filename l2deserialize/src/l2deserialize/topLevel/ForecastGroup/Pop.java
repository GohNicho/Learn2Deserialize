package l2deserialize.topLevel.ForecastGroup;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Pop {

    @Attribute
    private String units;

    @Text
    private String pop;

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }
}
