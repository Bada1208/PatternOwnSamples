package com.patterns.creational.prototype;

public class Developer implements Copyable{
    private int id;
    private String projectName;
    private String sourceCode;

    public Developer(int id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Developer copy = new Developer(id, projectName, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
