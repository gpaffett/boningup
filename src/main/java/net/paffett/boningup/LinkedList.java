package net.paffett.boningup;

public class LinkedList<E> {

	private LinkedListElement<E> firstElement;

	public void add(E element) {
		if (null == firstElement) {
			firstElement = new LinkedListElement<E>(element);
		} else if (firstElement.hasNext()) {
			LinkedListElement<E> nextElement = firstElement.next();
			while (nextElement.hasNext()) {
				nextElement = nextElement.next();
			}
			nextElement.add(element);
		} else {
			firstElement.add(element);
		}
	}

	public int size() {
		int size;
		if (null == firstElement) {
			size = 0;
		} else {
			size = 1;
			if (firstElement.hasNext()) {
				size++;
				LinkedListElement<E> nextElement = firstElement.next();
				while (nextElement.hasNext()) {
					nextElement = nextElement.next();
					size++;
				}
			}
		}

		return size;
	}

	public E get(int index) {
		if (index >= this.size()) {
			throw new IndexOutOfBoundsException("Index " + index
					+ " doesn't is too large for this List");
		}

		E element = null;

		if (0 == index) {
			element = firstElement.get();
		} else {
			int currentIndex = 0;
			boolean indexNotFound = true;
			LinkedListElement<E> nextElement = firstElement.next();

			currentIndex++;
			if (currentIndex == index) {
				element = nextElement.get();
				indexNotFound = false;
			}

			while (indexNotFound && nextElement.hasNext()) {
				nextElement = nextElement.next();
				currentIndex++;
				if (currentIndex == index) {
					element = nextElement.get();
					indexNotFound = false;
				}
			}

		}

		return element;
	}

	private class LinkedListElement<T> {

		private LinkedListElement<T> nextElement;
		private T element;

		public LinkedListElement(T element) {
			this.element = element;
		}

		public void add(T object) {
			this.nextElement = new LinkedListElement<T>(object);
		}

		public LinkedListElement<T> next() {
			return this.nextElement;
		}

		public boolean hasNext() {
			return null != nextElement ? true : false;
		}

		public T get() {
			return element;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "LinkedListElement [element=" + element + "]";
		}

	}
}