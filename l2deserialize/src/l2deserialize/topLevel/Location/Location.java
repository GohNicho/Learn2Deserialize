package l2deserialize.topLevel.Location;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class Location {

    @Text
    private String continent;

    @Element
    Country country;

    @Element
    Province province;

    @Element
    Name name;

    @Text
    private String region;

    public String getContinent() {
        return continent;
    }

    public Country getCountry() {
        return country;
    }

    public Province getProvince() {
        return province;
    }

    public Name getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }
}
