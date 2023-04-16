package frameworkUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class YamlData {

    private Map<String, Object> data;

    public YamlData(String filePath) {
        try {
            InputStream input = new FileInputStream(filePath);
            Yaml yaml = new Yaml();
            data = yaml.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Object> getData() {
        return data;
    }
}

