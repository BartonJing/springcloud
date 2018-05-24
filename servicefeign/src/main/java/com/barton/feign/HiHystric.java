package com.barton.feign;


import org.springframework.stereotype.Component;

@Component
public class HiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry:"+name;
    }
}
