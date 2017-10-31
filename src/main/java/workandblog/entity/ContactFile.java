package workandblog.entity;


import javax.persistence.*;

@Entity
@Table(name = "contactFile")
public class ContactFile {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long userId;

    @Column
    private String contactName;

    @Column
    private String contactSurName;

    @Column
    private String number;

    @Column
    private String contactInfo;

    @Column
    private String originalFileName;

    @Column
    private String fileName;


    public ContactFile() {
    }

    public ContactFile(Long userId, String contactName, String contactSurName, String number, String contactInfo, String oroginalFileName, String fileName) {

        this.userId = userId;
        this.contactName = contactName;
        this.contactSurName = contactSurName;
        this.number = number;
        this.contactInfo = contactInfo;
        this.originalFileName = oroginalFileName;
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactSurName() {
        return contactSurName;
    }

    public void setContactSurName(String contactSurName) {
        this.contactSurName = contactSurName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getOroginalFileName() {
        return originalFileName;
    }

    public void setOroginalFileName(String oroginalFileName) {
        this.originalFileName = oroginalFileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "ContactFile{" +
                "id=" + id +
                ", userId=" + userId +
                ", contactName='" + contactName + '\'' +
                ", contactSurName='" + contactSurName + '\'' +
                ", number=" + number +
                ", contactInfo='" + contactInfo + '\'' +
                ", oroginalFileName='" + originalFileName + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
