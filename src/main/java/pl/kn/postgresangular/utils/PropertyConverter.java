package pl.kn.postgresangular.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import java.io.IOException;
import java.util.Map;

public class PropertyConverter implements AttributeConverter<Map<String, Object>, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<String, Object> propertiesMap) {
        String jsonProperties = null;
        try {
            jsonProperties = objectMapper.writeValueAsString(propertiesMap);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonProperties;
    }

    @Override
    public Map<String, Object> convertToEntityAttribute(String jsonProperties) {
        Map<String, Object> propertiesMap = null;
        try {
            propertiesMap = objectMapper.readValue(jsonProperties, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertiesMap;
    }
}

