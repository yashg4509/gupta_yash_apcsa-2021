package unit11;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies {
	private Dog[] pups;

	public Doggies(int size) {
		pups = new Dog[size];
	}

	public void set(int spot, int age, String name) {
		// put a new Dog in the array at spot
		// make sure spot is in bounds

		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest() {
		Dog oldest = null;
		int max = pups[0].getAge();
		for (Dog dog : pups) {
			if (dog.getAge() > max) {
				oldest = dog;
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest() {
		Dog youngest = null;
		int min = pups[0].getAge();
		for (Dog dog : pups) {
			if (dog.getAge() < min) {
				youngest = dog;
			}
		}
		return youngest.getName();
	}

	public String toString() {
		return "" + Arrays.toString(pups);
	}
}