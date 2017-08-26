package kps.config;

/**
 * Created by ramazancesur on 25/08/2017.
 */
public class NviConfigurationItem {

    private String tokenServiceEndpoint;
    private String username;
    private char[] password;

    public NviConfigurationItem() {

    }

    public NviConfigurationItem(String tokenServiceEndpoint, String username, char[] password) {
        this.tokenServiceEndpoint = tokenServiceEndpoint;
        this.username = username;
        this.password = password;
    }

    public String getTokenServiceEndpoint() {
        return tokenServiceEndpoint;
    }

    public void setTokenServiceEndpoint(String tokenServiceEndpoint) {
        this.tokenServiceEndpoint = tokenServiceEndpoint;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

}
