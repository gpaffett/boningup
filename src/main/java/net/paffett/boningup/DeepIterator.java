package net.paffett.boningup;

import java.util.Iterator;

public class DeepIterator<E> implements Iterator<E> {

	private int parentPosition = 0;
	private int childPosition = 0;

	private E[][] intArray;

	public DeepIterator(E[][] intArray) {
		this.intArray = intArray;
	}

	private int lastIndex(E[] array) {
		return array.length - 1;
	}

	private int lastIndex(E[][] array) {
		return array.length - 1;
	}

	@Override
	public boolean hasNext() {
		return childPosition <= lastIndex(intArray[parentPosition])
				|| parentPosition < lastIndex(intArray);
	}

	@Override
	public E next() {
		E tmp;
		if (hasNext()) {
			if (childPosition == this.intArray[parentPosition].length) {
				childPosition = 0;
				parentPosition++;
			}
			tmp = this.intArray[parentPosition][childPosition];
			childPosition++;
		} else {
			tmp = null;
		}

		return tmp;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Integer[][] listOfList = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },
				{ 10, 11, 12 } };

		Iterator<Integer> dp = new DeepIterator<Integer>(listOfList);

		System.out.println("----START-------");
		while (dp.hasNext()) {
			Integer i = dp.next();
			System.out.println(i);
		}
		System.out.println("----END-------");

	}

}