package com.PbAbrilDes3.mspayment.repository;

import com.PbAbrilDes3.mspayment.dto.CustomerPointsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "customer", url = "${feign.url.customer}")
public interface CustomerClient {
    @GetMapping("/v1/customers/{customerId}")
    CustomerPointsDto getCustomerById(@PathVariable("customerId") Long customerId);

}
