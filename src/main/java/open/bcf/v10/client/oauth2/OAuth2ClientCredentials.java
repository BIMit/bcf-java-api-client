package open.bcf.v10.client.oauth2;

public class OAuth2ClientCredentials {
    /** Value of the "API Key". */
    public static final String API_KEY = "OWYyOTk0NWMtMDdiYi00M2I5LTlhN2YtYWZiZDMwYTI5ZTU4";

    /** Value of the "API Secret". */
    public static final String API_SECRET = "NWVlNGEzNDYtOTJmNC00ODgwLTg1NGMtMjNjYTlkZjg5YTQw";

    /** Port in the "Callback URL". */
    public static final int PORT = 23456;

    /** Domain name in the "Callback URL". */
    public static final String DOMAIN = "localhost";

    public static void errorIfNotSpecified() {
        if (API_KEY.startsWith("Enter ") || API_SECRET.startsWith("Enter ")) {
            System.out.println(
                    "Enter API Key and API Secret from http://www.dailymotion.com/profile/developer"
                            + " into API_KEY and API_SECRET in " + OAuth2ClientCredentials.class);
            System.exit(1);
        }
    }
}
