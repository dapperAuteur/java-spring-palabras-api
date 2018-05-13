package com.awews.palabras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PrefixSuffixRootService {
	@Autowired
	private PrefixSuffixRootRepository prefixSuffixRootRepository;
	
	public List<PrefixSuffixRoot> getAllPrefixSuffixRoots() {
		List<PrefixSuffixRoot> prefixSuffixRoots = new ArrayList<>();
		prefixSuffixRootRepository.findAll()
			.forEach(prefixSuffixRoots::add);
		return prefixSuffixRoots;
	}
	
	public PrefixSuffixRoot getPrefixSuffixRootById(String id) {
//		return prefixSuffixRoots.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return prefixSuffixRootRepository.findOne(id);
	}
	
//	doesn't work
	public PrefixSuffixRoot getPrefixSuffixRootByWordSlug(String wordSlug) {
//		return prefixSuffixRoots.stream().filter(n -> n.getWordSlug().equals(wordSlug)).findFirst().get();
		return prefixSuffixRootRepository.findOne(wordSlug);
		
	}

	public PrefixSuffixRoot addPrefixSuffixRoot(PrefixSuffixRoot prefixSuffixRoot) {
		// TODO Auto-generated method stub
//		prefixSuffixRoots.add(prefixSuffixRoot);
//		return prefixSuffixRoot;
		prefixSuffixRootRepository.save(prefixSuffixRoot);
		return prefixSuffixRoot;
		
	}

	public PrefixSuffixRoot updatePrefixSuffixRoot(String id, PrefixSuffixRoot prefixSuffixRoot) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < prefixSuffixRoots.size(); i++) {
//			Course t = prefixSuffixRoots.get(i);
//			if (t.getId().equals(id)) {
//				prefixSuffixRoots.set(i, prefixSuffixRoot);
//				return prefixSuffixRoot;
//			}
//		}
//		return prefixSuffixRoot;
		return prefixSuffixRootRepository.save(prefixSuffixRoot);
	}

//	public Course deletePrefixSuffixRoot(String id) {
//		Course prefixSuffixRoot = null;
//		// TODO Auto-generated method stub
//		prefixSuffixRoots.removeIf(t -> t.getId().equals(id));
//		
//		return prefixSuffixRoot;
//	}
	
	public void deletePrefixSuffixRoot(String id) {
		// TODO Auto-generated method stub
//		prefixSuffixRoots.removeIf(t -> t.getId().equals(id));
		prefixSuffixRootRepository.delete(id);
		
	}

}
