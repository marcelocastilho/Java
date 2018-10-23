package tests.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa","bbbbbb","ccccccccc");

		list.stream()
		.filter(s -> s.length() > 1)
		.forEach(System.out::println);

		OptionalDouble media = list.stream()
				.mapToInt(String::length)
				.average();
		
		int sum = list.stream().mapToInt(String::length).sum();

		System.out.println(media.orElse(0));
		System.out.println(sum);
	}


}

