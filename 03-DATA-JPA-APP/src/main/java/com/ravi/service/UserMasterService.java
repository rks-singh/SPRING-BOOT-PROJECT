package com.ravi.service;

import com.ravi.entities.UserMasterEntity;
import com.ravi.repositiory.UserMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMasterService {
    @Autowired
    private UserMasterRepository userMasterRepository;

    public void getAllStudentHQL() {
        List<UserMasterEntity> aLlStudentHQL = userMasterRepository.getALlStudentHQL();
        aLlStudentHQL.forEach(System.out::println);
    }
    public void getAllStudentSQL() {
        List<UserMasterEntity> allStudentSQL = userMasterRepository.getAllStudentSQL();
        allStudentSQL.forEach(System.out::println);
    }

    public void getByCityHQL() {
        List<UserMasterEntity> byCityHQL = userMasterRepository.getByCityHQL("Jabalpur");
        byCityHQL.forEach(System.out::println);
    }

    public void getByCitySQL() {
        List<UserMasterEntity> byCitySQL = userMasterRepository.getByCitySQL("Jabalpur");
        byCitySQL.forEach(System.out::println);
    }

    public void getALLEmailHQL() {
        List<String> allEmailHQL = userMasterRepository.getAllEmailHQL();
        allEmailHQL.forEach(System.out::println);
    }
    public void getAllEmailSQL() {
        List<String> allEmailSQL = userMasterRepository.getALLEmailSQL();
        allEmailSQL.forEach(System.out::println);
    }

    public void getAllEmailCity() {
        List<String> allEmailCity = userMasterRepository.getAllEmailCity();
        allEmailCity.forEach(System.out::println);
    }

    public void getNameAndEmailHQL() {
        List<String> nameAndEmailHQL = userMasterRepository.getNameAndEmailHQL(101);
        nameAndEmailHQL.forEach(System.out::println);
    }

    public void getNameAndEmailSQL() {
        List<String> nameAndEmailSQL = userMasterRepository.getNameAndEmailSQL(101);
        nameAndEmailSQL.forEach(System.out::println);
    }

    public void updateAge() {
        int updateAge = userMasterRepository.updateAge(23, "Ravi Singh");
        if (updateAge>=1) {
            System.out.println("User age updated.");
        } else {
            System.out.println("User age not updated.");
        }
    }

    public void deleteUser() {
        int deleteUser = userMasterRepository.deleteUser(105);
        if (deleteUser>=1) {
            System.out.println("User Deleted");
        } else {
            System.out.println("User not deleted");
        }
    }
}
