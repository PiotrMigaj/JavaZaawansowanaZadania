package pl.migibud.hibernate.ex6;

import java.util.List;

public class ProjectService {

    private AbstractDAOInterface<Project> projectDAO;

    public ProjectService(AbstractDAOInterface<Project> projectDAO) {
        this.projectDAO = projectDAO;
    }

    public void persist(Project entity){
        this.projectDAO.persist(entity);
    }
    public void update(Project entity){
        this.projectDAO.update(entity);
    }
    public Project findById(Integer id){
        return this.projectDAO.findById(id);
    }
    public void delete(Project entity){
        this.projectDAO.delete(entity);
    }
    public void deleteAll(){
        this.projectDAO.deleteAll();
    }
    public List<Project> findAll(){
        return this.projectDAO.findAll();
    }
}
