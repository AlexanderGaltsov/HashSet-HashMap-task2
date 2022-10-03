import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;                                       // Создали переменную
    protected Set<String> words = new HashSet<>();               // Создали множество

    public WordsChecker(String text) {                           // Конструктор
        this.text = text;
        String[] part = text.split("\\P{IsAlphabetic}+");   // Разбили текст на слова и сохранили их в массив
        for (String word : part) {                                // Сохраняем в переменную элементы массива
            words.add(word);                                      // Из переменной передаем значение в множество
        }
    }

    public boolean hasWord(String findWord) {                      // Метод проверки на наличие зепрашиваемого слова
        return words.contains(findWord);                           // Проверяет есть ли запрашиваемое слово во множестве
    }
}
