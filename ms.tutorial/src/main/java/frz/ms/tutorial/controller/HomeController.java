package frz.ms.tutorial.controller;

import frz.ms.tutorial.cloudclient.feign.DummyJsonClient;

import frz.ms.tutorial.resource.dummyjson.DummyJsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    private DummyJsonClient template;

    @GetMapping()
    ResponseEntity<?> getResponse() {
        return ResponseEntity.ok(template.getDummyClient());

    }

    List<String> stringList() {
        return null;
    }

}
