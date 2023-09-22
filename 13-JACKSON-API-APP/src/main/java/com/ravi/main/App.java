package com.ravi.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ravi.binding.User;

public class App {

	public static void main(String[] args) throws Exception {

		App app = new App();
		app.convertObjToJson();
		app.convertJsonTOObj();
	}

	public void convertObjToJson() throws Exception {

		User u1 = new User(101, "Ravi", "male", 12345l);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("user.json"), u1);
		System.out.println("Object is converted intoi Json...");
	}

	public void convertJsonTOObj() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(new File("user.json"), User.class);
		System.out.println(user);
	}

}
