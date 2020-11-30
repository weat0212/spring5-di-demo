package guru.springframework.examplebeans;

/**
 * @author weat0212@gmail.com
 * @project di-demo
 * @package guru.springframework.examplebeans
 * @date 2020/11/30 下午 01:01
 */
public class FakeJmsBroker {

    private String username;
    private String password;
    private String url;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
