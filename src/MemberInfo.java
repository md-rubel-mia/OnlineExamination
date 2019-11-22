public class MemberInfo implements MemberInfoInterface {
    
    private String fullName;
    private String userId;
    private String userName;
    private String userPassword;
    private String rollNo;
    private String mailId;
    private boolean isAdmin;
    
    MemberInfo(){
        
    }
    
    MemberInfo(MemberInfo mi){
        
        this.fullName = mi.fullName;
        this.userId = mi.userId;
        this.mailId = mi.mailId;
        this.userPassword = mi.userPassword;
        this.rollNo = mi.rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMailId() {
        return mailId;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }
    
    
    
}
