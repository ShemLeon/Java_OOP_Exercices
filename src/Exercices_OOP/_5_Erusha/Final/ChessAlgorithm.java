package Exercices_OOP._5_Erusha.Final;

/**
 * Демонстрация использования ключевого слова final с методами
 */
public class ChessAlgorithm {
    // Enum создает тип ChessPlayer, который может иметь 
    // только два возможных значения: WHITE или BLACK.
    enum ChessPlayer { WHITE, BLACK }

    /**
     * Final метод - нельзя переопределить в подклассах
     * Всегда возвращает WHITE как первого игрока
     */
    public final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
    
    /**
     * Вложенный класс для демонстрации
     */
    public class Final_t2 {
        // Можно добавить методы и поля при необходимости
    }

    public static void main(String[] args) {
        // Создаем экземпляр основного класса ChessAlgorithm
        ChessAlgorithm chess = new ChessAlgorithm();
        
        // Получаем значение из final метода
        ChessPlayer firstPlayer = chess.getFirstPlayer();
        
        // Выводим результат
        System.out.println("Первый ход делает: " + firstPlayer);
        
        // Демонстрация работы с enum в switch
        switch(firstPlayer) {
            case WHITE:
                System.out.println("Белые фигуры ходят первыми!");
                break;
            case BLACK:
                System.out.println("Черные фигуры ходят первыми!");
                break;
        }
        
        // Вывод всех значений enum
        System.out.println("Все возможные игроки:");
        for (ChessPlayer player : ChessPlayer.values()) {
            System.out.println("- " + player);
        }
    }
}
