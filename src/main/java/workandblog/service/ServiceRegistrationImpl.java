package workandblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import workandblog.dao.UserDao;
import workandblog.entity.Book;
import workandblog.entity.UserRegistration;

import java.util.List;


@Transactional
@Service("registrationService")
public class ServiceRegistrationImpl implements ServiceRegistration {


    @Autowired
    private UserDao dao;

    @Override
    public void create(String name, String surname, String email, String password, String compass) {

        UserRegistration userRegistration = new UserRegistration(name, surname, email, password, compass);
        dao.create(userRegistration);
    }

    @Override
    public List<UserRegistration> userList() {
        List<UserRegistration> users = dao.userList();
        for (UserRegistration user : users) {
            System.out.println(user);
        }
        UserRegistration user = dao.getUserById(2L);
        List<Book> books = user.getBooks();
        Book bookWithIndexThree = books.get(1);

        System.out.println(bookWithIndexThree.getTitle());

        System.out.println(books.size());
        return users;
    }

    @Override
    public void updateUser(UserRegistration user) {
        dao.updateUser(user);
    }

    @Override
    public void removeBook(int id) {
        dao.removeBook(id);
    }

    @Override
    public UserRegistration getUserById(Long id) {
        return dao.getUserById(id);
    }


}
