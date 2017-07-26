package queue.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicTest {

	@Test
	public void test() {
		Integer int1 = Integer.valueOf("100");
        Integer int2 = Integer.valueOf("100");
        System.out.println(int1 == int2);
        Integer int3 = Integer.valueOf("200");
        Integer int4 = Integer.valueOf("200");
        System.out.println(int3 == int4);
	}
	
	public static void main(String[] args) {
        Integer int1 = Integer.valueOf("100");
        Integer int2 = Integer.valueOf("100");
        System.out.println(int1 == int2);
        Integer int3 = Integer.valueOf("200");
        Integer int4 = Integer.valueOf("200");
        System.out.println(int3 == int4);
    }

}
