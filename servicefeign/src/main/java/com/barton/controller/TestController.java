package com.barton.controller;

import com.barton.feign.HttpC;
import com.barton.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class TestController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @Autowired
    HttpC httpC;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        String aa= httpC.tess("18298498823");
        System.out.println(aa);
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
