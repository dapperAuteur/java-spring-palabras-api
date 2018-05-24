package com.awews.language;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/languages")
	public List<Language> getAllLanguages() {
		return languageService.getAllLanguages();
	}
	
	@RequestMapping("/api/ver0001/languages/{id}")
	public Language getLanguageById(@PathVariable String id) {
		return languageService.getLanguageById(id);
	}
	
	@RequestMapping("/api/ver0001/languages/name/{spanishSlug}")
	public Language getLanguageBySpanishSlug(@PathVariable String spanishSlug) {
		return languageService.getLanguageBySpanishSlug(spanishSlug);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/languages")
	public Language addLanguage(@RequestBody Language language) {
		languageService.addLanguage(language);
		return language;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/languages/{id}")
	public Language updateLanguage(@RequestBody Language language, @PathVariable String id) {
		languageService.updateLanguage(id, language);
		return language;
	}
	
//	@RequestMapping(method=RequestMethod.DELETE, value="/languages/{id}")
//	public Course deleteLanguage(@PathVariable String id) {
//		languageService.deleteLanguage(id);
//		Course language = null;
//		return language;
//	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/languages/{id}")
	public void deleteLanguage(@PathVariable String id) {
		languageService.deleteLanguage(id);

	}
}
