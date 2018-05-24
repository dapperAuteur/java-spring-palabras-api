package com.awews.language;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {
	@Autowired
	private TranslationService translationService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/translations")
	public List<Translation> getAllTranslations() {
		return translationService.getAllTranslations();
	}
	
	@RequestMapping("/api/ver0001/translations/{id}")
	public Translation getTranslationById(@PathVariable String id) {
		return translationService.getTranslationById(id);
	}
	
	@RequestMapping("/api/ver0001/translations/name/{spanishSlug}")
	public Translation getTranslationBySpanishSlug(@PathVariable String spanishSlug) {
		return translationService.getTranslationBySpanishSlug(spanishSlug);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/translations")
	public Translation addTranslation(@RequestBody Translation translation) {
		translationService.addTranslation(translation);
		return translation;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/translations/{id}")
	public Translation updateTranslation(@RequestBody Translation translation, @PathVariable String id) {
		translationService.updateTranslation(id, translation);
		return translation;
	}
	
//	@RequestMapping(method=RequestMethod.DELETE, value="/translations/{id}")
//	public Course deleteTranslation(@PathVariable String id) {
//		translationService.deleteTranslation(id);
//		Course translation = null;
//		return translation;
//	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/translations/{id}")
	public void deleteTranslation(@PathVariable String id) {
		translationService.deleteTranslation(id);

	}
}
