package com.app.todo.project;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document
public class Project {
    @Id
    private ObjectId _id;
    private String projectName;
    private Long startDate;
    private Long endDate;
    private String description;
    private ObjectId userId;
    private Long createDate;
    private Long modifiedDate;

    public Project(ObjectId _id, String projectName, Long startDate, Long endDate, String description, ObjectId userId, Long createDate, Long modifiedDate) {
        this._id = _id;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.userId = userId;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
        this.userId = userId;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(_id, project._id) && Objects.equals(projectName, project.projectName) && Objects.equals(startDate, project.startDate) && Objects.equals(endDate, project.endDate) && Objects.equals(description, project.description) && Objects.equals(userId, project.userId) && Objects.equals(createDate, project.createDate) && Objects.equals(modifiedDate, project.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, projectName, startDate, endDate, description, userId, createDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "Project{" +
                "_id=" + _id +
                ", projectName='" + projectName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                ", createDate=" + createDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
