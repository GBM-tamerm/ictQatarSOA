/**
 * AgencyType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class AgencyType  {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AgencyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    };

    public static final java.lang.String _MOI = "MOI";
    public static final java.lang.String _MOL = "MOL";
    public static final java.lang.String _KAHRAMAA = "KAHRAMAA";
    public static final AgencyType MOI = new AgencyType(_MOI);
    public static final AgencyType MOL = new AgencyType(_MOL);
    public static final AgencyType KAHRAMAA = new AgencyType(_KAHRAMAA);
    public java.lang.String getValue() { return _value_;}
    public static AgencyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AgencyType enumeration = (AgencyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AgencyType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}

}
