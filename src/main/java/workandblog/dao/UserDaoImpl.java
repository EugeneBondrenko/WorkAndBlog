package workandblog.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import workandblog.entity.UserRegistration;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public Long create(UserRegistration userRegistration) {
        return (Long) factory.getCurrentSession().save(userRegistration);
    }


    @Override
    public List <UserRegistration> userList(){
        List <UserRegistration> user = (List<UserRegistration>) factory.getCurrentSession()
                .createQuery("FROM UserRegistration").list();
        return user;
    }

    @Override
    public void updateUser(UserRegistration user) {
        factory.getCurrentSession().update(user);
    }

    @Override
    public void removeBook(long id) {

        Session session = factory.getCurrentSession();

                                                        //load
        UserRegistration user = (UserRegistration) session.get(UserRegistration.class, id);

        if (user != null){
            session.delete(user);
        }
    }

    @Override
    public UserRegistration getUserById(Long id) {

        Session session = factory.getCurrentSession();
        UserRegistration user = (UserRegistration) session.load(UserRegistration.class,id);
        return user;
    }
}
