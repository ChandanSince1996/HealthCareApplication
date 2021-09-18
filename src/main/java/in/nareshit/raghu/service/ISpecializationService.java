package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.entity.Specialization;

public interface ISpecializationService {
	
	public long savaSpecialization(Specialization spec);
	public List<Specialization> getAllSpecialization();
	public void removeSpecialization(Long id);
	public Specialization getOneSpecialization(Long id);
	public void updateSpecialization(Specialization spec);

}
