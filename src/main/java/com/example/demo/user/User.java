package com.example.demo.user;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test member")
public class User {
    @Id
    private String id;
    private String passwd;
    private String name;
    private String role;
    private boolean isEmployer;
    private boolean isEmployee;
    private boolean isAdmin;
    private Long loginFail;
    private boolean isBlocked;


    public User(String id, String passwd, String name, String role)
    {
        this.id = id;
        this.passwd = passwd;
        this.name = name;
        this.role = role;
    }

    //getter/setter를 롬복으로 안한이유가 메소드 기본 세팅이 이상해서 수동으로 구현.
    //getter
    public String getId() {
        return id;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public boolean getIsEmployer() {
        return isEmployer;
    }

    public boolean getIsEmployee() {
        return isEmployee;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public Long getLoginFail() {
        return loginFail;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    //setter
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setIsEmployer(boolean employer) {
        isEmployer = employer;
    }

    public void setIsEmployee(boolean employee) {
        isEmployee = employee;
    }

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setLoginFail(Long loginFail) {
        this.loginFail = loginFail;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
