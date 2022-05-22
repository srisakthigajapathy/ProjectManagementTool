package com.kyro.service;

import com.kyro.pojo.Project;
import com.kyro.pojo.ProjectMember;
import com.kyro.pojo.Task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectManagementService {
    List<Project> projectList=new ArrayList<>();
    List<ProjectMember> projectMemberList=new ArrayList<>();
    List<Task> taskList=new ArrayList<>();
    List<Task> subTaskList=new ArrayList<>();

   public void loadProjectInfo(){
       projectList.add(new Project
               ("1","Verizon","Xo-migration",
                       "22/05/2022","22/12/2022","Network related project",
                       "","","X",20));
       projectList.add(new Project
               ("2","CitiBank","Mobius",
                       "22/05/2022","22/12/2022","Network related project",
                       "","","X",20));


       projectMemberList.add(new ProjectMember("1","A","Developer",
               "1","Lead developer","10"));
       projectMemberList.add(new ProjectMember("2","B","BA",
               "1","Senior Analyst","10"));
       projectMemberList.add(new ProjectMember("3","C","Db Admin",
               "1","Senior engineer","10"));
       projectMemberList.add(new ProjectMember("4","C","Developer",
               "1","Junior engineer","10"));
       projectMemberList.add(new ProjectMember("5","C","Developer",
               "1","Senior engineer","10"));


       taskList.add(new Task("1","Create Data models","MainTask",new Date(),
               new Date(),5,"High",null,
               subTaskList,"InProgress","1"));
       taskList.add(new Task("2","Create UI pages","MainTask",new Date(),
               new Date(),20,"High",null,
               subTaskList,"InProgress","1"));
       taskList.add(new Task("3","Create backend rest api","MainTask",new Date(),
               new Date(),10,"High",null,
               subTaskList,"InProgress","1"));
       taskList.add(new Task("4","Unit Test case","MainTask",new Date(),
               new Date(),3,"High",null,
               subTaskList,"InProgress","1"));
       taskList.add(new Task("5","Testing","MainTask",new Date(),
               new Date(),4,"High",null,
               subTaskList,"InProgress","1"));
   }





}
