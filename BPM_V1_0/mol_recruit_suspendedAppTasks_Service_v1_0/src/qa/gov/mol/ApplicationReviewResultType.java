/**
 * ApplicationReviewResultType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ApplicationReviewResultType  {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApplicationReviewResultType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    };

    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _REJECTED = "REJECTED";
    public static final java.lang.String _SUSPENDED = "SUSPENDED";
    public static final ApplicationReviewResultType APPROVED = new ApplicationReviewResultType(_APPROVED);
    public static final ApplicationReviewResultType REJECTED = new ApplicationReviewResultType(_REJECTED);
    public static final ApplicationReviewResultType SUSPENDED = new ApplicationReviewResultType(_SUSPENDED);
    public java.lang.String getValue() { return _value_;}
    public static ApplicationReviewResultType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApplicationReviewResultType enumeration = (ApplicationReviewResultType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApplicationReviewResultType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}

}
