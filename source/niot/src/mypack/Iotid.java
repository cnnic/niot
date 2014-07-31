package mypack;

/**
 * Iotid entity. @author MyEclipse Persistence Tools
 */

public class Iotid implements java.io.Serializable {

	// Fields

	private String id;
	private String length;
	private String byte_;
	private String function;
	private Double priorProbability;

	// Constructors

	/** default constructor */
	public Iotid() {
	}

	/** minimal constructor */
	public Iotid(String id) {
		this.id = id;
	}

	/** full constructor */
	public Iotid(String id, String length, String byte_, String function,
			Double priorProbability) {
		this.id = id;
		this.length = length;
		this.byte_ = byte_;
		this.function = function;
		this.priorProbability = priorProbability;
	}

	// Property accessors

	public String getid() {
		return this.id;
	}

	public void setcode(String id) {
		this.id = id;
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getByte_() {
		return this.byte_;
	}

	public void setByte_(String byte_) {
		this.byte_ = byte_;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Double getPriorProbability() {
		return this.priorProbability;
	}

	public void setPriorProbability(Double priorProbability) {
		this.priorProbability = priorProbability;
	}

}