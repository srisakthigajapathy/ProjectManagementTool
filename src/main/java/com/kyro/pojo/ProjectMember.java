package com.kyro.pojo;

import lombok.*;

@Data
@AllArgsConstructor
public class ProjectMember {
    String userId;
    String userName;
    String domain;
    String projectId;
    String roleName;
    String capacity;

}
