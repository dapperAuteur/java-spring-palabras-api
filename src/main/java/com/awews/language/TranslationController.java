package com.awews.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {
	
	@Autowired
	private TranslationService translationService;

}
