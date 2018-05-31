package com.awews.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationService {
	@Autowired
	private TranslationRepository translationRepository;
	

}
