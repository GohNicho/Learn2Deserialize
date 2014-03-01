package l2deserialize.topLevel.CurrentConditions.Wind;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Wind {

    @Element
    Speed speed;

    @Element
    Gust gust;

    @Text
    private String direction;

    @Element
    Bearing bearing;

    public Speed getSpeed() {
        return speed;
    }

    public Gust getGust() {
        return gust;
    }

    public String getDirection() {
        return direction;
    }

    public Bearing getBearing() {
        return bearing;
    }
}
