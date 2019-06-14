package com.start.web.entities;

import javax.persistence.*;

@Entity
@Table(name="tbl_user")//指定对应的数据表，不标 默认为类名小写
public class User {
    private Integer id;
    private  String lasrName;
    @Column(name="email")
    private  String  email;
    @Id
    public Integer getId() {
        return id;
    }
    @Column(name="last_name",length = 50)
    public String getLasrName() {
        return lasrName;
    }

    public String getEmail() {
        return email;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setLasrName(String lasrName) {
        this.lasrName = lasrName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
