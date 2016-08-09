package com.training.IEntity;
import java.util.List;
import java.util.Set;

import com.training.entity.*;

public interface IProject {

	public int  addProject(Project obj);
	public int addProjects(Project... projectList);
	public void printProjectList();
	
	//public List<Project> getProjectList();
	public Set<DonorProject> getDonorList(long projectId);
	public long amountNeeded(long projectId);
	
	
	
}
