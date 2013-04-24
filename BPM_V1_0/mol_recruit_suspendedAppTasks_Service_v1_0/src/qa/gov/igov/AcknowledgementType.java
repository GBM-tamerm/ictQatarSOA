/**
 * AcknowledgementType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class AcknowledgementType  {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AcknowledgementType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    };

    public static final java.lang.String _TRUE = "TRUE";
    public static final java.lang.String _FALSE = "FALSE";
    public static final AcknowledgementType TRUE = new AcknowledgementType(_TRUE);
    public static final AcknowledgementType FALSE = new AcknowledgementType(_FALSE);
    public java.lang.String getValue() { return _value_;}
    public static AcknowledgementType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AcknowledgementType enumeration = (AcknowledgementType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AcknowledgementType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}

}
