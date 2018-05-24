package com.awews.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApplicantService {
	@Autowired
	private ApplicantRepository applicantRepository;
	
	public List<Applicant> getAllApplicants() {
		List<Applicant> applicants = new ArrayList<>();
		applicantRepository.findAll()
			.forEach(applicants::add);
		return applicants;
	}
	
	public Applicant getApplicantById(String id) {
//		return applicants.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return applicantRepository.findOne(id);
	}
	
//	doesn't work
	public Applicant getApplicantBySpanishSlug(String spanishSlug) {
//		return applicants.stream().filter(n -> n.getSpanishSlug().equals(spanishSlug)).findFirst().get();
		return applicantRepository.findOne(spanishSlug);
		
	}

	public Applicant addApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
//		applicants.add(applicant);
//		return applicant;
		applicantRepository.save(applicant);
		return applicant;
		
	}

	public Applicant updateApplicant(String id, Applicant applicant) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < applicants.size(); i++) {
//			Course t = applicants.get(i);
//			if (t.getId().equals(id)) {
//				applicants.set(i, applicant);
//				return applicant;
//			}
//		}
//		return applicant;
		return applicantRepository.save(applicant);
	}

//	public Course deleteApplicant(String id) {
//		Course applicant = null;
//		// TODO Auto-generated method stub
//		applicants.removeIf(t -> t.getId().equals(id));
//		
//		return applicant;
//	}
	
	public void deleteApplicant(String id) {
		// TODO Auto-generated method stub
//		applicants.removeIf(t -> t.getId().equals(id));
		applicantRepository.delete(id);
		
	}

}
