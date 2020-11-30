package guru.springframework.examplebeans;

/**
 * @author weat0212@gmail.com
 * @project di-demo
 * @package guru.springframework.examplebeans
 * @date 2020/11/30 下午 12:28
 */
public class FakeDataSource {

    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
