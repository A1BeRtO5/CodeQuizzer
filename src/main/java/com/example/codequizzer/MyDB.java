package com.example.codequizzer;

import java.util.HashMap;

public class MyDB {
    public HashMap<Integer, String> returnMyDB() {
        int counter = 0;
        HashMap<Integer, String> programmDB = new HashMap<>();
        programmDB.put(++counter, "Чи є різниця ++i i++ ?");
        programmDB.put(++counter, "Що таке ООП?");
        programmDB.put(++counter, "Які є принципи ООП?");
        programmDB.put(++counter, "Що таке абстракція?");
        programmDB.put(++counter, "Що таке інкапсуляція?");
        programmDB.put(++counter, "Що таке наслідування?");
        programmDB.put(++counter, "Що таке поліморфізм?");
        programmDB.put(++counter, "Що таке відношення в джава?");
        programmDB.put(++counter, "Що таке асоціація?");
        programmDB.put(++counter, "Що таке агрегація?");
        programmDB.put(++counter, "Що таке композиція?");
        programmDB.put(++counter, "Що таке клас?");
        programmDB.put(++counter, "Що таке об'єкт?");
        programmDB.put(++counter, "Що таке інтерфейс?");
        programmDB.put(++counter, "Що таке абстрактний клас?");
        programmDB.put(++counter, "В чому різниця між інтерфейсом та абстрактним класом?");
        programmDB.put(++counter, "Коли використовувати інтерфейс а коли абстрактний клас?");
        programmDB.put(++counter, "Що таке примітиви?");
        programmDB.put(++counter, "Які є види пам'ті в джава?");
        programmDB.put(++counter, "Що таке stack?");
        programmDB.put(++counter, "Що таке heap?");
        programmDB.put(++counter, "Що таке перегрузка?");
        programmDB.put(++counter, "Що таке переопреділення?");
        programmDB.put(++counter, "Що таке конструктор?");
        programmDB.put(++counter, "Що таке finalize?");
        programmDB.put(++counter, "Що таке final?");
        programmDB.put(++counter, "Що таке finally?");
        programmDB.put(++counter, "В чому різниця між finalize, final, finally?");
        programmDB.put(++counter, "Що таке enum?");
        programmDB.put(++counter, "Що таке серіалізація?");

        return programmDB;
    }
}
