package com.awews.palabras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerboController {
	@Autowired
	private VerboService verboService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/verbos")
	public List<Verbo> getAllVerbos() {
		return verboService.getAllVerbos();
	}
	
	@RequestMapping("/api/ver0001/verbos/{id}")
	public Verbo getVerboById(@PathVariable String id) {
		return verboService.getVerboById(id);
	}
	
	@RequestMapping("/api/ver0001/verbos/name/{spanishSlug}")
	public Verbo getVerboBySpanishSlug(@PathVariable String spanishSlug) {
		return verboService.getVerboBySpanishSlug(spanishSlug);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/verbos")
	public Verbo addVerbo(@RequestBody Verbo verbo) {
		verboService.addVerbo(verbo);
		return verbo;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/verbos/{id}")
	public Verbo updateVerbo(@RequestBody Verbo verbo, @PathVariable String id) {
		verboService.updateVerbo(id, verbo);
		return verbo;
	}
	
//	@RequestMapping(method=RequestMethod.DELETE, value="/verbos/{id}")
//	public Course deleteVerbo(@PathVariable String id) {
//		verboService.deleteVerbo(id);
//		Course verbo = null;
//		return verbo;
//	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/verbos/{id}")
	public void deleteVerbo(@PathVariable String id) {
		verboService.deleteVerbo(id);

	}
}
