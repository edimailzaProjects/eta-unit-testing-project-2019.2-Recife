package school.cesar.eta.unit.utils;

import school.cesar.eta.unit.Person;

public class FakePerson extends Person{
	
	@Override
	 public boolean isFamily(Person person) {
		return true;
	}
}