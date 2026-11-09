# Journal


# Phase 1

I created an abstract DigitalMonster class with name, level, and element fields. I also created FlameMonster and AquaMonster subclasses with their own attack methods.

Java prevents me from creating a DigitalMonster object because it is abstract. It is meant to be a blueprint for specific monster types.

# Phase 2

I created Flyable and Electric interfaces for special monster abilities. StormBird implements both interfaces.

Using interfaces is more flexible because not every monster needs to fly or use electricity. Each monster can have only the abilities it needs.

# Phase 3

I created an ArrayList to store four different monsters. I used a for-each loop to make every monster perform its own attack.

Polymorphism lets different monster classes share one list because they all extend DigitalMonster. This makes the catalog easier to manage.

# Phase 4

I added an ability scanner using instanceof. It checks whether a monster implements Flyable before calling its fly method.

This would be useful in a game with a flying-only area. The game could check which monsters are able to enter that area.

# Phase 5

I tested my Cyber-Dex program with four different monsters. All monsters performed their correct attacks, and the scanner only identified Thunderwing as capable of flight.

I also tested the electric ability, and Thunderwing successfully used its shock method. I did not find any major bugs during testing.

Using abstract classes, interfaces, and polymorphism helped me organize the program and made it easier to add different monsters and abilities.
