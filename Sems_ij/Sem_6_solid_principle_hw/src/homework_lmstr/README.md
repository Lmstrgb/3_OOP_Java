### 1. Single responsibility principle. Принцип единственной ответственности.
1.1. Из класса User ->  в класс Persister метод report <br>
1.2. В классе User просто удалил метод save, а Persister persister = new Persister(user) 
перенес в Main.

### 2. и 3. Open-closed principle. Принцип открытости/закрытости и <br>Liskov substitution principles. Принцип подстановки Лисков
Пока чётко границу между 2,3,4 принципами не могу разглядеть. Но вроде как интерфейс IPersister
частично соответствует каждому из этих трёх. То есть класс Persister не используем, а используем интерфейс вместо него.