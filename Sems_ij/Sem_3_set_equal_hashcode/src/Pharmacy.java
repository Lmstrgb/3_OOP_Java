import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Comparator<Pharmacy> {
    // public class Pharmacy{
    // private int index;
    private List<Component> components;

    public Pharmacy() {
        this.components = new ArrayList<>();
        // this.index = 0;
    }

    public List<Component> getComponents() {
        return components;
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        return this;
    }

    private int getPharmacyPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format("%s Состав: %s, сила: %s\n", getClass().getSimpleName(), this.components,
                this.getPharmacyPower());
    }

    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }

    @Override
    public int compareTo(Pharmacy o) {
        // if (this.getPharmacyPower() > o.getPharmacyPower())
        // return 10;
        // else if (this.getPharmacyPower() < o.getPharmacyPower())
        // return -10;
        // return 0;

        int dif = this.getPharmacyPower() - o.getPharmacyPower();
        if (dif != 0) return dif;

        // чем больше компанентов, тем больше Pharmacy
        dif = this.components.size() - o.components.size();
        if (dif != 0) return dif;

        // при одинаковой суммарной силе и одинаковом количестве, сравниваем по названиям
        for (int i = 0; i < this.components.size(); i++) {
            dif = this.components.get(i).getName().compareTo(o.components.get(i).getName());
            if (dif != 0) return dif;
        }

        // получается составы одинаковы
        return 0;
    }

    @Override
    public int compare(Pharmacy o1, Pharmacy o2) {
        return o1.compareTo(o2);

        // if (o1.getPharmacyPower() > o2.getPharmacyPower())
        //     return 10;
        // else if (o1.getPharmacyPower() < o2.getPharmacyPower())
        //     return -10;
        // return 0;

    }

    // @Override
    // public Iterator<Component> iterator() {
    // return new Iterator<>() {

    // @Override
    // public boolean hasNext() {
    // return index < components.size();
    // }

    // @Override
    // public Component next() {
    // // Component component = components.get(index);
    // // index++;
    // // return component;
    // return components.get(index++);
    // }

    // };
    // }

    @Override
    public boolean equals(Object obj) {
        // если ссылаются на один и тот же обект
        if (obj == this) {
            return true;
        }
        // если obj не на что нессылается или это вообще другой класс
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Pharmacy p = (Pharmacy) obj;
        // если колич компонентов разное
        if (this.components.size() != p.components.size()) return false;

        // сравниваем названия компонентов
        return compareComponentNames(p);
    }

    private boolean compareComponentNames(Pharmacy pharm) {
        for (Component component : pharm.components) {
            if (!existComponent(component)) return false;
        }
        return true;
    }

    private boolean existComponent(Component component) {
        for (Component ourComponent : this.components) {
            if (ourComponent.getName() == component.getName()) return true;
        }
        return false;
    }

//    @Override
//    public int hashCode() {
//        final int prime = 13131;
//        int result = 1;
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Component component : components) {
//            stringBuilder.append(component.getName()).append(component.getWeight());
//            result += stringBuilder.toString().hashCode();
//            stringBuilder.setLength(0);
//
//            result += prime * component.getPower();
//        }
//
//        return result;
//    }

    @Override
    public int hashCode() {
        int res = 31;
        for (Component component : components) {
            res += component.getName().hashCode() + component.getWeight().hashCode() + component.getPower();
        }
        return res;
    }

}
