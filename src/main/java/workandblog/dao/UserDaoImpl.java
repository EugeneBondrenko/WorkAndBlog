package workandblog.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import workandblog.entity.Book;
import workandblog.entity.User;
import workandblog.entity.User;
import workandblog.entity.User;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public Long create(User user) {
        return (Long) factory.getCurrentSession().save(user);
    }


    @Override
    public List <User> userList(){
        List <User> user = (List<User>) factory.getCurrentSession()
                .createQuery("FROM User").list();
        return user;
    }

    @Override
    public List bookList() {
        List <Book> book = (List<Book>) factory.getCurrentSession().createQuery("FROM Book").list();
        return book;
    }

    @Override
    public void updateUser(User user) {
        factory.getCurrentSession().update(user);
    }

    @Override
    public void removeUser(long id) {

        Session session = factory.getCurrentSession();

                                                        //load
        User user =  session.get(User.class, id);

        if (user != null){
            session.delete(user);
        }
    }

    @Override
    public User getUserById(long id) {
        Session session = factory.getCurrentSession();
        User user =  session.get(User.class,id);
        return user;
    }
}
