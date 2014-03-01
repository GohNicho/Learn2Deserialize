package l2deserialize.topLevel.ForecastGroup;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import java.util.List;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class RegionNormals {

    @Element
    private String textSummary;

    @ElementList(inline = true)
    List<Temperature> temperatures;

    public String getTextSummary() {
        return textSummary;
    }

    public List<Temperature> getTemperatures() {
        return temperatures;
    }
}
