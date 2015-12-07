package open.bcf.v10.client.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;

public class AuthorizationCodeFlowForIabi extends AuthorizationCodeFlow {
    protected AuthorizationCodeFlowForIabi(Builder builder) {
        super(builder);
    }

    public AuthorizationCodeFlowForIabi(Credential.AccessMethod method, HttpTransport transport, JsonFactory jsonFactory, GenericUrl tokenServerUrl, HttpExecuteInterceptor clientAuthentication, String clientId, String authorizationServerEncodedUrl) {
        super(method, transport, jsonFactory, tokenServerUrl, clientAuthentication, clientId, authorizationServerEncodedUrl);
    }

    @Override
    public AuthorizationCodeTokenRequest newTokenRequest(String authorizationCode) {
        return new SimpleAuthorizationCodeTokenRequest(getTransport(), getJsonFactory(),
                new GenericUrl(getTokenServerEncodedUrl()), authorizationCode).setClientAuthentication(
                getClientAuthentication()).setRequestInitializer(getRequestInitializer()).setScopes(getScopes());
    }
}
