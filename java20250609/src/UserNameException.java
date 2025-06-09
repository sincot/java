// 自己实现一个用户名异常
public class UserNameException extends RuntimeException {
    public UserNameException() {
    }

    public UserNameException(String message) {
        super(message);
    }
}

