package com.example.API.controllers;

import com.example.API.models.Req;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class ReqController {
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/sendJsonData")
//    public ResponseEntity<Req> sendJsonData(@RequestBody Req req) {
//        // Set the request headers
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//
//        // Set the request body
//        Req requestBody = new Req();
//
//        // Create a HttpEntity object with headers and body
//        HttpEntity<Req> entity = new HttpEntity<Req>(requestBody, headers);
//
//        // Send the POST request with HttpEntity and parse the response to a string
//        Req response = restTemplate.postForObject("http://192.168.20.2:8181/rcms/services/rest/hikRpcService/genAgvSchedulingTask/", entity, Req.class);
//
//        // Return the response
//        return ResponseEntity.ok(response);
//    }
    public ResponseEntity<String> postJsonToOtherApi(@RequestBody Req request) throws JsonProcessingException, IOException {
        RestTemplate restTemplate = new RestTemplate();

        // convert the request object to JSON using Jackson
        ObjectMapper mapper = new ObjectMapper();
        String payloadJson = mapper.writeValueAsString(request);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String url = "http://192.168.20.2:8181/rcms/services/rest/hikRpcService/genAgvSchedulingTask/";
        HttpEntity<String> httpEntity = new HttpEntity<>(payloadJson, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, httpEntity, String.class);



        return responseEntity;
    }
}
