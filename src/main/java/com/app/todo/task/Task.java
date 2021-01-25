package com.app.todo.task;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Task {
    @Id
    private ObjectId _id;
    private String taskName;
    private Long startDate;
    private Long endDate;
    private String priority;
    private ObjectId assigneeId;
    private String status;
    private ObjectId projectId;
    private ObjectId userId;
    private Long createDate;
    private Long modifiedDate;

    public Task(ObjectId _id, String taskName, Long startDate, Long endDate, String priority, ObjectId assigneeId, String status, ObjectId projectId, ObjectId userId, Long createDate, Long modifiedDate) {
        this._id = _id;
        this.taskName = taskName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.assigneeId = assigneeId;
        this.status = status;
        this.projectId = projectId;
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

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public ObjectId getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(ObjectId assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ObjectId getProjectId() {
        return projectId;
    }

    public void setProjectId(ObjectId projectId) {
        this.projectId = projectId;
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
        Task task = (Task) o;
        return Objects.equals(_id, task._id) && Objects.equals(taskName, task.taskName) && Objects.equals(startDate, task.startDate) && Objects.equals(endDate, task.endDate) && Objects.equals(priority, task.priority) && Objects.equals(assigneeId, task.assigneeId) && Objects.equals(status, task.status) && Objects.equals(projectId, task.projectId) && Objects.equals(userId, task.userId) && Objects.equals(createDate, task.createDate) && Objects.equals(modifiedDate, task.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, taskName, startDate, endDate, priority, assigneeId, status, projectId, userId, createDate, modifiedDate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "_id=" + _id +
                ", taskName='" + taskName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", priority='" + priority + '\'' +
                ", assigneeId=" + assigneeId +
                ", status='" + status + '\'' +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", createDate=" + createDate +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
