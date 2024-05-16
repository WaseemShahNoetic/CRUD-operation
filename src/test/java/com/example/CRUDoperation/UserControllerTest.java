//package com.example.CRUDoperation;
//
//
//import com.example.CRUDoperation.entity.UserEntity;
//import com.example.CRUDoperation.repository.UserRepository;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.junit.gen5.api.BeforeEach;
//import org.junit.gen5.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.ResultMatcher;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static net.bytebuddy.matcher.ElementMatchers.is;
////import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
////import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.put;
////import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
////import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@SpringBootTest()
//@AutoConfigureMockMvc
//public class UserControllerTest {
//
////    @org.junit.jupiter.api.Test
////    void contextLoads() {
////    }
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @BeforeEach
//    void setUp(){
//        userRepository.deleteAll();
//    }
//
//
//    //JUnit test for Get All Users
//    @Test
//
//    public void givenListOfEmployees_whenGetAllEmployees_thenReturnEmployeesList() throws Exception{
//        List<UserEntity> userEntityList = new ArrayList<>();
//        userEntityList.add(UserEntity.builder().name("Waseem").email("waseem@noeticword.com").designation("Java Dev"));
//        userEntityList.add(UserEntity.builder().name("abc").email("abc@noeticword.com").designation("Java Dev"));
//        userRepository.saveAll(userEntityList);
//
//
//        ResultActions actions =mockMvc.perform(get("/user/get"));
//
//        actions.andExpect(status().isOk())
//                .andDo(print())
//                .andExpect((ResultMatcher) jsonPath("$.size()", is(userEntityList.size())));
//    }
//
//
//
//    //JUnit test for Delete User  By ID
//
//    @Test
//    public void givenEmployeeId_whenDeleteEmployee_thenReturn200() throws Exception {
//        UserEntity userSaveEntity = UserEntity.builder()
//                .name("Aqib")
//                .email("aqib@noeticworld.com")
//                .designation("junior java developer")
//                .build();
//        userRepository.save(userSaveEntity);
//
//        ResultActions actions = mockMvc.perform(delete("/user/delete/{id}",userSaveEntity.getId())
//                        .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(userSaveEntity)));
//        actions.andExpect(status().isOk())
//                .andDo(print());
//
//    }
//
//
//    //JUnit test for Update User
//
//    @Test
//    public void givenUpdatedEmployee_whenUpdateEmployee_thenReturnUpdateEmployeeObject() throws Exception {
//        // given - precondition or setup
//        UserEntity savedEmployee = UserEntity.builder()
//                .name("Aqib")
//                .email("aqib@noeticworld.com")
//                .designation("junior java developer")
//                .build();
//        userRepository.save(savedEmployee);
//
//        UserEntity updatedEmployee = UserEntity.builder()
//                .name("xyz")
//                .email("zyx@noeticworld.com")
//                .designation("zyx junior java developer")
//               .build();
//
//        // when -  action or the behaviour that we are going test
//        ResultActions response = mockMvc.perform(put("/user//put/{id}", updatedEmployee.getId())
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(updatedEmployee)));
//
//        response.andExpect(status().isOk())
//                .andDo(print())
//                .andExpect((ResultMatcher) jsonPath("$.name", is(updatedEmployee.getName())))
//                .andExpect((ResultMatcher) jsonPath("$.email", is(updatedEmployee.getEmail())))
//                .andExpect((ResultMatcher) jsonPath("$.designation", is(updatedEmployee.getDesignation())));
//    }
//
//    //JUnit test for Create User
//    @Test
//    public void givenEmployeeObject_whenCreateEmployee_thenReturnSavedEmployee() throws Exception{
//
//        // given - precondition or setup
//        UserEntity userSaveEntity = UserEntity.builder()
//                .name("Ramesh")
//                .email("ramesh@gmail.com")
//                .designation("front end java")
//                .build();
//
//        // when - action or behaviour that we are going test
//        ResultActions response = mockMvc.perform(post("/user/post")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(userSaveEntity)));
//
//        // then - verify the result or output using assert statements
//        response.andDo(print()).
//                andExpect(status().isCreated())
//                .andExpect((ResultMatcher) jsonPath("$.name",
//                        is(userSaveEntity.getName())))
//                .andExpect((ResultMatcher) jsonPath("$.designation",
//                        is(userSaveEntity.getDesignation())))
//                .andExpect((ResultMatcher) jsonPath("$.email",
//                        is(userSaveEntity.getEmail())));
//
//    }
//
//}
