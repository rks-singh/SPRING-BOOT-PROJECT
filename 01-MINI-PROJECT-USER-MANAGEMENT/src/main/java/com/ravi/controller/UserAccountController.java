package com.ravi.controller;

import com.ravi.entity.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserAccountController {

	// ========== Loading index.html =============
	public void loadIndexForm(Model model) {

	}

	// ========== Handling Submit button ==========
	public void handleSubmitButton(UserAccount userAccount, Model model) {

	}

	// ========== Handling view user functionality ==========
	public void viewUsersAccount(Model model) {

	}

	// ========== Handling edit functionality ============
	public void editUserAccount(Integer userId, Model model) {

	}

	// ========== Handling delete functionality ===========
	public void deleteUserAccount(Integer userId, Model model) {

	}

	// ========== Handling user account status =========
	public void changeUserAccountStatus(String status, Integer userId) {

	}
}
