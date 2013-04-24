/**
 * ServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ServiceType  {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServiceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    };

    public static final java.lang.String _ACTIVE_APP = "ACTIVE_APP";
    public static final java.lang.String _BLACKLIST = "BLACKLIST";
    public static final java.lang.String _ADDITIONAL_RULES = "ADDITIONAL_RULES";
    public static final java.lang.String _RESTRICTED = "RESTRICTED";
    public static final ServiceType ACTIVE_APP = new ServiceType(_ACTIVE_APP);
    public static final ServiceType BLACKLIST = new ServiceType(_BLACKLIST);
    public static final ServiceType ADDITIONAL_RULES = new ServiceType(_ADDITIONAL_RULES);
    public static final ServiceType RESTRICTED = new ServiceType(_RESTRICTED);
    public java.lang.String getValue() { return _value_;}
    public static ServiceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServiceType enumeration = (ServiceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServiceType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}

}
