package com.ravi.repository;

import com.ravi.entity.UserAccount;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserAccount, Integer> {

	// ====== Custom Query to UpdateUserAccount Status ========
	@Modifying
	@Transactional
	@Query("update UserAccount set activeSwitch=:status where id=:userId")
	public void updateUserAccountStatus(Integer userId, String status);
}
