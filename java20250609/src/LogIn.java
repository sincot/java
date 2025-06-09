public class LogIn {
    private String username = "admin";
    private String password = "123456";

    public void logInfo(String username, String password) {
        if (!this.username.equals(username)) {
            throw new UserNameException("用户名有误");
        }
        if (!this.password.equals(password)) {
            throw new PassWordException("密码有误");
        }
        System.out.println("登录成功！");
    }

    public static void main(String[] args) {
        LogIn login = new LogIn();
        try {
            login.logInfo("admin","123456");
        } catch(UserNameException e) {
            System.out.println("用户名错误");
            e.printStackTrace();
        } catch(PassWordException e) {
            System.out.println("密码错误");
            e.printStackTrace();
        }

    }
}
