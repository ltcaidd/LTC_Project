package com.ltc.mybatis.pojo;

public class Dept {
    private int deptId;
    private String deptName;

    public Dept() {
    }

    public Dept(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
