package com.awews.language;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LanguageService {
	@Autowired
	private LanguageRepository languageRepository;
	
	public List<Language> getAllLanguages() {
		List<Language> languages = new ArrayList<>();
		languageRepository.findAll()
			.forEach(languages::add);
		return languages;
	}
	
	public Language getLanguageById(String id) {
//		return languages.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return languageRepository.findOne(id);
	}
	
//	doesn't work
	public Language getLanguageBySpanishSlug(String spanishSlug) {
//		return languages.stream().filter(n -> n.getSpanishSlug().equals(spanishSlug)).findFirst().get();
		return languageRepository.findOne(spanishSlug);
		
	}

	public Language addLanguage(Language language) {
		// TODO Auto-generated method stub
//		languages.add(language);
//		return language;
		languageRepository.save(language);
		return language;
		
	}

	public Language updateLanguage(String id, Language language) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < languages.size(); i++) {
//			Course t = languages.get(i);
//			if (t.getId().equals(id)) {
//				languages.set(i, language);
//				return language;
//			}
//		}
//		return language;
		return languageRepository.save(language);
	}

//	public Course deleteLanguage(String id) {
//		Course language = null;
//		// TODO Auto-generated method stub
//		languages.removeIf(t -> t.getId().equals(id));
//		
//		return language;
//	}
	
	public void deleteLanguage(String id) {
		// TODO Auto-generated method stub
//		languages.removeIf(t -> t.getId().equals(id));
		languageRepository.delete(id);
		
	}

}
