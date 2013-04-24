/**
 * Language.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.igov;

public class Language  {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Language(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    };

    public static final java.lang.String _ARABIC = "ARABIC";
    public static final java.lang.String _ENGLISH = "ENGLISH";
    public static final Language ARABIC = new Language(_ARABIC);
    public static final Language ENGLISH = new Language(_ENGLISH);
    public java.lang.String getValue() { return _value_;}
    public static Language fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Language enumeration = (Language)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Language fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}

}
