package com.awews.palabras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrefixSuffixRootController {
	@Autowired
	private PrefixSuffixRootService prefixSuffixRootService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/prefix-suffix-roots")
	public List<PrefixSuffixRoot> getAllPrefixSuffixRoots() {
		return prefixSuffixRootService.getAllPrefixSuffixRoots();
	}
	
	@RequestMapping("/api/ver0001/prefix-suffix-roots/{id}")
	public PrefixSuffixRoot getPrefixSuffixRootById(@PathVariable String id) {
		return prefixSuffixRootService.getPrefixSuffixRootById(id);
	}
	
	@RequestMapping("/api/ver0001/prefix-suffix-roots/word/{wordSlug}")
	public PrefixSuffixRoot getPrefixSuffixRootByWordSlug(@PathVariable String wordSlug) {
		return prefixSuffixRootService.getPrefixSuffixRootByWordSlug(wordSlug);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/prefix-suffix-roots")
	public PrefixSuffixRoot addPrefixSuffixRoot(@RequestBody PrefixSuffixRoot prefixSuffixRoot) {
		prefixSuffixRootService.addPrefixSuffixRoot(prefixSuffixRoot);
		return prefixSuffixRoot;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/prefix-suffix-roots/{id}")
	public PrefixSuffixRoot updatePrefixSuffixRoot(@RequestBody PrefixSuffixRoot prefixSuffixRoot, @PathVariable String id) {
		prefixSuffixRootService.updatePrefixSuffixRoot(id, prefixSuffixRoot);
		return prefixSuffixRoot;
	}
	
//	@RequestMapping(method=RequestMethod.DELETE, value="/prefix-suffix-roots/{id}")
//	public Course deletePrefixSuffixRoot(@PathVariable String id) {
//		prefixSuffixRootService.deletePrefixSuffixRoot(id);
//		Course prefixSuffixRoot = null;
//		return prefixSuffixRoot;
//	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/prefix-suffix-roots/{id}")
	public void deletePrefixSuffixRoot(@PathVariable String id) {
		prefixSuffixRootService.deletePrefixSuffixRoot(id);

	}
}
