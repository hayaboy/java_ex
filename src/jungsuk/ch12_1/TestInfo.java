package jungsuk.ch12_1;

public @interface TestInfo {
	int count() default 1;
	String[] value() default "aaa";
}
