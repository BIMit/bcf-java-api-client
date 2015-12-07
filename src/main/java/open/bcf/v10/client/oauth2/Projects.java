package open.bcf.v10.client.oauth2;

import com.google.api.client.util.Key;

public class Projects {
    @Key("project_id")
    public String projectId;

    @Key("name")
    public String projectName;

    @Override
    public String toString() {
        return "Projects{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
