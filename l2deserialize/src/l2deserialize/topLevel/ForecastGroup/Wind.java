package l2deserialize.topLevel.ForecastGroup;

import l2deserialize.topLevel.CurrentConditions.Wind.Bearing;
import l2deserialize.topLevel.CurrentConditions.Wind.Gust;
import l2deserialize.topLevel.CurrentConditions.Wind.Speed;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Wind {

    @Attribute
    private String index;

    @Attribute
    private String rank;

    @Element
    Speed speed;

    @Element
    Gust gust;

    @Text
    private String direction;

    @Element
    Bearing bearing;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Gust getGust() {
        return gust;
    }

    public void setGust(Gust gust) {
        this.gust = gust;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Bearing getBearing() {
        return bearing;
    }

    public void setBearing(Bearing bearing) {
        this.bearing = bearing;
    }
}
