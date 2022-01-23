package com.contactinfo.contactinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping(value = "/contact/{id}")
	public List<Contacts> getUserInfo(@PathVariable(name = "id") Long id) {
		return contactService.getContacts(id);
	}


}
