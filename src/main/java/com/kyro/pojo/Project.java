package com.kyro.pojo;


import lombok.*;

@Data
@AllArgsConstructor
public class Project {
    String projectId;
    String customerName;
    String projectName;
    String startDate;
    String endDate;
    String description;
    String cost;
    String time;
    String managerName;
    Integer memberCount;

}
