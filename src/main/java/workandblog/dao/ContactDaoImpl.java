package workandblog.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import workandblog.entity.ContactFile;

import java.util.List;

@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public Long create(ContactFile contactFile) {
        return (Long) factory.getCurrentSession().save(contactFile);

    }

    @Override
    public List contactList() {
        return null;
    }
}
