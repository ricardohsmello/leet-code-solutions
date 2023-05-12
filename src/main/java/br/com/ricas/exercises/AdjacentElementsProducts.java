package br.com.ricas.exercises;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.*/
public class AdjacentElementsProducts {

    int solution(int[] inputArray) {

        Map<Integer, Integer> mapElements = new HashMap<>();
        int max = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (i == inputArray.length -1)
                break;

            int firstValue = inputArray[i] ;
            int secondValue = inputArray[i+1];

            int multipliedValue = firstValue * secondValue;

            if (i == 0 || multipliedValue > max) {
                mapElements.clear();
                mapElements.put(firstValue, secondValue);
                max = multipliedValue;
            }
        }

        int largest = 0;

        for (Map.Entry<Integer, Integer> map : mapElements.entrySet()) {
            System.out.println(map.getKey());
            largest = map.getKey() * map.getValue();
        }

        return largest;

    }

}
