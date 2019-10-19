package cn.hdj.flyweight;

/**
 * @author hdj
 * @Description: 考试
 * @Version 1.0
 */
public class SignInfo {
    @Override
    public String toString() {
        return "SignInfo{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", subject='" + subject + '\'' +
                ", postAddress='" + postAddress + '\'' +
                '}';
    }

    //报名人员的ID
    private String id;
    //考试地点
    private String location;
    //考试科目
    private String subject;
    //邮寄地址
    private String postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
