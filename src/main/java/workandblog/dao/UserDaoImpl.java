package workandblog.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import workandblog.entity.UserRegistration;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory factory;

    @Override
    @Transactional
    public Long create(UserRegistration userRegistration) {

        return (Long) factory.getCurrentSession().save(userRegistration);
    }
}
