package codingbat.string1;

public class TwoChar {
    public String twoChar(String str, int index) {
        // Проверяем, можно ли извлечь строку длиной 2 символа, начиная с данного индекса
        if (index < 0 || index > str.length() - 2) {
            // Если индекс некорректен, возвращаем первые 2 символа строки
            return str.substring(0, 2);
        } else {
            // Извлекаем строку длиной 2 символа, начиная с указанного индекса
            return str.substring(index, index + 2);
        }
    }
}
