package com.kyro.pojo;

import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Task {

    private String taskId;
    private String taskName;
    private String taskType;
    private Date startDate;
    private Date endDate;
    private Integer completionTime;
    private String taskPriority;
    private Task dependentTask;
    private List<Task> subTask;
    private String currentStatus;
    private String projectId;


}
