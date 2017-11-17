/*
package workandblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import workandblog.dao.ContactDao;
import workandblog.entity.ContactFile;

import java.util.List;


@Transactional
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contact;



    @Override
    public void create(Long userId, String contactName, String contactSurName, String number, String contactInfo, String originalFileName, String fileName) {
        ContactFile contactFile = new ContactFile(userId, contactName, contactSurName, number, contactInfo, originalFileName, fileName);
        contact.create(contactFile);
    }

    @Override
    public List<ContactFile> contactList() {
        return null;
    }
}
*/
