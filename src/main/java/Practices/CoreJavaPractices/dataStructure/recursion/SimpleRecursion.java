package Practices.CoreJavaPractices.dataStructure.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import Practices.CoreJavaPractices.projectUtils.DateTimeUtil;

public class SimpleRecursion {
	public static void main(String[] args) {
		System.out.println("Hello therere . . . started . . .");

		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		System.out.println("the list : intList : without recursion : " + intList);
		// 1
		// printIntRec(intList);
		// 2
		printIntReverseRec(intList, new ArrayList<Integer>());
	}

	private static void printIntRec(List<Integer> input) {
		if (CollectionUtils.isEmpty(input)) {
			return;
		}
		System.out.println("-------------------------------");
		System.out.println("Input : " + input);
		System.out.println("value at " + DateTimeUtil.getCurrentTimeInEpochMiliSec() + " :: " + input.get(0));
		input.remove(0);
		System.out.println("-------------------------------");
		printIntRec(input);
		System.out.println("came here");
		System.out.println("------------printIntRec ends-------------------");
	}

	private static void printIntReverseRec(List<Integer> input, List<Integer> revResult) {
		if (CollectionUtils.isEmpty(input)) {
			return;
		}
		if (revResult==null) {
			revResult = new ArrayList<Integer>();
		}

		System.out.println("-------------------------------");
		System.out.println("Input : " + input);
		Integer curElem = input.get(0);
		System.out.println("value at " + DateTimeUtil.getCurrentTimeInEpochMiliSec() + " :: " + curElem);
		input.remove(0);
		System.out.println("-------------------------------");
		printIntReverseRec(input, revResult);
		System.out.println("came here");
		revResult.add(curElem);
		System.out.println("revResult : " + revResult + " :: curElem : " + curElem);
		System.out.println("------------printIntRec ends-------------------");
	}

}
