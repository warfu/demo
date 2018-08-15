package com.sol.demo.services;

import com.sol.demo.entity.Org.Org;
import com.sol.demo.mapper.OrgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgService implements OrgServiceInterface{

    @Autowired
    OrgMapper orgMapper;
    @Override
    public List<Org> findall() {
        //return null;
        return orgMapper.findAll();
    }

    @Override
    public void updateByid(int id, String name) {
         orgMapper.updateByid(id,name);
    }

}
