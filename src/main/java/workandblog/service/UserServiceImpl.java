package workandblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import workandblog.dao.UserDao;
import workandblog.entity.Book;
import workandblog.entity.User;
import workandblog.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;


@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao dao;


    @Override
    public void create(User user) {
        dao.create(user);
    }

    @Override
    public List<User> userList() {
        List<User> users = dao.userList();
        for (User user : users) {
            System.out.println(user);
        }
        /*
        User user = dao.getUserById(2L);
        List<Book> books = user.getBooks();
        Book bookWithIndexThree = books.get(1);

        System.out.println(bookWithIndexThree.getTitle());

        System.out.println(books.size());*/
        return users;
    }

    @Override
    public List<Book> booksListUser(Long id) {
        User user = dao.getUserById(id);
        List <Book> books = user.getBooks();
        for (Book book : books){
            System.out.println(book);
        }
        return null;
    }


    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void removeUser(Long id) {
        dao.removeUser(id);
    }

    @Override
    public User getUserById(Long id) {
        return dao.getUserById(id);
    }


}
