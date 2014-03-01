package l2deserialize.topLevel.CurrentConditions;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/**
 * Created by Nicholas Goh on 01/03/14.
 */

@Root
public class IconCode {

    @Attribute (name="format")
    private String imgFormat;

    @Text
    private int code;

    public String getImgFormat() {
        return imgFormat;
    }

    public void setImgFormat(String imgFormat) {
        this.imgFormat = imgFormat;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
