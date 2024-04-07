package org.ldsr.controller;

import org.ldsr.bean.Prediction;

import org.ldsr.service.JsonFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

    @Autowired
    JsonFileService jsonFileService;

    @GetMapping("/show")
    public List<Prediction> show() throws IOException {
        List<Prediction> predictions = jsonFileService.parseJsonFiles("img_out/");
        return predictions;
    }

}
