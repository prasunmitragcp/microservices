package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	
	//Fake userlist
	
	List<User> list = List.of(
				new User(1311, "Prasun Mitra1", "07466422340"),	
				new User(1312, "Prasun Mitra2", "07466422341"),
				new User(1313, "Prasun Mitra3", "07466422342"),	
				new User(1314, "Prasun Mitra4", "07466422343"),	
				new User(1315, "Prasun Mitra5", "07466422344"),	
				new User(1316, "Prasun Mitra6", "07466422345"),	
				new User(1317, "Prasun Mitra7", "07466422346"),	
				new User(1318, "Prasun Mitra8", "07466422347")	
			);
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserid().equals(id)).findAny().orElse(null);
	}

}
