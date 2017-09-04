package workandblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workandblog.dao.UserDao;
import workandblog.entity.UserRegistration;

@Service
public class ServiceRegistrationImpl implements ServiceRegistration {


    @Autowired
    private UserDao dao;

    @Override
    public void create(String name, String surname, String email, String password, String compass) {

        UserRegistration userRegistration = new UserRegistration(name, surname, email, password, compass);
        dao.create(userRegistration);
    }
}
