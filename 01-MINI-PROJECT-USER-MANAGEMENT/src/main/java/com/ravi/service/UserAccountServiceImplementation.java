package com.ravi.service;

import com.ravi.entity.UserAccount;
import com.ravi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserAccountServiceImplementation implements UserAccountService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String saveOrUpdateUserAccount(UserAccount userAccount) {

		Integer status = userAccount.getId();
		userRepository.save(userAccount);
		if (status == null) {
			return "User Account Created Successfully. !!";
		} else {
			return "User Account not Created. !!";
		}
	}

	@Override
	public List<UserAccount> getAllUserAccount() {
		return userRepository.findAll();
	}

	@Override
	public Optional<UserAccount> getUserAccount(Integer userId) {
		return userRepository.findById(userId);
	}

	@Override
	public boolean deleteUserAccount(Integer userId) {
		try {
			userRepository.deleteById(userId);
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateUserAccountStatus(Integer userId, String status) {
		try {
			userRepository.updateUserAccountStatus(userId, status);
			return true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return false;
	}
}
