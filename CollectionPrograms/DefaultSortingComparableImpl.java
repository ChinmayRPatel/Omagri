package CollectionPrograms;

import java.util.*;

public class DefaultSortingComparableImpl  implements Comparable<DefaultSortingComparableImpl>{
    private String name;
    private int age;
    public DefaultSortingComparableImpl( String name, int age){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public int compareTo(DefaultSortingComparableImpl o) {
        return Integer.compare(this.age, o.age); // sorting by age
    }

    @Override
    public String toString() {
        return this.name + " ( "+  age+" ) " ;

    }

    public static void main(String[] args) {
        List<DefaultSortingComparableImpl> obj = new ArrayList<DefaultSortingComparableImpl>();
        obj.add(new DefaultSortingComparableImpl("B",2));
        obj.add(new DefaultSortingComparableImpl("A",12));
        obj.add(new DefaultSortingComparableImpl("C",23));
        obj.add(new DefaultSortingComparableImpl("D",11));
        obj.add(new DefaultSortingComparableImpl("F",112));
        obj.add(new DefaultSortingComparableImpl("E",12));
        obj.add(new DefaultSortingComparableImpl("H",15));
        Collections.sort(obj);
        System.out.println(obj.toString());

    }

}
