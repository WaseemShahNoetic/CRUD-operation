package com.example.CRUDoperation;

import com.example.CRUDoperation.entity.UserEntity;
import com.example.CRUDoperation.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.gen5.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import java.util.ArrayList;
import java.util.List;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
class CrudApplicationTests {


	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ObjectMapper objectMapper;

	@BeforeEach
	void setUp(){
		userRepository.deleteAll();
	}


	//JUnit test for Delete User  By ID
	@Test
	public void givenEmployeeId_whenDeleteEmployee_thenReturn200() throws Exception {
		UserEntity userSaveEntity = UserEntity.builder()
				.name("Aqib")
				.email("aqib@noeticworld.com")
				.designation("junior java developer")
				.build();
		userRepository.save(userSaveEntity);

		ResultActions actions = mockMvc.perform(delete("/user/delete/{id}",userSaveEntity.getId())
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(userSaveEntity)));
		actions.andExpect(status().isOk())
				.andDo(print());

	}

	//	//JUnit test for Update User

	@Test
	public void givenUpdatedEmployee_whenUpdateEmployee_thenReturnUpdateEmployeeObject() throws Exception {
		// given - precondition or setup
		UserEntity savedEmployee = UserEntity.builder()
				.name("Aqib")
				.email("aqib@noeticworld.com")
				.designation("junior java developer")
				.build();
		userRepository.save(savedEmployee);

		UserEntity updatedEmployee = UserEntity.builder()
				.name("xyz")
				.email("zyx@noeticworld.com")
				.designation("zyx junior java developer")
				.build();

		// when -  action or the behaviour that we are going test
		ResultActions response = mockMvc.perform(put("/user/put/{id}", savedEmployee.getId())
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updatedEmployee)));
		response.andExpect(status().isOk())
				.andDo(print());
	}

	//	//JUnit test for Create User
	@Test
	public void givenEmployeeObject_whenCreateEmployee_thenReturnSavedEmployee() throws Exception{

		// given - precondition or setup
		UserEntity userSaveEntity = UserEntity.builder()
				.name("Ramesh")
				.email("ramesh@gmail.com")
				.designation("front end java")
				.build();

		// when - action or behaviour that we are going test
		ResultActions response = mockMvc.perform(post("/user/post")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(userSaveEntity)));
		response.andDo(print());


	}

//	JUnit test for Get All Users
	@Test
	public void givenListOfEmployees_whenGetAllEmployees_thenReturnEmployeesList() throws Exception{
		List<UserEntity> userEntityList = new ArrayList<>();

		UserEntity user1 = new UserEntity();

		user1.setName("Waseem");
		user1.setEmail("waseem@noeticworld.com");
		user1.setDesignation("java dev");

		UserEntity user2 = new UserEntity();
		user2.setName("xyz");
		user2.setEmail("xyz@noeticworld.com");
		user2.setDesignation("xyz java dev");

		userEntityList.add(user1);
		userEntityList.add(user2);

		userRepository.saveAll(userEntityList);

		mockMvc.perform(get("/user/get")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andDo(print());

	}



}
