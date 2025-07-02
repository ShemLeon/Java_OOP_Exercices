package Exercices_OOP._9_Enum.teory;

public enum ABC {
    ABC;
    public int i = 1;   // i=1
    {
        i++;            // i было 1, становится 2
    }
    {
        ++i;            // i было 2, становится 3
    }

    private ABC() {
        i = i++ + ++i; // СЛОЖНОЕ ВЫРАЖЕНИЕ!
        /*
        Перед выполнением: i = 3
        i++ - возвращает текущее значение (3), потом увеличивает i до 4
        ++i - сначала увеличивает i с 4 до 5, потом возвращает 5
        Сложение: 3 + 5 = 8
        Присваивание: i = 8
         */
    }
}

class Test4{
        public static void main(String[] args){
            System.out.println(ABC.ABC.i); // 8
        }
}

