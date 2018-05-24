package com.awews.language;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TranslationService {
	@Autowired
	private TranslationRepository translationRepository;
	
	public List<Translation> getAllTranslations() {
		List<Translation> translations = new ArrayList<>();
		translationRepository.findAll()
			.forEach(translations::add);
		return translations;
	}
	
	public Translation getTranslationById(String id) {
//		return translations.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return translationRepository.findOne(id);
	}
	
//	doesn't work
	public Translation getTranslationBySpanishSlug(String spanishSlug) {
//		return translations.stream().filter(n -> n.getSpanishSlug().equals(spanishSlug)).findFirst().get();
		return translationRepository.findOne(spanishSlug);
		
	}

	public Translation addTranslation(Translation translation) {
		// TODO Auto-generated method stub
//		translations.add(translation);
//		return translation;
		translationRepository.save(translation);
		return translation;
		
	}

	public Translation updateTranslation(String id, Translation translation) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < translations.size(); i++) {
//			Course t = translations.get(i);
//			if (t.getId().equals(id)) {
//				translations.set(i, translation);
//				return translation;
//			}
//		}
//		return translation;
		return translationRepository.save(translation);
	}

//	public Course deleteTranslation(String id) {
//		Course translation = null;
//		// TODO Auto-generated method stub
//		translations.removeIf(t -> t.getId().equals(id));
//		
//		return translation;
//	}
	
	public void deleteTranslation(String id) {
		// TODO Auto-generated method stub
//		translations.removeIf(t -> t.getId().equals(id));
		translationRepository.delete(id);
		
	}

}
