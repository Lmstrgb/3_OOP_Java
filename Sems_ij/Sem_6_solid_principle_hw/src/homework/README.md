1. В классе `User` нарушается принцип единственной
ответственности. Методы `save()` и `report()` вынесла в
отдельные классы (у каждого класса своя зона ответсвенности).
Создала класс `UserSaver`, в него перенесла метод `save()`.
Создала класс `UserReporter`, в него перенесла метод `report()`.
2. Также в классах `User` и `Persister`, на мой взгляд,
нарушается принцип инверсии зависимостей, т.к. в классе
`User` есть зависимость от класса `Persister`, в 
котором есть метод `save()`. Поэтому класс `Persister`
удалила, т.к. ранее создала класс `UserSaver`, в 
который перенесла логику сохранения юзера.