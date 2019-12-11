import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

	ArrayList <Hero> heroes= new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

	heroes.add(new Hero("Black Widow", 34));
	heroes.add(new Hero("Captain America", 100));
	heroes.add(new Hero("Vision", 3));
	heroes.add(new Hero("Iron Man", 48));
	heroes.add(new Hero("Scarlet Witch", 29));
	heroes.add(new Hero("Thor", 1500));
	heroes.add(new Hero("Hulk", 49));
	heroes.add(new Hero("Doctor Strange", 42));

        // TODO 3 : It's Thor birthday, now he's 1501
	heroes.get(5).setAge(1501);
	System.out.println("the list of heroes with changed age:");
	System.out.println(heroes);

        // TODO 4 : Shuffle the heroes list
	Collections.shuffle(heroes);
	System.out.println();
	System.out.println("randomly sorted:");
	System.out.println(heroes);

        // TODO 5 : Keep only the half of the list
	System.out.println();
	System.out.println("the half of the list:");
	heroes.subList(0, heroes.size()/2).clear();
	System.out.println(heroes);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
	System.out.println();
	System.out.println("list of the remaining heroes:");for(Hero hero: heroes) {
		System.out.println(hero.getName());
	}

    }
}
/* Lösung:

the list of heroes with changed age:
[nameBlack Widow, age: 34, nameCaptain America, age: 100, nameVision, age: 3, nameIron Man, age: 48, nameScarlet Witch, age: 29, nameThor, age: 1501, nameHulk, age: 49, nameDoctor Strange, age: 42]

randomly sorted:
[nameHulk, age: 49, nameScarlet Witch, age: 29, nameBlack Widow, age: 34, nameCaptain America, age: 100, nameThor, age: 1501, nameDoctor Strange, age: 42, nameIron Man, age: 48, nameVision, age: 3]

the half of the list:
[nameThor, age: 1501, nameDoctor Strange, age: 42, nameIron Man, age: 48, nameVision, age: 3]

list of the remaining heroes:
Thor
Doctor Strange
Iron Man
Vision

*/





