package B_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_Utility implements IConstant_Path {

    private static String currentLanguage ; // default

    public static void setLanguage(String language) {
        currentLanguage = language.toUpperCase();
    }

    public String readingDataFromPropertyFile(String key) throws IOException {

        String filePath;

        switch (currentLanguage) {
            case "HI":
                filePath = PROPERTY_FILE_HINDI;
                break;

            case "EN":
            default:
                filePath = PROPERTY_FILE_ENGLISH;
                break;
        }

        FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);

        return prop.getProperty(key);
    }
}
