package com.contactinfo.contactinfo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ContactServiceImp implements ContactService {

	List<Contacts> contacts=Arrays.asList(new Contacts(11L,"aman@gamil.com", 1L),new Contacts(13L,"satinder@gmail.com", 1L),new Contacts(12L,"binder@gmail.com", 2L));

	@Override
	public List<Contacts> getContacts(Long id) {
		// TODO Auto-generated method stub.
		return contacts.stream().filter(contact->contact.getUserId().equals(id)).collect(Collectors.toList());
	}
	
	
}              