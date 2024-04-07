package org.ldsr.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ldsr.bean.Prediction;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class JsonFileService {

    private final ObjectMapper objectMapper;
    private final ResourcePatternResolver resourcePatternResolver;

    public JsonFileService(ObjectMapper objectMapper, ResourcePatternResolver resourcePatternResolver) {
        this.objectMapper = objectMapper;
        this.resourcePatternResolver = resourcePatternResolver;
    }

    public List<Prediction> parseJsonFiles(String directoryPath) throws IOException {
        Resource[] resources = resourcePatternResolver.getResources("classpath:" + directoryPath + "*.json");
        List<Prediction> predictions = new ArrayList<>();

        for (Resource resource : resources) {
            Prediction[] predictionsArray = objectMapper.readValue(resource.getInputStream(), Prediction[].class);
            predictions.addAll(List.of(predictionsArray));
        }

        return predictions;
    }
}
