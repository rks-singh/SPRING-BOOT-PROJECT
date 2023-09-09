package com.ravi.service;

import com.ravi.entity.UserAccount;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserAccountService {

	public String saveOrUpdateUserAccount(UserAccount userAccount);

	public List<UserAccount> getAllUserAccount();

	public Optional<UserAccount> getUserAccount(Integer userId);

	public boolean deleteUserAccount(Integer userId);

	public boolean updateUserAccountStatus(Integer userId, String status);
}
