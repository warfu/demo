package com.sol.demo.entity.Org;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class OrgParam {
    @Min(value = 1,message = "{code:1001,nsg:'id不正确'}")
    private int id;
    @NotBlank(message = "{code:1002,msg:'name不能为空'}")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
