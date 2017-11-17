package workandblog.enums;

public enum MainPathEnum {
    mainPath("opt/tomcat/webapps/workandblog/"),
    mainWebPath("http://http://localhost:8082/");

    private String value;

    MainPathEnum(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}