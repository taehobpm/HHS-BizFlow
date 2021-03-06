/**
 * PSearchAndSelectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cognos.developer.schemas.rds.types._2;


/**
 * A Search and Select prompt
 */
public class PSearchAndSelectType  implements java.io.Serializable {
    /* Name of the prompt value to be filled */
    private java.lang.String name;

    /* True if this is a multi-value prompt */
    private boolean multiSelect;

    /* True if this is a range prompt. Two list box UI elements should
     * be rendered by the client. */
    private boolean range;

    /* True if this prompt must be filled in to run the report. */
    private boolean required;

    private java.lang.String id;

    private java.lang.String parameter;

    private boolean caseInsensitive;

    private boolean matchAll;

    private boolean matchAnywhere;

    /* True if this prompt should be submitted to the server immediately
     * if the value changes */
    private boolean autoSubmit;

    /* If available, the display name of the column that is being
     * prompted on */
    private java.lang.String columnName;

    private com.cognos.developer.schemas.rds.types._2.POptions[] selections;

    private com.cognos.developer.schemas.rds.types._2.POptions[] options;

    private java.lang.Object extension;

    public PSearchAndSelectType() {
    }

    public PSearchAndSelectType(
           java.lang.String name,
           boolean multiSelect,
           boolean range,
           boolean required,
           java.lang.String id,
           java.lang.String parameter,
           boolean caseInsensitive,
           boolean matchAll,
           boolean matchAnywhere,
           boolean autoSubmit,
           java.lang.String columnName,
           com.cognos.developer.schemas.rds.types._2.POptions[] selections,
           com.cognos.developer.schemas.rds.types._2.POptions[] options,
           java.lang.Object extension) {
           this.name = name;
           this.multiSelect = multiSelect;
           this.range = range;
           this.required = required;
           this.id = id;
           this.parameter = parameter;
           this.caseInsensitive = caseInsensitive;
           this.matchAll = matchAll;
           this.matchAnywhere = matchAnywhere;
           this.autoSubmit = autoSubmit;
           this.columnName = columnName;
           this.selections = selections;
           this.options = options;
           this.extension = extension;
    }


    /**
     * Gets the name value for this PSearchAndSelectType.
     * 
     * @return name   * Name of the prompt value to be filled
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PSearchAndSelectType.
     * 
     * @param name   * Name of the prompt value to be filled
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the multiSelect value for this PSearchAndSelectType.
     * 
     * @return multiSelect   * True if this is a multi-value prompt
     */
    public boolean isMultiSelect() {
        return multiSelect;
    }


    /**
     * Sets the multiSelect value for this PSearchAndSelectType.
     * 
     * @param multiSelect   * True if this is a multi-value prompt
     */
    public void setMultiSelect(boolean multiSelect) {
        this.multiSelect = multiSelect;
    }


    /**
     * Gets the range value for this PSearchAndSelectType.
     * 
     * @return range   * True if this is a range prompt. Two list box UI elements should
     * be rendered by the client.
     */
    public boolean isRange() {
        return range;
    }


    /**
     * Sets the range value for this PSearchAndSelectType.
     * 
     * @param range   * True if this is a range prompt. Two list box UI elements should
     * be rendered by the client.
     */
    public void setRange(boolean range) {
        this.range = range;
    }


    /**
     * Gets the required value for this PSearchAndSelectType.
     * 
     * @return required   * True if this prompt must be filled in to run the report.
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this PSearchAndSelectType.
     * 
     * @param required   * True if this prompt must be filled in to run the report.
     */
    public void setRequired(boolean required) {
        this.required = required;
    }


    /**
     * Gets the id value for this PSearchAndSelectType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PSearchAndSelectType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the parameter value for this PSearchAndSelectType.
     * 
     * @return parameter
     */
    public java.lang.String getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this PSearchAndSelectType.
     * 
     * @param parameter
     */
    public void setParameter(java.lang.String parameter) {
        this.parameter = parameter;
    }


    /**
     * Gets the caseInsensitive value for this PSearchAndSelectType.
     * 
     * @return caseInsensitive
     */
    public boolean isCaseInsensitive() {
        return caseInsensitive;
    }


    /**
     * Sets the caseInsensitive value for this PSearchAndSelectType.
     * 
     * @param caseInsensitive
     */
    public void setCaseInsensitive(boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }


    /**
     * Gets the matchAll value for this PSearchAndSelectType.
     * 
     * @return matchAll
     */
    public boolean isMatchAll() {
        return matchAll;
    }


    /**
     * Sets the matchAll value for this PSearchAndSelectType.
     * 
     * @param matchAll
     */
    public void setMatchAll(boolean matchAll) {
        this.matchAll = matchAll;
    }


    /**
     * Gets the matchAnywhere value for this PSearchAndSelectType.
     * 
     * @return matchAnywhere
     */
    public boolean isMatchAnywhere() {
        return matchAnywhere;
    }


    /**
     * Sets the matchAnywhere value for this PSearchAndSelectType.
     * 
     * @param matchAnywhere
     */
    public void setMatchAnywhere(boolean matchAnywhere) {
        this.matchAnywhere = matchAnywhere;
    }


    /**
     * Gets the autoSubmit value for this PSearchAndSelectType.
     * 
     * @return autoSubmit   * True if this prompt should be submitted to the server immediately
     * if the value changes
     */
    public boolean isAutoSubmit() {
        return autoSubmit;
    }


    /**
     * Sets the autoSubmit value for this PSearchAndSelectType.
     * 
     * @param autoSubmit   * True if this prompt should be submitted to the server immediately
     * if the value changes
     */
    public void setAutoSubmit(boolean autoSubmit) {
        this.autoSubmit = autoSubmit;
    }


    /**
     * Gets the columnName value for this PSearchAndSelectType.
     * 
     * @return columnName   * If available, the display name of the column that is being
     * prompted on
     */
    public java.lang.String getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this PSearchAndSelectType.
     * 
     * @param columnName   * If available, the display name of the column that is being
     * prompted on
     */
    public void setColumnName(java.lang.String columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the selections value for this PSearchAndSelectType.
     * 
     * @return selections
     */
    public com.cognos.developer.schemas.rds.types._2.POptions[] getSelections() {
        return selections;
    }


    /**
     * Sets the selections value for this PSearchAndSelectType.
     * 
     * @param selections
     */
    public void setSelections(com.cognos.developer.schemas.rds.types._2.POptions[] selections) {
        this.selections = selections;
    }


    /**
     * Gets the options value for this PSearchAndSelectType.
     * 
     * @return options
     */
    public com.cognos.developer.schemas.rds.types._2.POptions[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this PSearchAndSelectType.
     * 
     * @param options
     */
    public void setOptions(com.cognos.developer.schemas.rds.types._2.POptions[] options) {
        this.options = options;
    }

    public com.cognos.developer.schemas.rds.types._2.POptions getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, com.cognos.developer.schemas.rds.types._2.POptions _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the extension value for this PSearchAndSelectType.
     * 
     * @return extension
     */
    public java.lang.Object getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this PSearchAndSelectType.
     * 
     * @param extension
     */
    public void setExtension(java.lang.Object extension) {
        this.extension = extension;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PSearchAndSelectType)) return false;
        PSearchAndSelectType other = (PSearchAndSelectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.multiSelect == other.isMultiSelect() &&
            this.range == other.isRange() &&
            this.required == other.isRequired() &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              this.parameter.equals(other.getParameter()))) &&
            this.caseInsensitive == other.isCaseInsensitive() &&
            this.matchAll == other.isMatchAll() &&
            this.matchAnywhere == other.isMatchAnywhere() &&
            this.autoSubmit == other.isAutoSubmit() &&
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            ((this.selections==null && other.getSelections()==null) || 
             (this.selections!=null &&
              java.util.Arrays.equals(this.selections, other.getSelections()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isMultiSelect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRange() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getParameter() != null) {
            _hashCode += getParameter().hashCode();
        }
        _hashCode += (isCaseInsensitive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMatchAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMatchAnywhere() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAutoSubmit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        if (getSelections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PSearchAndSelectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "PSearchAndSelectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSelect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "multiSelect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseInsensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "caseInsensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchAll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "matchAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchAnywhere");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "matchAnywhere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoSubmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "autoSubmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "columnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "selections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", ">selections"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "options"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/rds/types/2", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
