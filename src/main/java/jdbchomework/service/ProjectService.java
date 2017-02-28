package jdbchomework.service;

import jdbchomework.dao.jdbc.ProjectsJdbcDao;
import jdbchomework.entity.Project;

import java.util.List;

public class ProjectService {

    private ProjectsJdbcDao projectsJdbcDao;

    public ProjectService(ProjectsJdbcDao projectsJdbcDao) {
        this.projectsJdbcDao = projectsJdbcDao;
    }

    public List<Project> getAll() {
        return projectsJdbcDao.getAll();
    }

    public void add(String name, int cost) {
        Project project = new Project(name, cost);
        projectsJdbcDao.add(project);
    }

    public Project getById(int id) {
        return projectsJdbcDao.getById(id);
    }

    public boolean deleteById(int id) {
        return projectsJdbcDao.deleteById(id);
    }

    public boolean updateById(int id, Project project) {
        return projectsJdbcDao.updateById(id, project);
    }

}
