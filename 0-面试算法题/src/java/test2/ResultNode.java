package test2;

public class ResultNode {

    private String orgId;

    private String orgName;

    private String ParentId;

    public ResultNode() {
    }

    public ResultNode(String orgId, String orgName, String parentId) {
        this.orgId = orgId;
        this.orgName = orgName;
        ParentId = parentId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
    }
}
