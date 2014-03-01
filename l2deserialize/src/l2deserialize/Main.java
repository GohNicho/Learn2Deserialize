package l2deserialize;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Serializer serializer = new Persister();
        File source = new File("s0000458_e.xml");

        try {
            SiteData siteData = serializer.read(SiteData.class, source);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
