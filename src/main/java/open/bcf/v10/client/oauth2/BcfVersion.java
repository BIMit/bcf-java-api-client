package open.bcf.v10.client.oauth2;

import com.google.api.client.util.Key;

public class BcfVersion {


    @Key("version_id")
    public String version;

    @Key("detailed_version")
    public String detailedVersion;

    @Override
    public String toString() {
        return "BcfVersion{" +
                "version='" + version + '\'' +
                ", detailedVersion='" + detailedVersion + '\'' +
                '}';
    }
}
