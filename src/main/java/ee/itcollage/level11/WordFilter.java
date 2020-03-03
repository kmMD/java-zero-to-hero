package ee.itcollage.level11;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    // fix tests

    public List<Word> getNouns(List<Word> words) {
        List<Word> result = new ArrayList<Word>();
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.NOUN) {
                result.add(word);
            }
        }
        return result;
    }

    public Word getFirstVerb(List<Word> words) {
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.VERB) {
                return word;
            }
        }
        return null;
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        for (Word word : words) {
            if (word.getWordType() == type) {
                return word;
            }
        }
        return null;
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        List<Word> result = new ArrayList<Word>();
        for (Word word : words) {
            if (word.getWordType() != Word.WordType.NOUN) {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> getNounStrings(List<Word> words){
        List<String> result = new ArrayList<String>();
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.NOUN) {
                result.add(word.getWord());
            }
        }
        return result;
    }

    public String getFirstVerbString(List<Word> words) {
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.VERB) {
                return word.getWord();
            }
        }
        return null;
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        for (Word word : words) {
            if (word.getWordType() == type) {
                return word.getWord();
            }
        }
        return null;
    }
}
