package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_Utility implements IConstant_Path {



    public String readingDataFromPropertyFile(String key) throws IOException {
        FileInputStream fis = new FileInputStream(PROPERTIESFILE);
        Properties ppt = new Properties();
        ppt.load(fis);
        return ppt.getProperty(key);

    }
}
