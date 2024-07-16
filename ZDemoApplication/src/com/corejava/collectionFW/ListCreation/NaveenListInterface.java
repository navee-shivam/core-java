/**
 * 
 */
package com.corejava.collectionFW.ListCreation;

import java.util.Collection;

/**
 * @author navee
 * @param <E>
 *
 */
public interface NaveenListInterface<E> {

	public Boolean add(E e);

	public E findByIndex(int index);

	public Boolean removeElement(E e);

	public Boolean removeAll();

	public int sizeOfList();

}
