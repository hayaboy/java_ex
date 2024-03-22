package ch16_2;


@FunctionalInterface
public interface Function<T> {
	
	abstract double apply(T t); 

}
