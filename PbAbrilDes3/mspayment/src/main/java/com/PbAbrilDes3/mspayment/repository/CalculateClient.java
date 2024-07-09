package com.PbAbrilDes3.mspayment.repository;

import com.PbAbrilDes3.mspayment.dto.CalculateRequest;
import com.PbAbrilDes3.mspayment.dto.CalculateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "stores", url = "${feign.url.calculate}")
public interface CalculateClient {

    @RequestMapping(method = RequestMethod.POST, value = "/v1/calculate", consumes = "application/json")
    CalculateResponse calculate(CalculateRequest calculateRequest);
}
