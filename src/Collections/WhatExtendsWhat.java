package Collections;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Deque;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentMap;

public class WhatExtendsWhat {

	public static void main(String[] args) {
		/**
		 * 1.interface Iterable<T>.
		 * 2.interface Collection<E> extends Iterable<E>.
		 * 3.interface List<E> extends Collection<E>.
		 * 4.abstract class AbstractCollection<E> implements Collection<E>.
		 * 5.abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>. 
		 * 6.abstract class AbstractSequentialList<E> extends AbstractList<E>. 
		 * 7.class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable.
		 * 8.class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable.
		 * 8(a).class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable.
		 * 8(b).class Stack<E> extends Vector<E>.
		 * 
		 * 
		 * 9.interface Set<E> extends Collection<E>.
		 * 10.abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E>.
		 * 11.class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable.
		 * 12.class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, java.io.Serializable.
		 * 13.interface SortedSet<E> extends Set<E>.
		 * 13(a).interface NavigableSet<E> extends SortedSet<E>.
		 * 14.class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, java.io.Serializable.
		 * 
		 * 
		 * 15.interface Queue<E> extends Collection<E>.
		 * 16.abstract class AbstractQueue<E> extends AbstractCollection<E> implements Queue<E>.
		 * 16(a).interface Deque<E> extends Queue<E>.
		 * 17.class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable.
		 * 18.class PriorityQueue<E> extends AbstractQueue<E> implements java.io.Serializable.
		 * 19.abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable.
		 * 19(a).abstract class EnumSet<E extends Enum<E>> extends AbstractSet<E> implements Cloneable, java.io.Serializable.
		 * 
		 * 
		 * 19(b).interface Comparable<T>.
		 * 19(c).interface Comparator<T>.
		 * 
		 * 
		 * 20.interface Map<K,V>.
		 * 21.abstract class AbstractMap<K,V> implements Map<K,V>.
		 * 22.interface SortedMap<K,V> extends Map<K,V>.
		 * 23.interface NavigableMap<K,V> extends SortedMap<K,V>.
		 * 24.class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, java.io.Serializable.
		 * 25.class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable.
		 * 26.class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>.
		 * 27.class EnumMap<K extends Enum<K>, V> extends AbstractMap<K, V> implements java.io.Serializable, Cloneable.
		 * 28.class WeakHashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>.
		 * 29.class IdentityHashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, java.io.Serializable, Cloneable.
		 * 30.interface ConcurrentMap<K, V> extends Map<K, V>.
		 * 31.class ConcurrentHashMap<K,V> extends AbstractMap<K,V> implements ConcurrentMap<K,V>, Serializable.
		 * 32.class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, java.io.Serializable.
		 * 33.abstract class Dictionary<K,V>.
		 * 34.
		 **/
		
	}

}
