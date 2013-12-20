/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImageFormatTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord> {

	private static final long serialVersionUID = -444934114;

	/**
	 * The singleton instance of <code>dstack.image_format</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.tables.ImageFormatTable IMAGE_FORMAT = new io.github.ibuildthecloud.dstack.core.tables.ImageFormatTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord.class;
	}

	/**
	 * The column <code>dstack.image_format.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.image_format.template_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord, java.lang.Long> TEMPLATE_ID = createField("template_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.image_format.format</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord, java.lang.String> FORMAT = createField("format", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this);

	/**
	 * The column <code>dstack.image_format.data</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DataConverter()), this);

	/**
	 * Create a <code>dstack.image_format</code> table reference
	 */
	public ImageFormatTable() {
		super("image_format", io.github.ibuildthecloud.dstack.core.DstackTable.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.image_format</code> table reference
	 */
	public ImageFormatTable(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.core.DstackTable.DSTACK, io.github.ibuildthecloud.dstack.core.tables.ImageFormatTable.IMAGE_FORMAT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.Keys.IDENTITY_IMAGE_FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.Keys.KEY_IMAGE_FORMAT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.tables.records.ImageFormatRecord>>asList(io.github.ibuildthecloud.dstack.core.Keys.KEY_IMAGE_FORMAT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.tables.ImageFormatTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.tables.ImageFormatTable(alias);
	}
}