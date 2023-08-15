package com.ravi.userMasterRepository;
import com.ravi.entities.UserMasterEntity;
import org.springframework.data.repository.CrudRepository;
public interface UserMasterRepository extends CrudRepository<UserMasterEntity,Integer> {
}
