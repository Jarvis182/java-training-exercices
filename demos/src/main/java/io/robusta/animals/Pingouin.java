package io.robusta.animals;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class Pingouin {

	String name;

	public Pingouin(String name) {
		this.setName(name);
	}

	@Override
	public String toString() {
		return getName() +"****";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pingouin other = (Pingouin) obj;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
