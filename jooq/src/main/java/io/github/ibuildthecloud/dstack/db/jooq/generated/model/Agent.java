/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "agent", schema = "dstack")
public interface Agent extends java.io.Serializable {

	/**
	 * Getter for <code>dstack.agent.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Getter for <code>dstack.agent.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Getter for <code>dstack.agent.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Getter for <code>dstack.agent.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Getter for <code>dstack.agent.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Getter for <code>dstack.agent.agent_group_id</code>. 
	 */
	@javax.persistence.Column(name = "agent_group_id", precision = 19)
	public java.lang.Long getAgentGroupId();

	/**
	 * Getter for <code>dstack.agent.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	public java.lang.String getState();
}
