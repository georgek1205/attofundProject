package com.example.demo.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "test member")
public class Member {
    @Id
    private String id;
    private String passwd;
    private String name;

    public Member(String id, String passwd, String name) {
        this.id = id;
        this.passwd = passwd;
        this.name = name;
    }
}
