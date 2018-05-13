package com.awews.palabras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FourLetterWordService {
	@Autowired
	private FourLetterWordRepository fourLetterWordRepository;
	
	public List<FourLetterWord> getAllFourLetterWords() {
		List<FourLetterWord> fourLetterWords = new ArrayList<>();
		fourLetterWordRepository.findAll()
			.forEach(fourLetterWords::add);
		System.out.println(fourLetterWords);
		System.out.println("fourLetterWords");
		return fourLetterWords;
	}
	
	public FourLetterWord getFourLetterWordById(String id) {
//		return fourLetterWords.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return fourLetterWordRepository.findOne(id);
	}
	
//	doesn't work
	public FourLetterWord getFourLetterWordByWordSlug(String wordSlug) {
//		return fourLetterWords.stream().filter(n -> n.getWordSlug().equals(wordSlug)).findFirst().get();
		return fourLetterWordRepository.findOne(wordSlug);
		
	}

	public FourLetterWord addFourLetterWord(FourLetterWord fourLetterWord) {
		// TODO Auto-generated method stub
//		fourLetterWords.add(fourLetterWord);
//		return fourLetterWord;
		fourLetterWordRepository.save(fourLetterWord);
		return fourLetterWord;
		
	}

	public FourLetterWord updateFourLetterWord(String id, FourLetterWord fourLetterWord) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < fourLetterWords.size(); i++) {
//			Course t = fourLetterWords.get(i);
//			if (t.getId().equals(id)) {
//				fourLetterWords.set(i, fourLetterWord);
//				return fourLetterWord;
//			}
//		}
//		return fourLetterWord;
		return fourLetterWordRepository.save(fourLetterWord);
	}

//	public Course deleteFourLetterWord(String id) {
//		Course fourLetterWord = null;
//		// TODO Auto-generated method stub
//		fourLetterWords.removeIf(t -> t.getId().equals(id));
//		
//		return fourLetterWord;
//	}
	
	public void deleteFourLetterWord(String id) {
		// TODO Auto-generated method stub
//		fourLetterWords.removeIf(t -> t.getId().equals(id));
		fourLetterWordRepository.delete(id);
		
	}

}
