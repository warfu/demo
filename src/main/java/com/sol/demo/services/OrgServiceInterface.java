package com.sol.demo.services;

import com.sol.demo.entity.Org.Org;

import java.util.List;

public interface OrgServiceInterface {
    List<Org> findall();
    void updateByid(int id,String name);
}
