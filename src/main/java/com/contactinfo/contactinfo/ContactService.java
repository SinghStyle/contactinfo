package com.contactinfo.contactinfo;

import java.util.List;

import org.springframework.stereotype.Service;

public interface ContactService {
	
	public List<Contacts> getContacts(Long id);

}
