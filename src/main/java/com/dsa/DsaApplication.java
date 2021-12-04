package com.dsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.dsa.sort.BubbleSort.bubbleSort;

@SpringBootApplication
public class DsaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
		int arr[] = {81,64,45,2,7,123,98,1,4,65,71};
		bubbleSort(arr);
	}

}
