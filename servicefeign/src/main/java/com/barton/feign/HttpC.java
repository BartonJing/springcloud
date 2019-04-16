package com.barton.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="${api.name}",url = "${api.url}")
public interface HttpC {
    @RequestMapping(value = "${api.value}",method = RequestMethod.GET)
    String tess(@RequestParam(value = "tel") String tel);

}
