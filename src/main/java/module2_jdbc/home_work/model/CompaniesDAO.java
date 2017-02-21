package module2_jdbc.home_work.model;

import module2_jdbc.home_work.entry.Company;
import module2_jdbc.home_work.entry.Developer;
import module2_jdbc.home_work.entry.Project;

import java.util.List;

/**
 * Created by GetFire on 21.02.2017.
 */
public interface CompaniesDAO {

    public void addCompany(Company company);
    public List<Company> getAllCompanies();
    public Company getByName(String name);
    public List<Project> getCompaniesProjects(Company company);
    public int deleteByName(String name);
    public void updateByID (int id, Company company);
    public Company getByID (int id);
    public List<Developer> getAllDevelopers (String companyName);
}
