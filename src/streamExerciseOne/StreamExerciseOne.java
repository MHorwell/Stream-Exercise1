package streamExerciseOne;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamExerciseOne {
	public static void main(String[] args) {
		List<String>daleIntro = Arrays.asList("Hello", "It's", "Dale");
		List<String>scaryDaleIntro;
		scaryDaleIntro = daleIntro.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
		System.out.println(daleIntro);
		System.out.println(scaryDaleIntro);
	}
}