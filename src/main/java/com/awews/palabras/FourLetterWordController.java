package com.awews.palabras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FourLetterWordController {
	@Autowired
	private FourLetterWordService fourLetterWordService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/four-letter-words")
	public List<FourLetterWord> getAllFourLetterWords() {
		return fourLetterWordService.getAllFourLetterWords();
	}
	
	@RequestMapping("/api/ver0001/four-letter-words/{id}")
	public FourLetterWord getFourLetterWordById(@PathVariable String id) {
		return fourLetterWordService.getFourLetterWordById(id);
	}
	
	@RequestMapping("/api/ver0001/four-letter-words/word/{wordSlug}")
	public FourLetterWord getFourLetterWordByWordSlug(@PathVariable String wordSlug) {
		return fourLetterWordService.getFourLetterWordByWordSlug(wordSlug);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/four-letter-words")
	public FourLetterWord addFourLetterWord(@RequestBody FourLetterWord fourLetterWord) {
		fourLetterWordService.addFourLetterWord(fourLetterWord);
		return fourLetterWord;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/four-letter-words/{id}")
	public FourLetterWord updateFourLetterWord(@RequestBody FourLetterWord fourLetterWord, @PathVariable String id) {
		fourLetterWordService.updateFourLetterWord(id, fourLetterWord);
		return fourLetterWord;
	}
	
//	@RequestMapping(method=RequestMethod.DELETE, value="/four-letter-words/{id}")
//	public Course deleteFourLetterWord(@PathVariable String id) {
//		fourLetterWordService.deleteFourLetterWord(id);
//		Course fourLetterWord = null;
//		return fourLetterWord;
//	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/four-letter-words/{id}")
	public void deleteFourLetterWord(@PathVariable String id) {
		fourLetterWordService.deleteFourLetterWord(id);

	}
}
