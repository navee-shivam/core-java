package com.corejava.collectionFW;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.corejava.collectionFW.ListCreation.NaveenList;
import com.corejava.collectionFW.ListCreation.NaveenListInterface;

public class ListsImpl {

	public static void main(String[] args) {
		Iterator<String> a = getArrayList().iterator();
		System.out.println("ArrayList : --> ");
		while (a.hasNext()) {
			System.out.println(a.next());
		}
		System.out.println("LinkedList : --> ");
		for (String values : getLinkedList()) {
			System.out.println(values);
		}
		System.out.println("My created List : --> ");

		System.out.println(createdOwnList());
	}

	private static AbstractList<String> getArrayList() {
		AbstractList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("F");
		arrayList.add("B");
		arrayList.add("1");
		arrayList.add("A");
		return arrayList;
	}

	private static AbstractSequentialList<String> getLinkedList() {
		AbstractSequentialList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("F");
		linkedList.add("B");
		linkedList.add("1");
		linkedList.add("A");
		return linkedList;
	}

	private static NaveenListInterface<String> createdOwnList() {
		NaveenListInterface<String> naveList = new NaveenList<>();
		naveList.add("W");
		naveList.add("S");
		naveList.add("B");
		naveList.add("1");
		naveList.add("A");
		System.out.println(naveList.findByIndex(1));
//		System.out.println(naveList.removeAll());
		System.out.println(naveList.sizeOfList());
		return naveList;
	}

}
