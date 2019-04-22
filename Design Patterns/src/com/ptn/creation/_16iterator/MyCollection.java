package com.ptn.creation._16iterator;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyCollection implements ICollection<String> {

	private String[] strList = new String[4];
	private int index = 0;

	@Override
	public void add(String e) {
		if (index < strList.length) {
			strList[index++] = e;
		} else {
			System.out.println("out of index, can not add element");
		}
	}

	@Override
	public String get(int i) {
		// 略过异常处理
		return strList[i];
	}

	@Override
	public boolean remove(int i) {
		if (i <= index) {
			strList = (String[]) IntStream.range(0, strList.length).mapToObj(e -> {
				if (e != i)
					return strList[e];
				else
					return null;
			}).filter(e -> e != null).collect(Collectors.toList()).toArray(new String[0]);
			index--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public IIterator<String> iterator() {
		return new MyIterator();
	}

	@Override
	public int size() {
		return index;
	}

	private class MyIterator implements IIterator<String> {

		private int innerIndex = 0;

		@Override
		public boolean hasNext() {
			if (innerIndex < index) {
				return true;
			} else
				return false;

		}

		@Override
		public String next() {
			return strList[innerIndex++];
		}

	}

	@Override
	public String toString() {
		return "MyCollection [strList=" + Arrays.toString(strList) + "]";
	}

}
