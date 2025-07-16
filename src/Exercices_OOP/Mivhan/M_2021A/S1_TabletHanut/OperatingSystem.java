package Exercices_OOP.Mivhan.M_2021A.S1_TabletHanut;// import unit4.collectionsLib.Node;

public enum OperatingSystem {
    IOS('I'),
    ANDROID('A'),
    WINDOWS('W');
    private final char code;
    OperatingSystem(char code){
        this.code = code;
    }

    // Статический метод для преобразования char в enum
    public static OperatingSystem fromCode(char code){
        for (OperatingSystem os: values()){
            if (os.code == Character.toUpperCase(code)){
                return os;
            }
        }
        // Если подходящий код не найден, выбрасываем исключение
        throw new IllegalArgumentException("Неизвестный код операционной системы: " + code);
    }
}
