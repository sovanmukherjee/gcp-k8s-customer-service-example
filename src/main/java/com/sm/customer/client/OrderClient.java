package com.sm.customer.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sm.customer.model.Order;

@FeignClient(name = "${service.order_service.name}",url="${service.order_service.url}")
public interface OrderClient {
	 @GetMapping(value = "/v1/order/customer/{customerId}")
	 List<Order> getOrdersByCustomer(@PathVariable("customerId") String customerId);
}
