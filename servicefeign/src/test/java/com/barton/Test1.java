package com.barton;

import com.barton.feign.SchedualServiceHi;

import com.netflix.discovery.shared.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT, classes = {ServicefeignApplication.class})
public class Test1 {
    @Autowired
    private SchedualServiceHi serviceHi;

    @Test
    public void test(){
        //System.out.println(serviceHi.sayHiFromClientOne("111"));
        System.out.println("***********");
    }
}
