package com.jaxjug;

public class Container<T> {
	private final T value;

	public Container(T obj) {
		this.value = obj;
	}
	
	public T getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		if (Math.abs(result) == result) {
			return result;
		} else {
			return new Double(Math.random() * 500).intValue();
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Container other = (Container) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Container(" + value + ")";
	}
}
