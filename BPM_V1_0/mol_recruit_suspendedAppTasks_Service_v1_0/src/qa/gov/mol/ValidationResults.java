/**
 * ValidationResults.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf210844.05 v11608142542
 */

package qa.gov.mol;

public class ValidationResults  {
    private qa.gov.mol.ValidType validResult;
    private qa.gov.mol.InValidType inValidResults;

    public ValidationResults() {
    }

    public qa.gov.mol.ValidType getValidResult() {
        return validResult;
    }

    public void setValidResult(qa.gov.mol.ValidType validResult) {
        this.validResult = validResult;
    }

    public qa.gov.mol.InValidType getInValidResults() {
        return inValidResults;
    }

    public void setInValidResults(qa.gov.mol.InValidType inValidResults) {
        this.inValidResults = inValidResults;
    }

}
