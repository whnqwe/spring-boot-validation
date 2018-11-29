package cn.zhangspace.springbootvalidation.domain;

import cn.zhangspace.springbootvalidation.config.ValidUserAddress;

import javax.validation.constraints.NotNull;

public class User {

    private Integer id;

    @NotNull
    private String name;


    @NotNull
    @ValidUserAddress
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
