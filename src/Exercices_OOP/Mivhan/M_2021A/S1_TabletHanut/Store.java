package Exercices_OOP.Mivhan.M_2021A.S1_TabletHanut;// import unit4.collectionsLib.Node;

public class Store {
    private Tablet[] tablets;
    private int[] systems;
    private int tabletCount;

    public Store(){
        tablets = new Tablet[1000];
        systems = new int[3]; // массив с 3 ячейками. НЕ 4!!!
        tabletCount=0;
    }
    public boolean addTablet(Tablet tab){
        // --- ШАГ 1: Поиск существующего товара ---
        // Проходим только по тем планшетам, которые уже есть на складе (до tabletCount)
        for (int i=0; i<this.tabletCount; i++){
            if (this.tablets[i].isSame(tab)) {
                // Товар найден. Обновляем цену на максимальную из двух.
                double newPrice = Math.max(this.tablets[i].getPrice(), tab.getPrice());
                this.tablets[i].setPrice(newPrice);
                return true;
            }
        }
        // Если мы дошли до сюда, значит, такого товара на складе нет.
        // --- ШАГ 2: Проверка, есть ли место на складе ---
        if (this.tabletCount >= this.tablets.length) {
            // Склад полон (счетчик достиг размера массива).
            return false;
        }
        // --- ШАG 3: Добавление нового товара ---
        // Место есть, и товар уникален. Добавляем его в первую свободную ячейку.
        this.tablets[this.tabletCount]=tab;
        this.tabletCount++;
        return true;
    }

    // Метод сортирует массив товаров таким образом,
    // чтобы в его начале располагались планшеты с ОС Windows,
    // за ними — с ОС Android, и в самом конце — с ОС iOS.
    // Возвращает количество свободных мест на складе.
    public int sortStore(){
    // Если на складе нет товаров (или всего один), он уже "отсортирован".
        if (this.tabletCount <= 1) {
            // Просто возвращаем количество свободных мест.
            return this.tablets.length - this.tabletCount;
        }
        // 1. Создаем временный массив размером с реальное количество планшетов.
        Tablet[] sortedTablets = new Tablet[this.tabletCount];
        int currentIndex = 0; // "Указатель" на текущую свободную ячейку в sortedTablets.
        // 2. Первый проход: ищем и копируем все планшеты с WINDOWS.
        for (int i = 0; i < this.tabletCount; i++) {
            if (this.tablets[i].getSystem() == OperatingSystem.WINDOWS) {
                sortedTablets[currentIndex] = this.tablets[i];
                currentIndex++;
            }
        }
        // 3. Второй проход: ищем и копируем все планшеты с ANDROID.
        // Они будут добавлены сразу после всех Windows-планшетов.
        for (int i = 0; i < this.tabletCount; i++) {
            if (this.tablets[i].getSystem() == OperatingSystem.ANDROID) {
                sortedTablets[currentIndex] = this.tablets[i];
                currentIndex++;
            }
        }

        // 4. Третий проход: ищем и копируем все планшеты с IOS.
        // Они окажутся в самом конце.
        for (int i = 0; i < this.tabletCount; i++) {
            if (this.tablets[i].getSystem() == OperatingSystem.IOS) {
                sortedTablets[currentIndex] = this.tablets[i];
                currentIndex++;
            }
        }
        // 5. КОПИРУЕМ ДАННЫЕ ОБРАТНО С ПОМОЩЬЮ ЦИКЛА FOR (классический способ)
        // Мы проходим по каждому элементу временного отсортированного массива
        // и копируем его на то же место в основной массив.
        for (int i = 0; i < this.tabletCount; i++) {
            this.tablets[i] = sortedTablets[i];
        }
        // 6. Возвращаем количество свободных мест.
        return this.tablets.length - this.tabletCount;
    }

    public static void main(String[] args) {

    }
}
