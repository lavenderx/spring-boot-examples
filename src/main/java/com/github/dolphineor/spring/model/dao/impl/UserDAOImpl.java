package com.github.dolphineor.spring.model.dao.impl;

import com.github.dolphineor.spring.model.dao.UserDAO;
import com.github.dolphineor.spring.model.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Map;

/**
 * Created on 2015-09-12.
 *
 * @author dolphineor
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Resource
    private SessionFactory sessionFactory;


    @Override
    public Collection<UserEntity> findAll() {
        return null;
    }

    @Override
    public Collection<UserEntity> findByParams(Map<String, Object> params) {
        return null;
    }

    @Override
    public UserEntity findOne(String s) {
        return null;
    }

    @Override
    public void insert(UserEntity userEntity) {

    }

    @Override
    public void insert(Collection<UserEntity> userEntities) {

    }

    @Override
    public void update(UserEntity userEntity) {

    }

    @Override
    public void delete(String s) {

    }
}
