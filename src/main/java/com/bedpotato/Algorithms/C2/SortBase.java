package com.bedpotato.Algorithms.C2;

@SuppressWarnings("rawtypes")
public abstract class SortBase {
	public abstract void sort(Comparable[] a);

	@SuppressWarnings("unchecked")
	public boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	public void exch(Comparable[] a, int i, int j) {
		Comparable p = a[i];
		a[i] = a[j];
		a[j] = p;
	}

	public void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].toString());
		}
	}

	public boolean isSorted(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}
}
