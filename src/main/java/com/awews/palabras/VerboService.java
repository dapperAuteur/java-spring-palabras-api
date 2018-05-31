package com.awews.palabras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VerboService {
	@Autowired
	private VerboRepository verboRepository;
	
	public List<Verbo> getAllVerbos() {
		List<Verbo> verbos = new ArrayList<>();
		verboRepository.findAll()
			.forEach(verbos::add);
		return verbos;
	}
	
	public Verbo getVerboBySpanish(String spanish) {
		return verboRepository.findBySpanish(spanish);
	}
	
	public Verbo getVerboById(String id) {
//		return verbos.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return verboRepository.findOne(id);
	}
	
//	doesn't work
	public Verbo getVerboBySpanishSlug(String spanishSlug) {
//		return verbos.stream().filter(n -> n.getSpanishSlug().equals(spanishSlug)).findFirst().get();
		return verboRepository.findOne(spanishSlug);
		
	}

	public Verbo addVerbo(Verbo verbo) {
		// TODO Auto-generated method stub
//		verbos.add(verbo);
//		return verbo;
		verboRepository.save(verbo);
		return verbo;
		
	}

	public Verbo updateVerbo(String id, Verbo verbo) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < verbos.size(); i++) {
//			Course t = verbos.get(i);
//			if (t.getId().equals(id)) {
//				verbos.set(i, verbo);
//				return verbo;
//			}
//		}
//		return verbo;
		return verboRepository.save(verbo);
	}

//	public Course deleteVerbo(String id) {
//		Course verbo = null;
//		// TODO Auto-generated method stub
//		verbos.removeIf(t -> t.getId().equals(id));
//		
//		return verbo;
//	}
	
	public void deleteVerbo(String id) {
		// TODO Auto-generated method stub
//		verbos.removeIf(t -> t.getId().equals(id));
		verboRepository.delete(id);
		
	}

}
