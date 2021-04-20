package com.vastika.uim.repository;

import com.vastika.uim.model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveUser(User user) {
        Session session = getSession();
        session.save(user);
    }

    @Override
    public void updateUser(User user) {
        Session session = getSession();
        session.update(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = searchUserById(id);
        if(user != null) {
            Session session = getSession();
            session.delete(user);
        }
    }

    @Override
    public User searchUserById(int id) {
        Session session = getSession();
        User user = (User) session.get(User.class, id);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        Session session = getSession();

        Criteria criteria = session.createCriteria(User.class);

        return criteria.list();

    }

    @Override
    public User findUserByUsername(String username) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(User.class)
                .add(Restrictions.eq("username",username));

        return (User) criteria.uniqueResult();
    }

    @Override
    public User searchUserByEmail(String email) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(User.class)
                .add(Restrictions.eq("email",email));

        return (User) criteria.uniqueResult();
    }

    public Session getSession(){
        Session session = sessionFactory.getCurrentSession();
        if(session== null){
            session = sessionFactory.openSession();
        }
        return session;
    }
}
