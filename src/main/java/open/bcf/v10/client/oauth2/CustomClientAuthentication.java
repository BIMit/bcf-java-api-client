package open.bcf.v10.client.oauth2;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.util.Preconditions;

import java.io.IOException;

public class CustomClientAuthentication
        implements
        HttpRequestInitializer,
        HttpExecuteInterceptor {

    /** Client identifier issued to the client during the registration process. */
    private final String clientId;

    /** Client secret or {@code null} for none. */
    private final String clientSecret;

    /**
     * @param clientId client identifier issued to the client during the registration process
     * @param clientSecret client secret or {@code null} for none
     */
    public CustomClientAuthentication(String clientId, String clientSecret) {
        this.clientId = Preconditions.checkNotNull(clientId);
        this.clientSecret = clientSecret;
    }

    public void initialize(HttpRequest request) throws IOException {
        request.setInterceptor(this);
    }

    public void intercept(HttpRequest request) throws IOException {
        request.getHeaders().setBasicAuthentication(clientId, clientSecret);
    }

}
