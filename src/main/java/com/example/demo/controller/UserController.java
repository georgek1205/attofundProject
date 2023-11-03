package com.example.demo.controller;


import com.example.demo.employee.Employee;
import com.example.demo.user.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //이거 save()는 포스트매핑해야됨
    @GetMapping(value = "/save")
    public User createUser(@RequestParam("id") String id, @RequestParam("passwd") String passwd,
                           @RequestParam("name") String name, @RequestParam("role") String role)
    {
        User user = new User(id, passwd, name, role);
        if(role.equals("employer"))
            user.setIsEmployer(true);
        else if(role.equals("employee"))
        {
            //여기에 그 체크박스로 나와서 임플로이에대한 추가정보 입력하기. 밑에도 어드민이랑 임플로이어랑도 동일하게, 데이트는 데이트박스.
            user.setIsEmployee(true);
            Employee employee = new Employee(id, name);
        }
        else if(role.equals("admin")) {
            user.setIsAdmin(true);
        }
        user.setLoginFail(0L);

        return userService.createUser(user);
    }

    @GetMapping(value = "/findall")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/find/{id}")
    public User getUserById(@PathVariable String id)
    {
        return userService.getUserById(id);
    }
    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable String id)
    {
        userService.deleteUserById (id);
    }



}
