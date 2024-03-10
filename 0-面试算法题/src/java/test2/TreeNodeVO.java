package test2;

import java.util.List;

public class TreeNodeVO {

    private String orgId;

    private String orgName;

    private String ParentId;

    private List<TreeNodeVO> children;

    public TreeNodeVO() {
    }

    public TreeNodeVO(String orgId, String orgName, String parentId, List<TreeNodeVO> children) {
        this.orgId = orgId;
        this.orgName = orgName;
        ParentId = parentId;
        this.children = children;
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

    public List<TreeNodeVO> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNodeVO> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TreeNodeVO{" +
                "orgId='" + orgId + '\'' +
                ", orgName='" + orgName + '\'' +
                ", ParentId='" + ParentId + '\'' +
                ", children=" + children +
                '}';
    }
}
