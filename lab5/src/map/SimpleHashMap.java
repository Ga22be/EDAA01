package map;

public class SimpleHashMap<K, V> implements Map<K, V> {
	private static final double loadFactor = 0.75;
	private Entry<K, V>[] table;
	private int capacity;
	private int size;

	/**
	 * Constructs an empty hashmap with the default initial capacity (16) and
	 * the default load factor (0.75).
	 */
	public SimpleHashMap() {
		capacity = 16;
		table = (Entry<K, V>[]) new Entry[capacity];
		size = 0;
	}

	/**
	 * Constructs an empty hashmap with the specified initial capacity and the
	 * default load factor (0.75).
	 */
	public SimpleHashMap(int capacity) {
		this.capacity = capacity;
		table = (Entry<K, V>[]) new Entry[capacity];
		size = 0;
	}

	@Override
	public V get(Object arg0) {
		K key = (K) arg0;
		int index = index(key);
		if (index > -1) {
			return find(index, key).value;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		int index = index(key);
		if (index == -1) {
			if ((((double) size) / capacity) > loadFactor) {
				rehash();
			}
			int hashCode = key.hashCode();
			if (hashCode < 0) {
				hashCode *= -1;
			}
			index = hashCode % table.length;
			Entry<K, V> newRoot = new Entry<K, V>(key, value);
			newRoot.next = table[index];
			table[index] = newRoot;
			size++;

		} else {
			return find(index, key).setValue(value);

		}
		return null;
	}

	@Override
	public V remove(Object arg0) {
		// TODO Finnish remove method
		// 1. Listan är null.
		// 2. key finns i det första elementet i listan.
		// 3. key finns senare i listan.
		// 4. key finns inte i listan.
		if (!isEmpty()) {
			K key = (K) arg0;
			int index = index(key);
			if (index > -1) {
				Entry<K, V> e = table[index];
				// Om första objektet i listan
				if (e.key.equals(key)) {
					table[index] = e.next;
					size--;
					return e.value;
				}
				while (e.next != null) {
					if (e.next.key.equals(key)) {
						Entry<K, V> temp = e.next;
						e.next = e.next.next;
						size--;
						return temp.value;
					}
					e = e.next;
				}
			}
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	public String show() {
		// table[3] = (Entry<K, V>) new Entry<Integer, String>(8, "Erik");
		// table[3].next = (Entry<K, V>) new Entry<Integer, String>(9,
		// "Pontus");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < table.length; i++) {
			sb.append(i + "\t");
			if (table[i] != null) {
				Entry<K, V> e = table[i];
				while (e != null) {
					sb.append(e.toString() + ", ");
					e = e.next;
				}
			} else {
				sb.append("empty");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	private int index(K key) {
		for (int i = 0; i < table.length; i++) {
			Entry<K, V> e = table[i];
			while (e != null) {
				if (e.key.equals(key)) {
					return i;
				}
				e = e.next;
			}
		}
		return -1;
	}

	private Entry<K, V> find(int index, K key) {
		Entry<K, V> e = table[index];
		while (e != null) {
			if (e.key.equals(key)) {
				return e;
			}
			e = e.next;
		}
		return null;
	}

	private void rehash() {
		capacity *= 2;
		Entry<K, V>[] newArray = (Entry<K, V>[]) new Entry[capacity];
		System.arraycopy(table, 0, newArray, 0, table.length);
		table = newArray;
	}

	public static class Entry<K, V> implements Map.Entry<K, V> {
		private K key;
		private V value;
		private Entry<K, V> next;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V value) {
			V temp = this.value;
			this.value = value;
			return temp;
		}

		@Override
		public String toString() {
			return key + "=" + value;
		}
	}
}
