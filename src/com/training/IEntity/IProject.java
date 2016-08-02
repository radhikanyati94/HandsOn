package com.training.IEntity;
import java.util.List;
import com.training.entity.*;

public interface IProject {

	public boolean  addProject(Project obj);
	public boolean[] addProjects(Project... projectList);
	public void printProjectList();
	
	public List<Project> getProjectList();
	
	
}
