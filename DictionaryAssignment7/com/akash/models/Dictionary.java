package com.akash.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dictionary")
public class Dictionary {

	@Id
	@GeneratedValue
	@Column(name = "did")
	private int did;
	@Column(name = "word")
	private String word;
	@Column(name = "meaning")
	private String meaning;
	public Dictionary(){
		
	}

	public Dictionary(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + did;
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
		Dictionary other = (Dictionary) obj;
		if (did != other.did)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dictionary [did=" + did + ", word=" + word + ", meaning=" + meaning + "]";
	}

}
