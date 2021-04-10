package pl.biomechanika.formularz;

import org.springframework.stereotype.Component;

@Component
public class MailConfig {

//spring.mail.host=poczta.interia.pl
//spring.mail.port=465
//spring.mail.username=janektester@interia.pl
//spring.mail.password=!ambdA#1981

    private String host;
    private String port;
    private String username;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

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
}
