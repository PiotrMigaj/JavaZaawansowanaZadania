package pl.migibud.hibernate.ex6;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        ProjectService projectService = new ProjectService(new ProjectDAODB());

        int randId = new Random().nextInt(99);
        Project project = new Project("Project #"+randId,new Date());

        projectService.persist(project);

        List<Project> projectList = projectService.findAll();

        projectList.stream().forEach(System.out::println);

    }
}
