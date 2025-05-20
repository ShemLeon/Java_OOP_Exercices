**1 - class content**

abstract class Animal {
}

public interface IHasEggs {
    public void layingEggs();
}

public interface ICanFly {
    public void fly();
}

public class Mammal extends Animal {
}

public class Bat extends Mammal implements ICanFly {
    public void fly() {
        System.out.println("Bat can fly");
    }
}

public class Fish extends Animal implements IHasEggs {
    public void layingEggs() {
        System.out.println("Fish has eggs");
    }
}

public class Bird extends Animal implements IHasEggs, ICanFly{
    public void layingEggs() {
        System.out.println("Bird has eggs");
}
public void fly() {
    System.out.println("Bird can fly");
    }
}

**2 - work or mistake**
1. ++ `Animal a = new Bat();`        ++
2. -- `Fish f = new IHasEggs();`     ++
Приведение работает от конкретного к интерфейсу, не наоборот. 
תאמה פועלת מקונקרטי לממשק, לא להפך
3. ++ `ICanFly cf = new Bird();`     ++
   ++ `cf.fly();` // Bird can fly    ++
   ++ `cf = new Bat();`
   ++ `cf.fly();` // Bat can fly     ++
4. +- `Mammal m = new Bat();` UPCASTING +-   
   --`m.fly();` --
Не работает, потому что переменная `m` имеет тип , а не `Mammal``Bat`
При апкастинге вы теряете доступ к специфическим методам подкласса и имеете доступ только к методам, объявленным в суперклассе.
чтобы сработало - Сделать DOWNCASTING обратно к `Bat` :
`((Bat)m).fly();`
5. ++ `Animal a2 = new Bird();` UPCASTING ++
   ++ `((Bird)a2).fly();` DOWNCASTING ++  
6. +- `IHasEggs he = new Bird();`
   -- he.fly(); --
Не работает, потому что Интерфейс не содержит метод `fly()`,
только тип переменной определяет доступные методы `IHasEggs`

**3.**
//כתבו פעולה המקבלת כפרמטר מערך של בעלי חיים (מעך הפניות לעמצים מסוג ANIMAL),
ומחזירה את מספר בעלי החיים המסוגלים לעוף הנמצאים במערך.

`public int printICanFly(Animal[] animals){
    int count = 0;
    for (int i=0; i<animals.length; i++){
        if (animals[i] instanceof ICanFly) count++;
    }
    return count;
}`