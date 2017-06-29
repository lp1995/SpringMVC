package com.mello.spring.entity;

import javax.persistence.*;

/**
 * Created by liupeng on 2017/6/28.
 */
@Entity
@Table(name="user")
public class User {
    private int id;
    private String name;
    private String loginId;
    private String remark;

    @Id
    @Column(name="id")
    @GeneratedValue //自增
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="login_id")
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @Column(name="remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
