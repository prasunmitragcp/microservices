package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	
	//Fake list of contacts
	
	List<Contact> list = List.of(
				new Contact(1L, "prasun.mitra1@natwestmarkets.com", "Prasun Mitra1", 1311),
				new Contact(2L, "prasun.mitra2@natwestmarkets.com", "Prasun Mitra2", 1312),
				new Contact(3L, "prasun.mitra3@natwestmarkets.com", "Prasun Mitra3", 1313),
				new Contact(4L, "prasun.mitra4@natwestmarkets.com", "Prasun Mitra4", 1314),
				new Contact(5L, "prasun.mitra5@natwestmarkets.com", "Prasun Mitra5", 1315),
				new Contact(6L, "prasun.mitra6@natwestmarkets.com", "Prasun Mitra6", 1316),
				new Contact(7L, "prasun.mitra7@natwestmarkets.com", "Prasun Mitra7", 1317),
				new Contact(8L, "prasun.mitra8@natwestmarkets.com", "Prasun Mitra8", 1318)
			);
	

	@Override
	public List<Contact> getContactOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
