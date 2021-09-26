package com.pankaj.address.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
	@GetMapping("/byuserid/{id}")
	public Address getAddress(@PathVariable Integer id) {
		return new Address();
	}
}
