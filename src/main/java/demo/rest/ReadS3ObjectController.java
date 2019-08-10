package demo.rest;

import demo.implementation.ReadS3ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ReadS3ObjectController {

    @Autowired
    private ReadS3ObjectService readS3ObjectService;

    @RequestMapping(value = "/s3read", produces="application/json", method= RequestMethod.GET)
    public List<String> readS3Object(){
       return readS3ObjectService.readS3Object();
    }
}
