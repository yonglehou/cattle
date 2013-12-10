/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "agent", schema = "dstack")
public class AgentRecord extends org.jooq.impl.UpdatableRecordImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.AgentRecord> implements io.github.ibuildthecloud.dstack.db.jooq.utils.TableRecordJaxb, org.jooq.Record7<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.Long, java.lang.String>, io.github.ibuildthecloud.dstack.db.jooq.generated.model.Agent {

	private static final long serialVersionUID = 1782063652;

	/**
	 * Setter for <code>dstack.agent.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dstack.agent.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>dstack.agent.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dstack.agent.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>dstack.agent.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dstack.agent.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>dstack.agent.kind</code>. 
	 */
	public void setKind(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dstack.agent.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>dstack.agent.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dstack.agent.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(4);
	}

	/**
	 * Setter for <code>dstack.agent.agent_group_id</code>. 
	 */
	public void setAgentGroupId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dstack.agent.agent_group_id</code>. 
	 */
	@javax.persistence.Column(name = "agent_group_id", precision = 19)
	@Override
	public java.lang.Long getAgentGroupId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>dstack.agent.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dstack.agent.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.Long, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map<String,Object>, java.lang.Long, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field5() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT.AGENT_GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value5() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getAgentGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getState();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AgentRecord
	 */
	public AgentRecord() {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT);
	}

	/**
	 * Create a detached, initialised AgentRecord
	 */
	public AgentRecord(java.lang.Long id, java.lang.String name, java.lang.String description, java.lang.String kind, java.util.Map<String,Object> data, java.lang.Long agentGroupId, java.lang.String state) {
		super(io.github.ibuildthecloud.dstack.db.jooq.generated.tables.AgentTable.AGENT);

		setValue(0, id);
		setValue(1, name);
		setValue(2, description);
		setValue(3, kind);
		setValue(4, data);
		setValue(5, agentGroupId);
		setValue(6, state);
	}
}
