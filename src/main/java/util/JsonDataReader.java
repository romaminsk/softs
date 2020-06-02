package util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class JsonDataReader {

    public static Map<String, String> getTestData() {
        CustomLogger.info("Getting test data");
        Map<String, String> search = null;
        try {
            search = new ObjectMapper().readValue(new File(PropertiesReader.getProperty("testData.path")),
                    new TypeReference<Map<String, String>>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
            CustomLogger.error("Can't read testData.json file");
        }
        return search;
    }

}
